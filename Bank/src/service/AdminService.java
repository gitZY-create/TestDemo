package service;

import entity.Administractor;

public interface AdminService {
	//判断用户名和密码是否正确的方法
	boolean pdAdminNandP(String adminNumber,String adminPwd);
}
