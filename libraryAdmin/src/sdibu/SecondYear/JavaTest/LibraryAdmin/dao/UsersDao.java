package sdibu.SecondYear.JavaTest.LibraryAdmin.dao;

import java.util.List;

import sdibu.SecondYear.JavaTest.LibraryAdmin.bean.AdminUser;
import sdibu.SecondYear.JavaTest.LibraryAdmin.bean.users;

public interface UsersDao {
	List<users> searchByName(String name) throws Exception;
	boolean deleteUserById(int id) throws Exception;
	boolean addUser(AdminUser user) throws Exception;
	boolean updateUser(AdminUser user) throws Exception;

}
