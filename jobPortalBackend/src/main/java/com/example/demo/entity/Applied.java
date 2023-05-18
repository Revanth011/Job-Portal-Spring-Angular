package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Applied")
public class Applied {
	@Id
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name = "aid")
	private int aid;
	@Column(name = "uid")
	private Integer uid;
	@Column(name="rid")
	private Integer rid;
	@Column(name="jid")
	private Integer jid;
	public Applied() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Applied(int aid, Integer uid, Integer rid, Integer jid) {
		super();
		this.aid = aid;
		this.uid = uid;
		this.rid = rid;
		this.jid = jid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	@Override
	public String toString() {
		return "Applied [aid=" + aid + ", uid=" + uid + ", rid=" + rid + ", jid=" + jid + "]";
	}

	
}
