package com.cmss.gym.dao;

import java.util.List;

import com.cmss.gym.bean.GymBean;
import com.cmss.gym.bean.RegistrationBean;
public interface gymdao
{
	public boolean addenquiry(GymBean bean);
	public void addreg(RegistrationBean bean);
	public List<RegistrationBean> getAllregistration();
	public RegistrationBean regupdate(RegistrationBean bean);
	public RegistrationBean getuser(int userid);
	public void deleteUser(int id);
}
