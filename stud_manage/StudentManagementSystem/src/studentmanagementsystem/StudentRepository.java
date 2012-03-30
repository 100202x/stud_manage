/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author INF
 */
public interface StudentRepository {
    
    public void save(Student s);
    public void update(String regNo,Student s);
    public void edit(String regNo);
    public Student find(String regNo);
   
}
