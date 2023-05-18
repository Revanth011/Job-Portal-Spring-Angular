package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "jobs")
public class Jobs {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "jid")
	private int  jid;	
	@Column(name = "jname")
	private String jname;
	@Column(name = "cname")
	private String cname;
	@Column(name = "jlocation")
	private String jlocation;
	@Column(name = "jdescription")
	private String jdescription;
	@Column(name="experience")
	private String experience;
	@Column(name="salary")
	private String salary;
	@Column(name="apply_link")
	private String apply_link;
	
	public Jobs() {
	}
	
	
	public Jobs(int jid, String jname, String cname, String jlocation, String jdescription, String experience,
			String salary, String apply_link) {
		this.jid = jid;
		this.jname = jname;
		this.cname = cname;
		this.jlocation = jlocation;
		this.jdescription = jdescription;
		this.experience = experience;
		this.salary = salary;
		this.apply_link = apply_link;
	}





	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getApply_link() {
		return apply_link;
	}


	public void setApply_link(String apply_link) {
		this.apply_link = apply_link;
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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

	@Override
	public String toString() {
		return "Jobs [jid=" + jid + ", jname=" + jname + ", cname=" + cname + ", jlocation=" + jlocation
				+ ", jdescription=" + jdescription + ", experience=" + experience + ", salary=" + salary
				+ ", apply_link=" + apply_link + ", getJid()=" + getJid() + ", getJname()=" + getJname()
				+ ", getCname()=" + getCname() + ", getJlocation()=" + getJlocation() + ", getJdescription()="
				+ getJdescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
