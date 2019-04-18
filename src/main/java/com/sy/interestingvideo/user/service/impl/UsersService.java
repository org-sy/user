package com.sy.interestingvideo.user.service.impl;

import com.sy.interestingvideo.user.entity.UserInfo;
import com.sy.interestingvideo.user.repository.UsersRepository;
import com.sy.interestingvideo.user.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:用户服务
 * @className:UsersService
 * @author: Clrvn
 * @date: 2019-04-18 18:15
 */
@Service
public class UsersService implements IUsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserInfo getUserByUId(Long uid) {
		return usersRepository.getOne(uid);
	}
}
