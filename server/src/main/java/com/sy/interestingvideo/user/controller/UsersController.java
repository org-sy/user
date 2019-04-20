package com.sy.interestingvideo.user.controller;

import com.alibaba.fastjson.JSON;
import com.sy.interestingvideo.user.entity.UserInfo;
import com.sy.interestingvideo.user.service.impl.UsersService;
import com.sy.interestingvideo.user.uitls.ResultVOUtil;
import com.sy.interestingvideo.user.vo.ResultObject;
import com.sy.interestingvideo.user.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

/**
 * @author Clrvn
 * @description 用户Action
 * @className UsersController
 * @date 2019-04-18 18:17
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/getOne")
    public ResultVO getOneByUId(@RequestParam("uId") Long uId) {
        System.err.println("uId: " + uId);
        System.err.println(usersService.getUserByUId(uId).toString());
        return ResultVOUtil.success(usersService.getUserByUId(uId));
    }

    @GetMapping("/getUserById")
    public UserInfo getUserById(@RequestParam("userId") Long userId) {
        return usersService.getUserByUId(userId);
    }

    @PostMapping("/msg")
    public String getUserMsg(@RequestParam("temp") String temp) {
        System.err.println("temp: " + temp);
        return "this is a user msg and param is " + temp;
    }

    @PostMapping("/qq_weixin_Login")
    public ResultObject login(@RequestBody UserInfo userInfo) {
        ResultObject resultObject = null;
        UserInfo userInfo1 = usersService.qqOrwxLogin(userInfo.getUniqueCode());
      //  如果不存在就注册
        if (userInfo1 == null) {
            userInfo.setAccount(String.valueOf(new Random().nextInt(999999)));
            userInfo.setCreateTime(new Date());
            log.info(JSON.toJSONString(userInfo));
            userInfo = usersService.register(userInfo);

            if (userInfo != null) {
                resultObject = new ResultObject(200, "注册成功", userInfo);
            } else {
                resultObject = new ResultObject(500, "注册失败", null);
            }
        } else {
            resultObject = new ResultObject(200, "登录成功", userInfo);
        }

        return resultObject;
    }

}
