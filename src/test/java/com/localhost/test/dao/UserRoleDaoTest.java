package com.localhost.test.dao;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.localhost.dao.IUserRoleDao;
import com.localhost.model.UserRole;
import com.localhost.test.base.TestBase;

public class UserRoleDaoTest extends TestBase {
	@Autowired
	private IUserRoleDao userRoleDao;

	@Test
	public void testAddUserRule() {
		try {
			List<UserRole> userRoleList = new ArrayList<UserRole>();
			userRoleList.add(new UserRole("1", "ADMIN"));
			userRoleList.add(new UserRole("2", "USER"));
			for (UserRole userRole : userRoleList) {
				userRoleDao.save(userRole);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void testFindAllUserRule() {
		try {
			List<UserRole> userRoleList = userRoleDao.findAll();
			System.out.println(userRoleList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

}
