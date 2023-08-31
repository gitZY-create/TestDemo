package serviceImpl;

import java.util.List;

import dao.AdminDao;
import daoImpl.AdminDaoImpl;
import entity.Administractor;
import service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminDao adminDao = new AdminDaoImpl();

	@Override
	public boolean pdAdminNandP(String adminNumber, String adminPwd) {
		List<Administractor> adminList = adminDao.selectAllAdmin();
		boolean bo =false;
		if(adminList.size()>0) {
			for(Administractor admin:adminList) {
				if(admin.getAdminNumber().equals(adminNumber)) {
					if(admin.getAdminPwd().equals(adminPwd)) {
						bo = true;
						break;
					}
				}
			}
		}
		return bo;
	}
	
}
