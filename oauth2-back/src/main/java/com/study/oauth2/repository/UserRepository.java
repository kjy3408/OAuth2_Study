package com.study.oauth2.repository;

import org.apache.ibatis.annotations.Mapper;

import com.study.oauth2.entity.Authority;
import com.study.oauth2.entity.User;

@Mapper
public interface UserRepository {

	public User findUserByEmail(String email);
	public int saveUser(User user); //insert는 int! 
	public int saveAuthority(Authority authority);
}
