package com.uzdz.user.service.impl;

import java.util.Arrays;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.uzdz.bean.User;
import com.uzdz.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

	@Override
	public User getUser(String userId) {
		return new User(1, "uzdz");
	}
}
