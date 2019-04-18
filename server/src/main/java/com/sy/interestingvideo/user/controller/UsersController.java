package com.sy.interestingvideo.user.controller;

import com.sy.interestingvideo.user.service.impl.UsersService;
import com.sy.interestingvideo.user.uitls.ResultVOUtil;
import com.sy.interestingvideo.user.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:用户Action
 * @className:UsersController
 * @author: Clrvn
 * @date: 2019-04-18 18:17
 */
@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/getUserByUId")
	public ResultVO getOneByUId(@RequestParam("uId") Long uId){
		System.err.println("uId: " + uId);
		return ResultVOUtil.success(usersService.getUserByUId(uId));
	}
}
