/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author INF
 */
public class StudentManagementSystem {
    private SimpleStudentRepository database;
    
    
    public StudentManagementSystem(SimpleStudentRepository stuDatabase){
        database=stuDatabase;
               
    }
    
    public void ListAllStudents(){
        database.GetAll();
    }
    public void savenewStudent(String regNo, String firstName, String lastName, String address){
        Student st=new Student();
        st.setRegNo(regNo);
        st.setFirstName(firstName);
        st.setLastName(lastName);
        st.setAddress(address);
        
        database.save(st);
    }
}
