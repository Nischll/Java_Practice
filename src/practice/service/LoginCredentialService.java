package practice.service;

import practice.dao.LoginCredentialDao;
import practice.entity.LoginCredential;
import practice.util.PasswordUtils;

import java.util.List;

public class LoginCredentialService {
    private LoginCredentialDao loginDao = new LoginCredentialDao();

    public void registerLogin (String username, String password){
        String hashPassword = PasswordUtils.hashPassword(password);
        LoginCredential login = new LoginCredential(username, hashPassword);
        loginDao.save(login);
        System.out.println("Login credential register successfully!!");
    };

    public void listAllUsers (){
        List<LoginCredential> loginList = loginDao.findAll();
        for(LoginCredential l: loginList){
            System.out.println("ID: " + l.getId() + ", username: " + l.getUsername()+ ", password: " + l.getPassword());
        }
    };
}
