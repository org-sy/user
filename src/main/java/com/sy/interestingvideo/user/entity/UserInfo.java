package com.sy.interestingvideo.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="users")
public class UserInfo implements Serializable,Cloneable{
	/** u_id */
	@Id
	@GeneratedValue
	private Long uId ;
	/** 有趣号 */
	private String account ;
	/** 名称 */
	private String nickName ;
	/** 手机号码 */
	private String phone ;
	/** 最后一次登录 */
	private Date lastTime ;
	/** 头像 */
	private String picture ;
	/** 身份证号码 */
	private String identityCard ;
	/** 真实姓名 */
	private String identityName ;
	/** 创建时间 */
	private Date createTime ;
	/** 修改时间 */
	private Date updateTime ;
	
	/** u_id */
	public Long getUId(){
		return this.uId;
	}
	/** u_id */
	public void setUId(Long uId){
		this.uId = uId;
	}
	/** 有趣号 */
	public String getAccount(){
		return this.account;
	}
	/** 有趣号 */
	public void setAccount(String account){
		this.account = account;
	}
	/** 名称 */
	public String getNickName(){
		return this.nickName;
	}
	/** 名称 */
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	/** 手机号码 */
	public String getPhone(){
		return this.phone;
	}
	/** 手机号码 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	/** 最后一次登录 */
	public Date getLastTime(){
		return this.lastTime;
	}
	/** 最后一次登录 */
	public void setLastTime(Date lastTime){
		this.lastTime = lastTime;
	}
	/** 头像 */
	public String getPicture(){
		return this.picture;
	}
	/** 头像 */
	public void setPicture(String picture){
		this.picture = picture;
	}
	/** 身份证号码 */
	public String getIdentityCard(){
		return this.identityCard;
	}
	/** 身份证号码 */
	public void setIdentityCard(String identityCard){
		this.identityCard = identityCard;
	}
	/** 真实姓名 */
	public String getIdentityName(){
		return this.identityName;
	}
	/** 真实姓名 */
	public void setIdentityName(String identityName){
		this.identityName = identityName;
	}
	/** 创建时间 */
	public Date getCreateTime(){
		return this.createTime;
	}
	/** 创建时间 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	/** 修改时间 */
	public Date getUpdateTime(){
		return this.updateTime;
	}
	/** 修改时间 */
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
}