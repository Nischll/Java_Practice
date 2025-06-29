package practice.dao;

import practice.entity.LoginCredential;
import practice.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginCredentialDao {
    public void save(LoginCredential user){
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try(Connection conn = DbConnectionUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.executeUpdate();

            System.out.println("User data saved to database!");
        } catch (SQLException e ){
            System.out.println("Error adding users data: " + e.getMessage());
        }
    }

    public List<LoginCredential> findAll() {
        List<LoginCredential> users = new ArrayList<>();
        String sql = "SELECT id, username, password FROM users";

        try(
            Connection conn = DbConnectionUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        ){
            while(rs.next()){
                LoginCredential user = new LoginCredential(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password")
                );
                users.add(user);
            }

        } catch (SQLException e ){
            System.out.println("Error fetching users data: " + e.getMessage());
        }
        return users;
    }
}
