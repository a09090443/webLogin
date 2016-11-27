package com.localhost.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "user_role")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserRole implements Serializable {

	@Id
	@NotEmpty
	@Column(name = "role_id", nullable = false)
	private String roleId;
	
	@Column(name = "role_type", nullable = false)
	private String roleType;

	public UserRole() {

	}

	public UserRole(String roleId, String roleType) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
