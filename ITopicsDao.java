package dao;

import java.util.List;
import java.util.Map;

import entity.Users;

public interface ITopicsDao {
	int register(String name,String pwd);
	Users ifLogin(String name,String pwd);
}
