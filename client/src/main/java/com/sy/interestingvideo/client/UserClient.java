/*
package com.sy.interestingvideo.client;


import com.sy.interestingvideo.user.entity.UserInfo;
import com.sy.interestingvideo.user.service.impl.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

*/
/**
 * @description:
 * @className:UserClient
 * @author: Clrvn
 * @date: 2019-04-18 21:21
 *//*



@SuppressWarnings("all")
@FeignClient(name = "user", fallback = UserClient.UserClientFallback.class)
public interface UserClient {
	
	
	@GetMapping("/user/getUserById")
	UserInfo getOneByUId(@RequestParam("userId") Long uId);
	
	@Component
	static class UserClientFallback implements UserClient {
		@Autowired
		private UsersService usersService;
		
		@Override
		public UserInfo getOneByUId(Long uId) {
			return usersService.getUserByUId(uId);
		}
	}
	
}


*/
