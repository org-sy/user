package com.sy.interestingvideo.user.vo;
import lombok.Data;

@Data
public class ResultObject {

    private Integer code;

    private String msg;

    private Object data;

    public ResultObject(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
