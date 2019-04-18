package com.sy.interestingvideo.user.controller;

import com.sy.interestingvideo.user.service.impl.UsersService;
import com.sy.interestingvideo.user.uitls.ResultVOUtil;
import com.sy.interestingvideo.user.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	
	@GetMapping("/getOne")
	public ResultVO getOneByUId(@RequestParam("userId") Long uId){
		System.err.println("uId: " + uId);
		return ResultVOUtil.success(usersService.getUserByUId(uId));
	}
}
