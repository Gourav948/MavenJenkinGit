package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.UserEntity;
import com.spring.json.User;

public class UserUtils {
	
	public static List<User> convertUserEntityListToUserList(List<UserEntity> userEntityList) {
		List<User> userList = new ArrayList<User>();
		Consumer<UserEntity> consumer = (UserEntity userEntity)->userList.add(convertUserEntityToUser(userEntity));
		userEntityList.stream().forEach(consumer);
		return userList;
	}
	
	public static User convertUserEntityToUser(UserEntity userEntity) {
		return new User(userEntity.getId(), userEntity.getUserName(), 
				userEntity.getFirstName(), userEntity.getPassword(),userEntity.getEmail(),userEntity.getSessionId());
	}

	public static UserEntity convertUserToUserEntity(User user) {
		return new UserEntity(user.getUserName(), user.getFirstName(), user.getPassword(),user.getEmail(),user.getSessionId());
	}
}
