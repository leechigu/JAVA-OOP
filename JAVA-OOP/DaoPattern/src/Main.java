import java.sql.*;

public class Main {
	
	public static void main(String[] args) {
		PasswordInfo p;
		DAO<PasswordInfo,String> passwordInfoDAO = new PasswordDAOImpl("passwords");
		
		//insert data
		System.out.println("---INSERT DATA---");
		p = new PasswordInfo("https://www.smu.ac.kr","smu","abcde");
		passwordInfoDAO.insert(p);
		p = new PasswordInfo("https://www.smu2.ac.kr","smu2","abcde");
		passwordInfoDAO.insert(p);
		
		//find all data
		System.out.println("---READ ALL DATA from DB---");
		for(PasswordInfo pi : passwordInfoDAO.findAll()) {
			System.out.println("data :" +pi);
		}
		
		p = new PasswordInfo("https://www.smu2.ac.kr","smu1","abcde");
		passwordInfoDAO.update(p.getKey(),p);
		
		System.out.println("---UPDATE DATA---");
		System.out.println("---READ ALL DATA from DB---");
		for(PasswordInfo pi : passwordInfoDAO.findAll()) {
			System.out.println("data :" +pi);
		}
		
		passwordInfoDAO.deleteByKey("https://www.smu2.ac.kr");
		System.out.println("---DELETE DATA---");
		System.out.println("---READ ALL DATA from DB---");
		for(PasswordInfo pi : passwordInfoDAO.findAll()) {
			System.out.println("data :" +pi);
		}
    }
	
}
