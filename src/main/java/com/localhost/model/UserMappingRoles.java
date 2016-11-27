package com.localhost.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "user_mapping_roles")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class UserMappingRoles implements Serializable {

	@EmbeddedId
	UserMappingRolesPK pk;

	public UserMappingRolesPK getPk() {
		return pk;
	}

	public void setPk(UserMappingRolesPK pk) {
		this.pk = pk;
	}
	
}
