package com.localhost.dao;

import java.util.List;

import com.localhost.base.dao.BaseHibernateDAO;
import com.localhost.model.UserInfo;

public interface IUserInfoDao extends BaseHibernateDAO<UserInfo> {
	public String findMaxId();
	
	public UserInfo findUserInfo(UserInfo userInfo);
	
	public Object[] findUserByUserId(String userId);
	
	public List<Object[]> findUserByLoginId(String loginId);
}
