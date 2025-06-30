package practice.service;

import practice.dao.LoginCredentialDao;
import practice.entity.LoginCredential;
import practice.util.PasswordUtils;

import java.util.List;

public class LoginCredentialService {
    private final LoginCredentialDao loginDao = new LoginCredentialDao();

    public void registerLogin (String username, String password){
        String hashPassword = PasswordUtils.hashPassword(password);
        LoginCredential login = new LoginCredential(username, hashPassword);
        loginDao.saveUser(login);
        System.out.println("Login credential register successfully!!");
    };

    public void listAllUsers (){
        List<LoginCredential> loginList = loginDao.findAllUser();
        for(LoginCredential l: loginList){
            System.out.println("ID: " + l.getId() + ", username: " + l.getUsername()+ ", password: " + l.getPassword());
        }
    };

    public void updateUser (int id, String newUsername, String newPassword){
        String hashedPassword = PasswordUtils.hashPassword(newPassword);
        loginDao.updateUser(id, newUsername, hashedPassword);
    }

    public void DeleteUser (int id){
        loginDao.deleteUserById(id);
    }

    public void GetUserById (int id){
        LoginCredential user = loginDao.findUserById(id);
        if (user != null) {
            System.out.println("Found: ID = " + user.getId() + ", Username = " + user.getUsername());
        } else {
            System.out.println("No user found with ID: " + id);
        }
    }

    public void GetUserByUsername (String username){
        LoginCredential user = loginDao.findByUsername(username);
        if (user != null) {
            System.out.println("Found: username = " + user.getUsername() + ", ID = " + user.getId());
        } else {
            System.out.println("No user found with username: " + username);
        }
    }
}
