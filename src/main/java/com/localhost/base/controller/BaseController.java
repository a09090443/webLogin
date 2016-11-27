package com.localhost.base.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.localhost.model.UserInfo;
import com.localhost.model.UserRole;
import com.localhost.service.IUserService;

public abstract class BaseController {
	
	@Autowired
	AuthenticationTrustResolver authenticationTrustResolver;

	@Autowired
	private IUserService userService;

	@ModelAttribute
	public void myModel(Model model) {
		if (!isCurrentAuthenticationAnonymous()) {
			List<Object[]> userList = (List<Object[]>) userService.findUserAllInfoByLoginId(getPrincipal());
			Object[] obj = userList.get(0);
			UserInfo userInfo = (UserInfo) obj[0];
			model.addAttribute("userInfo", userInfo);
			model.addAttribute("username", getPrincipal());
		}
	}

	/**
	 * This method returns true if users is already authenticated [logged-in],
	 * else false.
	 */
	protected boolean isCurrentAuthenticationAnonymous() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authenticationTrustResolver.isAnonymous(authentication);
	}

	/**
	 * This method returns the principal[user-name] of logged-in user.
	 */
	public String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	@ExceptionHandler
	public String exception(HttpServletRequest request, Exception e) {

		// 添加自己的異常處理邏輯，如日誌記錄
		request.setAttribute("exceptionMessage", e.getMessage());

		// 根据不同的异常类型进行不同处理
		if (e instanceof SQLException)
			return "testerror";
		else
			return "error";
	}
}
