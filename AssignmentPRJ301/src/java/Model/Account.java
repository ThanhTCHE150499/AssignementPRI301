/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Account {
    private String Username ;
    private String Password ;
    private int GroupID ;

    public Account() {
    }

    public Account(String Username, String Password, int GroupID) {
        this.Username = Username;
        this.Password = Password;
        this.GroupID = GroupID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public int getGroupID() {
        return GroupID;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setGroupID(int GroupID) {
        this.GroupID = GroupID;
    }
}
