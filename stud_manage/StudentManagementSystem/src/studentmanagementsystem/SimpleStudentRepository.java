/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author INF
 */
public class SimpleStudentRepository implements StudentRepository{
    HashMap<String,Student> studentDB;
    private Student aStudent;
    public SimpleStudentRepository(){
        studentDB =new HashMap<String, Student>();
        aStudent =new Student();
    }
     

    @Override
    public void save(Student s) {
        studentDB.put(s.getRegNo(),s);
    }

    @Override
    public void update(String regNo,Student s) {   
        String fName,lName,add,reg;
        fName=s.getFirstName();
        lName=s.getLastName();
        add=s.getAddress();
        reg=s.getRegNo();
        
        
    }

    @Override
    public void edit(String regNo) {
        
    }

    @Override
    public Student find(String regNo) {
         return studentDB.get(regNo);
    }
    
    public void GetAll(){
        
    }
    
}
