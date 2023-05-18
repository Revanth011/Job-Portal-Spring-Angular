package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "users")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "uid")
	private int uid;	
	@Column(name = "uname")
	private String uname;
	@Column(name = "username")
	private String username;
	@Column(name = "umobile")
	private String umobile;
	@Column(name = "uaddress")
	private String uaddress;
	@Column(name = "uemail")
	private String uemail;
	@Column(name = "upassword")
	private String upassword;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy ="user")
	@JsonIgnore
	private Set<UserRole> userRoles = new HashSet<>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int uid, String uname, String username, String umobile, String uaddress, String uemail,
			String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.username = username;
		this.umobile = umobile;
		this.uaddress = uaddress;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	public String getUmobile() {
		return umobile;
	}

	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", username=" + username + ", umobile=" + umobile
				+ ", uaddress=" + uaddress + ", uemail=" + uemail + ", upassword=" + upassword + "]";
	}
	
}
