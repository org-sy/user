package com.sy.interestingvideo.user.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 廖师兄
 * 2017-12-10 18:02
 */
@Data
public class ResultVO<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;
}
