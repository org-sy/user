package com.sy.interestingvideo.user.service;

import com.sy.interestingvideo.user.entity.UserInfo;

/**
 * @description:用户service接口
 * @className:IUsersService
 * @author: Clrvn
 * @date: 2019-04-18 18:13
 */
public interface IUsersService {
	
	UserInfo getUserByUId(Integer uid);
}
