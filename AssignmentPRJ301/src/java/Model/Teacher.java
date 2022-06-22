/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Teacher {
    private String TeacherID ;
    private String TeacherName ; 
    private int Age ;
    private boolean Gender ;
    private String Address ; 
    private int Phone ;
    private String Username ;

    public Teacher() {
    }

    public Teacher(String TeacherID, String TeacherName, int Age, boolean Gender, String Address, int Phone, String Username) {
        this.TeacherID = TeacherID;
        this.TeacherName = TeacherName;
        this.Age = Age;
        this.Gender = Gender;
        this.Address = Address;
        this.Phone = Phone;
        this.Username = Username;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public int getAge() {
        return Age;
    }

    public boolean isGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhone() {
        return Phone;
    }

    public String getUsername() {
        return Username;
    }

    public void setTeacherID(String TeacherID) {
        this.TeacherID = TeacherID;
    }

    public void setTeacherName(String TeacherName) {
        this.TeacherName = TeacherName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
}
