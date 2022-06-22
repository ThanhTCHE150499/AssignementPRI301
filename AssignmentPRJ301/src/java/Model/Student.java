/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Student {
    private String StudentID ;
    private String StudentName ; 
    private int Age ; 
    private boolean Gender ;
    private String Address ; 
    private int Phone ; 
    private String Username ;

    public Student() {
    }

    public Student(String StudentID, String StudentName, int Age, boolean Gender, String Address, int Phone, String Username) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.Age = Age;
        this.Gender = Gender;
        this.Address = Address;
        this.Phone = Phone;
        this.Username = Username;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
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

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
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
