package com.cmss.gym.service;

import java.util.List;

import com.cmss.gym.bean.GymBean;
import com.cmss.gym.bean.RegistrationBean;



public interface gymservice {
	//public boolean addenquiry(GymBean bean) ;
	public void addreg(RegistrationBean bean) ;
	public List<RegistrationBean> getAllregistration();
	public RegistrationBean regupdate(int id);
	public RegistrationBean updatereg (RegistrationBean bean);

	public void deleteUser(Integer id);
	
}
