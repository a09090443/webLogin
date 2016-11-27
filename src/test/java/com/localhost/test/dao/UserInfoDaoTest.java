package com.localhost.test.dao;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.localhost.dao.IUserInfoDao;
import com.localhost.model.UserRole;
import com.localhost.test.base.TestBase;

public class UserInfoDaoTest extends TestBase {
	@Autowired
	private IUserInfoDao userInfoDao;

//	@Test
	public void testFindMaxId() {
		try {
			String maxId = userInfoDao.findMaxId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void testFindUserInfoByUserId() {
		try {
			List<Object[]> user = userInfoDao.findUserByLoginId("test8");
			System.out.println(user.size());
			List<Object[]> user2 = userInfoDao.findUserByLoginId("test11");
			System.out.println(user2.size());
			List<Object[]> user3 = userInfoDao.findUserByLoginId("test8");
			System.out.println(user3.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

}
