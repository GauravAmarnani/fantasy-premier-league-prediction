package ams.com.dao;

public interface PasswordDAO {
	
	Boolean checkIfPasswordIsCorrect(String userName, String rawPassword);
	
	Boolean updatePassword(String userName, String password);
}
