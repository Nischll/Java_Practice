package practice.dao;

import jdk.jshell.spi.SPIResolutionException;
import practice.entity.LoginCredential;
import practice.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginCredentialDao {
    public void saveUser(LoginCredential user){
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try(Connection conn = DbConnectionUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            int rowsAffected = stmt.executeUpdate();

            if(rowsAffected > 0 ){
                System.out.println("User data saved to database!");
            }

        } catch (SQLException e ){
            System.out.println("Error adding users data: " + e.getMessage());
        }
    }

    public List<LoginCredential> findAllUser() {
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

    public void updateUser (int id, String newUsername, String newPassword){
        String sql = "update users SET username = ?, password = ? where id = ?";
        try(
            Connection conn = DbConnectionUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setString(1, newUsername);
            stmt.setString(2, newPassword);
            stmt.setInt(3, id);

            int rowsAffected = stmt.executeUpdate();
            if(rowsAffected > 0 ){
                System.out.println("User updated successfully!");
            } else {
                System.out.println("No user found with ID: " + id + ", to update");
            }

        }catch(SQLException e ){
            System.out.println("Error updating user: " + e.getMessage());
        }
    }

    public void deleteUserById (int id){
        String sql = "DELETE FROM users where id = ?";

        try(
             Connection conn = DbConnectionUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setInt(1, id);

            int affectedRows = stmt.executeUpdate();
            if(affectedRows > 0){
                System.out.println("User deleted successfully!: Id:- " + id);
            } else {
                System.out.println("No user found with ID: " + id + ", to delete");
            }

        } catch(SQLException e ){
            System.out.println("Failed to delete user with ID: " + e.getMessage());
        }
    }

    public LoginCredential findUserById(int id){
        String sql = "SELECT id, username, password FROM users WHERE id = ?";
//        List<LoginCredential> users = new ArrayList<>();

        try(
            Connection conn = DbConnectionUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

             if(rs.next()){
                 return new LoginCredential(
                         rs.getInt("id"),
                         rs.getString("username"),
                         rs.getString("password")
                 );
//                 users.add(user);
             }

        } catch (SQLException e){
            System.out.println("Error fetching user by ID: " + id + ", " + e.getMessage());
        }
             return null;
    }

    public LoginCredential findByUsername(String username){
        String sql = "SELECT id, username, password FROM users where username = ?";

        try(
            Connection conn = DbConnectionUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return new LoginCredential(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password")
                );
            }

        } catch (SQLException e){
            System.out.println("Error fetching by username: " + username + ", " + e.getMessage());
        }
        return null;
    }
}
