package com.sbi_ins.hh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi_ins.hh.dao.HHDao;
import com.sbi_ins.hh.entity.PersonalDetilsEntity;
@Service
public class HHservice implements IHHService{
	@Autowired
	private HHDao dao;

	@Override
	public List<PersonalDetilsEntity> getAll() {
		
		return dao.findAll();
	}

}
