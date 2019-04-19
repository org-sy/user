package com.sy.interestingvideo.user.controller;

import com.sy.interestingvideo.user.entity.UserInfo;
import com.sy.interestingvideo.user.service.impl.UsersService;
import com.sy.interestingvideo.user.uitls.ResultVOUtil;
import com.sy.interestingvideo.user.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description 用户Action
 * @className UsersController
 * @author  Clrvn
 * @date 2019-04-18 18:17
 */
@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/getOne")
	public ResultVO getOneByUId(@RequestParam("uId") Long uId){
		System.err.println("uId: " + uId);
		System.err.println(usersService.getUserByUId(uId).toString());
		return ResultVOUtil.success(usersService.getUserByUId(uId));
	}
	
	@GetMapping("/getUserById")
	public UserInfo getUserById(@RequestParam("userId")Long userId){
		return usersService.getUserByUId(userId);
	}
	
	@PostMapping("/msg")
	public String getUserMsg(@RequestParam("temp")String temp){
		System.err.println("temp: " + temp);
		return "this is a user msg and param is " + temp;
	}
	
}
