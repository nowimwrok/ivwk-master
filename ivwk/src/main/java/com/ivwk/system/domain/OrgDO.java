package com.ivwk.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 系统组织
 * 
 * @author Vayne
 * @email nowimwork@foxmail.com
 * @date 2018-02-24 17:02:39
 */
public class OrgDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//组织ID
	private Long orgId;
	//所属用户ID
	private Long userId;
	//组织名称
	private String orgname;
	//短名称
	private String shortname;
	//组织所属用户名
	private String username;
	//联系电话
	private String phone;
	//类型（企业、个人）
	private String type;
	//状态 0:禁用，1:正常
	private Integer status;
	//创建用户id
	private Long userIdCreate;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;

	/**
	 * 设置：组织ID
	 */
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	/**
	 * 获取：组织ID
	 */
	public Long getOrgId() {
		return orgId;
	}
	/**
	 * 设置：所属用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：所属用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：组织名称
	 */
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	/**
	 * 获取：组织名称
	 */
	public String getOrgname() {
		return orgname;
	}
	/**
	 * 设置：短名称
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/**
	 * 获取：短名称
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * 设置：组织所属用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：组织所属用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：类型（企业、个人）
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型（企业、个人）
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：状态 0:禁用，1:正常
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态 0:禁用，1:正常
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：创建用户id
	 */
	public void setUserIdCreate(Long userIdCreate) {
		this.userIdCreate = userIdCreate;
	}
	/**
	 * 获取：创建用户id
	 */
	public Long getUserIdCreate() {
		return userIdCreate;
	}
	/**
	 * 设置：创建时间
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}
	/**
	 * 设置：修改时间
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getGmtModified() {
		return gmtModified;
	}
}
