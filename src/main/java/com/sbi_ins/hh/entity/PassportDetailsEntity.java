package com.sbi_ins.hh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PassportDetails")
public class PassportDetailsEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String  pwdno;
	private Date dateofissue;
	private Date dateofexp;
	private String issued;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPwdno() {
		return pwdno;
	}
	public void setPwdno(String pwdno) {
		this.pwdno = pwdno;
	}
	public Date getDateofissue() {
		return dateofissue;
	}
	public void setDateofissue(Date dateofissue) {
		this.dateofissue = dateofissue;
	}
	public Date getDateofexp() {
		return dateofexp;
	}
	public void setDateofexp(Date dateofexp) {
		this.dateofexp = dateofexp;
	}
	public String getIssued() {
		return issued;
	}
	public void setIssued(String issued) {
		this.issued = issued;
	}

}
