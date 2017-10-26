package com.sbi_ins.hh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PersonalDetils")
public class PersonalDetilsEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	@JoinColumn(name="Title_id")
	private TitleEntity title;
	@ManyToOne
	@JoinColumn(name="Gender_id")
	private GenderEntiy gender;
	@ManyToOne
	@JoinColumn(name="Nationality_id")
	private NationalityEntity nationality;
	@ManyToOne
	@JoinColumn(name="Status_id")
	private StatusEntity Status;
	private String firstname;
	private String middlename;
	private String lastname;
	private Date dob;
	private Date doj;
	private String supposename;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TitleEntity getTitle() {
		return title;
	}
	public void setTitle(TitleEntity title) {
		this.title = title;
	}
	public GenderEntiy getGender() {
		return gender;
	}
	public void setGender(GenderEntiy gender) {
		this.gender = gender;
	}
	public NationalityEntity getNationality() {
		return nationality;
	}
	public void setNationality(NationalityEntity nationality) {
		this.nationality = nationality;
	}
	public StatusEntity getStatus() {
		return Status;
	}
	public void setStatus(StatusEntity status) {
		Status = status;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getSupposename() {
		return supposename;
	}
	public void setSupposename(String supposename) {
		this.supposename = supposename;
	}
	

}
