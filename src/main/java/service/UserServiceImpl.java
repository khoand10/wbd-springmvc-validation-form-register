package service;

import model.User;

import java.sql.*;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(User user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","dangkhoa1997");
            PreparedStatement pre = con.prepareStatement("insert into user(first_name,last_name,phone,email) values(?,?,?,?)");
            pre.setString(1,user.getFirstname());
            pre.setString(2,user.getLastName());
            pre.setString(3,user.getPhoneNumber());
            pre.setString(4,user.getEmail());
            ResultSet rs = pre.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
