package com.shrek.AdventurerAcademyV1Service.dao;

import com.shrek.AdventurerAcademyV1Service.model.User;

import java.util.List;

public interface IUserDao extends IGenericDao<User>  {

	public List<User> getAllUsers();

	public User getUser(Long id);

	public User addUser(User user);

	public User updateUser(User user);

	public void deleteUser(User user);

}

/*public interface IUserDao {

	List<User> get();

	User get(int id);

	void save(User employee);

	void delete(int id);
}*/
