package com.sy.interestingvideo.user.vo;


import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
