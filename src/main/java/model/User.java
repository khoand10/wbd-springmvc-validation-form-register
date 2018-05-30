package model;


import javax.validation.constraints.*;

public class User{

    private int id;
    @NotEmpty(message = "không được để trống first name")
    @Size(min = 5,max = 45,message = "first phải có độ dài từ 5-45")
    private String firstname;

    @NotEmpty(message = "không được để trống first name")
    @Size(min = 5,max = 45,message = "first phải có độ dài từ 5-45")
    private String lastName;

    @NotEmpty(message = "không được để trống số điện thoại")
    @Pattern(regexp="(^$|[0-9]{10,12})")
    private String phoneNumber;

    @Email(message = "email không hợp lệ")
    @NotEmpty(message = "không được để trống email")
    private String email;

    public User(){

    }

    public User(String firstname, String lastName, String phoneNumber, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
