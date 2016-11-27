package com.localhost.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.localhost.base.dao.impl.hibernate.BaseHibernateDAOImpl;
import com.localhost.dao.IUserRoleDao;
import com.localhost.model.UserRole;

@Repository("userRoleDao")
public class UserRoleDaoImpl extends BaseHibernateDAOImpl<UserRole> implements IUserRoleDao {

	public UserRoleDaoImpl() {
		this.setClazz(UserRole.class);
	}

	@Override
	public void deleteById(Long entityId) {
		// TODO Auto-generated method stub
	}

}
