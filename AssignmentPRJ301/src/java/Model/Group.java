/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Group {
    private int GroupID ;
    private String GroupName ;

    public Group() {
    }

    public Group(int GroupID, String GroupName) {
        this.GroupID = GroupID;
        this.GroupName = GroupName;
    }

    public int getGroupID() {
        return GroupID;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupID(int GroupID) {
        this.GroupID = GroupID;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }
}
