package cn.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.tx.dao.UserDao;

@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao;
	/**
	 * 转账的业务方法
	 */
	public void tranferAccount() {
		//多钱的方法
		userDao.addSalary();
		//当方法业务中,出现异常的时候  会导致转账业务出现异常
		int sum  = 3 / 0;
		//少钱的方法
		userDao.decressSalary();
	}
}
