package com.amar.db.ibatis.dao;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.amar.web.model.User;

public interface UserDAO
{

public List<User> findUser( User user );

public List<User> findUser( User user ,RowBounds rb);

public void deleteUser( User user );

public void addUser( User user );

public void editUser( User user );

}
