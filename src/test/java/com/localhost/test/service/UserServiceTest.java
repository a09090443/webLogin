package com.localhost.test.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.localhost.model.UserInfo;
import com.localhost.model.UserRole;
import com.localhost.service.IUserService;
import com.localhost.test.base.TestBase;

public class UserServiceTest extends TestBase {

	@Autowired
	private IUserService userService;

//	@Test
//	public void testAddUser() {
//		try {
//			UserInfo userInfo = new UserInfo();
//			for(int i=0; i<15; i++){
//				userInfo.setFirstName("test" + i);
//				userInfo.setLastName("last" + i);
//				userInfo.setEmail("test" + i + "@localhost.com");
//				userInfo.setPassword("password" + i);
//				userInfo.setRoleId("1");
//				userInfo.setLoginId("test" + i);
//				this.userService.addUser(userInfo);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		assertTrue(true);
//	}

//	@Test
	public void testDelUser() {
//		try {
//			User user = new User();
//			UserId id = new UserId();
//			id.setAccount("tseg7");
//			id.setUserId("00044");
//			user.setId(id);
////			this.userService.delUser(user);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		assertTrue(true);
	}

//	@Test
	public void testUpdateUser() {
//		try {
//			UserId id = new UserId();
//			id.setAccount("test");
//			id.setUserId("00001");
//			User user = new User();
//			user.setId(id);
//			user.setEmail("ggggg@localhost.com");
//			
//			Map<String, Object> conditionMap = new HashMap<String, Object>();
//			conditionMap.put("userId", "00001");
//			conditionMap.put("account", "tseg1");
//
//			this.userService.updateUser(user, conditionMap);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		assertTrue(true);
	}
	
	@Test
	public void testFindUser() {
//		try {
//			String loginId = "test8";
//			List<Object[]> user = userService.findUserAllInfoByLoginId(loginId);
//			System.out.println("Success");
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		assertTrue(true);
	}

}
