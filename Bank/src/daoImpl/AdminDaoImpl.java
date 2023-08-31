package daoImpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.AdminDao;
import entity.Administractor;
import utile.JDBCUTILE;

public class AdminDaoImpl implements AdminDao {
	//储存账号
	private static List<Administractor> adminList = new ArrayList<Administractor>();
	//记录当前登录的账户
	public static Administractor admin = null;
	
	@Override
	public List<Administractor> selectAllAdmin() {
		String SQL = "SELECT adminNumber,adminPwd FROM administractor";
		ResultSet rst = null;
		List<Administractor> adminList = new ArrayList<Administractor>();
		try {
			rst = JDBCUTILE.selectDataBaseTable(SQL);
			while(rst.next()) {
				Administractor a = new Administractor(rst.getString("adminNumber"),rst.getString("adminPwd"),rst.getString("adminName"));
				adminList.add(a);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				JDBCUTILE.dataBaseClose(rst, null, null);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return adminList;
	}
	
}
