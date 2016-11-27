package com.localhost.service;

import java.util.List;

import com.localhost.model.UserInfo;
import com.localhost.model.UserRole;

public interface IUserService {
	public List<UserInfo> findAllUser() throws Exception;

	public List<Object[]> findUserAllInfoByLoginId(String loginId);
	
	public void addUser(UserInfo userInfo);
	
	public List<UserRole> findUserRoleAll();

}
