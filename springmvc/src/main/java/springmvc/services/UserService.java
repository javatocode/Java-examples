package springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.modal.Users;


@Service
public class UserService {
	
 @Autowired	
 private UserDao userdao; 	
 public int createUser(Users user) {
	 return this.userdao.saveUser(user);
 }
}
