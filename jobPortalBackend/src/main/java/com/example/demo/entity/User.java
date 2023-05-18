package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "uid")
	private int uid;
	@Column(name = "uname")
	private String uname;
	@Column(name="ulocation")
	private String ulocation;
	@Column(name="umobile")
	private long umobile;
	@Column(name="uemail")
	private String uemail;
	@Column(name="upassword")
	private String upassword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String ulocation, long umobile, String uemail, String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.ulocation = ulocation;
		this.umobile = umobile;
		this.uemail = uemail;
		this.upassword = upassword;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUlocation() {
		return ulocation;
	}
	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}
	public long getUmobile() {
		return umobile;
	}
	public void setUmobile(long umobile) {
		this.umobile = umobile;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", ulocation=" + ulocation + ", umobile=" + umobile
				+ ", uemail=" + uemail + ", upassword=" + upassword + "]";
	}
	
	
}
