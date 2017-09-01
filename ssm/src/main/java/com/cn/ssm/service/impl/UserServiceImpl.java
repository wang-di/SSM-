package com.cn.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.ssm.dao.IUserDao;
import com.cn.ssm.pojo.User;
import com.cn.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
