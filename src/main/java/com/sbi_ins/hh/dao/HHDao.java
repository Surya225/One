package com.sbi_ins.hh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi_ins.hh.entity.PersonalDetilsEntity;

@Repository
public interface HHDao extends JpaRepository<PersonalDetilsEntity, Integer> {

}
