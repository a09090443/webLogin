package com.localhost.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.dao.IUserInfoDao;
import com.localhost.dao.IUserRoleDao;
import com.localhost.model.UserInfo;
import com.localhost.model.UserRole;
import com.localhost.service.IUserService;
import com.usefulness.utils.date.DateUtils;

@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	private Integer maxId;

	@Autowired
	private IUserInfoDao userInfoDao;

	@Autowired
	private IUserRoleDao userRoleDao;

	public List<UserInfo> findAllUser() throws Exception {
		// List<UserInfo> allUsers = userInfoDao.findAll();
		return null;
	}

	@Override
	public List<Object[]> findUserAllInfoByLoginId(String loginId) {
		return userInfoDao.findUserByLoginId(loginId);
	}

	@Override
	public List<UserRole> findUserRoleAll() {
		List<UserRole> userRoleList = userRoleDao.findAll();
		return userRoleList;
	}

	@Override
	public void addUser(UserInfo userInfo) {
		Integer newId = 0;
		String getTime;
		if (null == maxId) {
			String userId = userInfoDao.findMaxId();
			if (userId.equals("0")) {
				maxId = 0;
			} else {
				maxId = Integer.valueOf(userId);
			}
		}
		newId = maxId + 1;
		getTime = DateUtils.getCurrentDate("yyyy-MM-dd hh:mm:ss");
		String formatStr = "%05d";
		String newIdStr = String.format(formatStr, newId);
		userInfo.setUserId(newIdStr);
		userInfo.setRegisterTime(getTime);
		userInfo.setLoginTime(getTime);
		try {
			userInfoDao.save(userInfo);
			maxId += 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
