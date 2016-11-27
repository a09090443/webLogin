package com.localhost.dao.impl.hibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.criterion.Restrictions;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.localhost.base.dao.impl.hibernate.BaseHibernateDAOImpl;
import com.localhost.dao.IUserInfoDao;
import com.localhost.model.UserInfo;
import com.localhost.model.UserRole;

@Repository("userInfoDao")
public class UserInfoDaoImpl extends BaseHibernateDAOImpl<UserInfo> implements IUserInfoDao {

	public UserInfoDaoImpl() {
		this.setClazz(UserInfo.class);
	}

	public UserInfo findUser(User user) {
		// Map<String, Object> argMap = new HashMap<String, Object>();
		// argMap.put("userId", user.getId().getUserId());
		// argMap.put("account", user.getId().getAccount());
		// String hql = " FROM User U WHERE U.id.userId = :userId AND
		// U.id.account = :account";
		// List<User> userList = this.queryHql(hql, argMap);
		// return (UserInfo) (CollectionUtils.isEmpty(userList) ? null :
		// userList.get(0));
		return null;
	}

	@Override
	public void deleteById(Long entityId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String findMaxId() {
		String hql = "FROM UserInfo U ORDER BY U.userId DESC";
		List<?> userInfoList = this.queryHql(hql, null, null);
		if(CollectionUtils.isNotEmpty(userInfoList)){
			UserInfo userInfo = (UserInfo) userInfoList.get(0);
			return userInfo.getUserId();
		}
		return "0";
	}

	@Override
	public UserInfo findUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] findUserByUserId(String userId) {
		Map<String, Object> argMap = new HashMap<String, Object>();
		argMap.put("userId", userId);
		String hqlStr = "FROM UserInfo U, UserRule R WHERE U.ruleId = R.ruleId AND U.userId = :userId";
		List<?> userList = this.queryHql(hqlStr, argMap, null);
		return CollectionUtils.isEmpty(userList) ? null : (Object[]) userList.get(0);
	}

	@Override
	@SuppressWarnings("unchecked")
	@Cacheable(value = "userCache", key = "#loginId")
	public List<Object[]> findUserByLoginId(String loginId) {
		Map<String, Object> argMap = new HashMap<String, Object>();
		argMap.put("loginId", loginId);
		String hqlStr = "FROM UserInfo U, UserMappingRoles M, UserRole R WHERE U.loginId = M.pk.loginId AND M.pk.roleId = R.roleId AND U.loginId = :loginId";
		List<?> userList = this.queryHql(hqlStr, argMap, true);
		return CollectionUtils.isEmpty(userList) ? null : (List<Object[]>) userList;
	}

}
