package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Recruiter")
public class Recruiter {
    @Id
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name = "rid")
	private int rid;
	@Column(name = "rname")
	private String rname;
	@Column(name="rlocation")
	private String rlocation;
	@Column(name="rmobile")
	private long rmobile;
	@Column(name="remail")
	private String remail;
	@Column(name="rpassword")
	private String rpassword;
	public Recruiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recruiter(int rid, String rname, String rlocation, long rmobile, String remail, String rpassword) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rlocation = rlocation;
		this.rmobile = rmobile;
		this.remail = remail;
		this.rpassword = rpassword;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRlocation() {
		return rlocation;
	}
	public void setRlocation(String rlocation) {
		this.rlocation = rlocation;
	}
	public long getRmobile() {
		return rmobile;
	}
	public void setRmobile(long rmobile) {
		this.rmobile = rmobile;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	@Override
	public String toString() {
		return "Recruiter [rid=" + rid + ", rname=" + rname + ", rlocation=" + rlocation + ", rmobile=" + rmobile
				+ ", remail=" + remail + ", rpassword=" + rpassword + "]";
	}
	
	
}
