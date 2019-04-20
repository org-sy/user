package com.sy.interestingvideo.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "users")
@Entity
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * u_id
     */
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uId;
    /**
     * 有趣号
     */
    private String account;
    /**
     * 名称
     */
    private String nickName;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 最后一次登录
     */
    private Date lastTime;

    private String gender;
    /**
     * 头像
     */
    private String picture;
    /**
     * 身份证号码
     */
    private String identityCard;
    /**
     * 真实姓名
     */
    private String identityName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 唯一标识
     */
    private String uniqueCode;

}