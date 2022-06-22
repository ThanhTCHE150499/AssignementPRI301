/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Mark {
    private String SubjectID ;
    private String StudentID ;
    private int Type ; 
    private int Mark ; 

    public Mark() {
    }

    public Mark(String SubjectID, String StudentID, int Type, int Mark) {
        this.SubjectID = SubjectID;
        this.StudentID = StudentID;
        this.Type = Type;
        this.Mark = Mark;
    }

    public String getSubjectID() {
        return SubjectID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public int getType() {
        return Type;
    }

    public int getMark() {
        return Mark;
    }

    public void setSubjectID(String SubjectID) {
        this.SubjectID = SubjectID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public void setMark(int Mark) {
        this.Mark = Mark;
    }
    
}
