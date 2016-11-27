package com.localhost.security.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.model.UserInfo;
import com.localhost.model.UserRole;
import com.localhost.service.IUserService;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

	@Autowired
	private IUserService userService;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
		List<Object[]> userList = (List<Object[]>) userService.findUserAllInfoByLoginId(loginId);
		if (CollectionUtils.isEmpty(userList)) {
			logger.info("User not found");
			throw new UsernameNotFoundException("Username not found");
		}

		// UserInfo userInfo = (UserInfo) user[0];
		List<String> roleTypeList = new ArrayList<String>();
		UserInfo userInfo = new UserInfo();
		for (Object[] obj : userList) {
			userInfo = (UserInfo) obj[0];
			UserRole userRole = (UserRole) obj[2];
			roleTypeList.add(userRole.getRoleType());
		}
		return new org.springframework.security.core.userdetails.User(loginId, userInfo.getPassword(), true, true, true,
				true, getGrantedAuthorities(roleTypeList));
	}

	private List<GrantedAuthority> getGrantedAuthorities(List<String> roleTypeList) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (String roleType : roleTypeList) {
			logger.info("UserRule : {}", roleType);
			authorities.add(new SimpleGrantedAuthority("ROLE_" + roleType));
		}
		logger.info("authorities : {}", authorities);
		return authorities;
	}
}
