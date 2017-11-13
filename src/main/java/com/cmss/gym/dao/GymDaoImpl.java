package com.cmss.gym.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.cmss.gym.bean.GymBean;
import com.cmss.gym.bean.RegistrationBean;
import com.cmss.gym.service.gymservice;
@Repository
@EnableTransactionManagement
public class GymDaoImpl implements gymdao
{
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public boolean addenquiry(GymBean bean) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(bean);
			System.out.println("------dao-----------");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;}}
	@Transactional
	public void addreg(RegistrationBean bean) {
		System.out.println("--reg do----");
		sessionFactory.getCurrentSession().saveOrUpdate(bean);
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<RegistrationBean> getAllregistration() {
		return sessionFactory.getCurrentSession().createCriteria(RegistrationBean.class).list();
	}
	@Transactional
	public RegistrationBean getuser(int userid) {
		return (RegistrationBean) sessionFactory.getCurrentSession().get(RegistrationBean.class, userid);
	}
	@Transactional
	public RegistrationBean regupdate(RegistrationBean bean) {
		sessionFactory.getCurrentSession().update(bean);
		return bean;
	}
	@Transactional
	public void deleteUser(int id) {
		RegistrationBean employee = (RegistrationBean) sessionFactory.getCurrentSession().load(
				RegistrationBean.class, id);
		if (id != 0) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}

	}

}



