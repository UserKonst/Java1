/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.List;

/**
 *
 * @author konst
 */
public interface MusicSchoolOrganizer {

    public void addNewStudent(Student student, SchoolClass schoolClass);
    public void deleteStudentFromClass(Student student, SchoolClass schoolClass);
    public List<Student> getAllStudents();
    public List<Student> getStudensFromClass(SchoolClass schoolClass);
    public void schedulePerformance(Performance performance);
}
