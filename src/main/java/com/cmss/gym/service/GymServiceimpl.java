package com.cmss.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmss.gym.bean.GymBean;
import com.cmss.gym.bean.RegistrationBean;
import com.cmss.gym.dao.gymdao;

@Service
public class GymServiceimpl implements gymservice {
	@Autowired
	gymdao dao;
	boolean res;
	public boolean addenquiry(GymBean bean) {
		res=dao.addenquiry(bean);
		if(res) 
			return true;
		else {
			return false;}
	}
	public void addreg(RegistrationBean bean) {
		dao.addreg(bean);
	}
	public List<RegistrationBean> getAllregistration() {
		return dao.getAllregistration();
	}
	public RegistrationBean regupdate(int userid) {
		return dao.getuser(userid);
	}
	public RegistrationBean updatereg(RegistrationBean bean) {
		return dao.regupdate(bean);
	}
	public void deleteUser(Integer id) {
		dao.deleteUser(id);

	}



}
