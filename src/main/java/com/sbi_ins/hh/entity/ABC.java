package com.sbi_ins.hh.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class ABC {
	@Id
	@GeneratedValue
	private Integer id;
	
   @NotBlank
   @Pattern(regexp="^[A-Z a-z 0-9]{2,20}@[A-Z a-z]{2,8}\\.[A-Z a-z]{2,5}$")
	private String name;
   
	private Integer age;
	@Length(min=4,max=10)
	@Pattern(regexp="^[A-Z]{5}[0-9]{4}[A-Z]$")
	private String qual;
	
	private Long phone;
	private Integer pin;
	
		
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getPin() {
		return pin;
	}


	public void setPin(Integer pin) {
		this.pin = pin;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}

}
