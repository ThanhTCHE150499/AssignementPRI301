/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class GroupFeature {
    private int GroupID ;
    private String FeatureID ; 

    public GroupFeature() {
    }

    public GroupFeature(int GroupID, String FeatureID) {
        this.GroupID = GroupID;
        this.FeatureID = FeatureID;
    }

    public int getGroupID() {
        return GroupID;
    }

    public String getFeatureID() {
        return FeatureID;
    }

    public void setGroupID(int GroupID) {
        this.GroupID = GroupID;
    }

    public void setFeatureID(String FeatureID) {
        this.FeatureID = FeatureID;
    }
    
}
