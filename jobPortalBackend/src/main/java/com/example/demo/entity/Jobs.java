package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jobs")
public class Jobs {
	@Id
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name = "jid")
	private int jid;
	@Column(name = "jname")
	private String jname;
	@Column(name="jlocation")
	private String jlocation;
	@Column(name="jdescription")
	private String jdescription;
	@Column(name="jcategory")
	private String jcategory;
	@Column (name="rid")
	private Integer rid;
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jobs(int jid, String jname, String jlocation, String jdescription, String jcategory, Integer rid) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.jlocation = jlocation;
		this.jdescription = jdescription;
		this.jcategory = jcategory;
		this.rid = rid;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getJlocation() {
		return jlocation;
	}
	public void setJlocation(String jlocation) {
		this.jlocation = jlocation;
	}
	public String getJdescription() {
		return jdescription;
	}
	public void setJdescription(String jdescription) {
		this.jdescription = jdescription;
	}
	public String getJcategory() {
		return jcategory;
	}
	public void setJcategory(String jcategory) {
		this.jcategory = jcategory;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "Jobs [jid=" + jid + ", jname=" + jname + ", jlocation=" + jlocation + ", jdescription=" + jdescription
				+ ", jcategory=" + jcategory + ", rid=" + rid + "]";
	}

	
}
