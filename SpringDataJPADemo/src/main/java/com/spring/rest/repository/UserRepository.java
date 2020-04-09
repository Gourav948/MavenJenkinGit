package com.spring.rest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.UserEntity;
import com.spring.json.User;

@Component
public interface UserRepository extends JpaRepository<UserEntity, Long> 
{
	UserEntity findByUserName(String userName);

	UserEntity findBySessionId(String authToken);

}
