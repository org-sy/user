package com.sy.interestingvideo.user.service.impl;

import com.sy.interestingvideo.user.entity.UserInfo;
import com.sy.interestingvideo.user.repository.UsersRepository;
import com.sy.interestingvideo.user.service.IUsersService;

/**
 * @description:用户服务
 * @className:UsersService
 * @author: Clrvn
 * @date: 2019-04-18 18:15
 */
public class UsersService implements IUsersService {
	
	private UsersRepository usersRepository;
	
	@Override
	public UserInfo getUserByUId(Integer uid) {
		return usersRepository.getOne(uid);
	}
}
