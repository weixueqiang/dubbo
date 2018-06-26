package service.impl;

import org.springframework.stereotype.Service;

import common.entity.User;
import common.entity.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{

	int i=1;
	
	public User getUser(String id) {
		User user = new User();
		user.setId(id);
		user.setAge(22);
		user.setName("zhangsan");
		System.out.println("user:"+i++);
		return user;
	}

	
	
}
