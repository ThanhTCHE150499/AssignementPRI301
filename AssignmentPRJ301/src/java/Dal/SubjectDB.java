/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import Model.Student;
import Model.Subject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SubjectDB extends DBContex{
    public ArrayList<Subject> getSubjects(){
        ArrayList<Subject> subjects = new ArrayList<>();
        try {
            String sql = "Select * from Subject";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Subject subject = new Subject();
                subject.setSubjectID(rs.getString("SubjectID"));
                subject.setSubjectName(rs.getNString("SubjectName"));
                subject.setTeacherID(rs.getNString("TeacherID"));
                subjects.add(subject);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subjects;
    }
}
