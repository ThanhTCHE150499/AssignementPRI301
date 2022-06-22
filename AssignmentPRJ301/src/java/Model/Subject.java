/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Subject {
    private String TeacherID ;
    private String SubjectID ; 
    private String SubjectName ;

    public Subject() {
    }

    public Subject(String TeacherID, String SubjectID, String SubjectName) {
        this.TeacherID = TeacherID;
        this.SubjectID = SubjectID;
        this.SubjectName = SubjectName;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public String getSubjectID() {
        return SubjectID;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setTeacherID(String TeacherID) {
        this.TeacherID = TeacherID;
    }

    public void setSubjectID(String SubjectID) {
        this.SubjectID = SubjectID;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }
    
}
