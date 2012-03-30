/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author INF
 */


import javax.naming.Context;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("./Spring.xml");
        context.start();
        
        StudentManagementSystem test=(StudentManagementSystem)context.getBean("StudentManagementSystem1");
        
    }
}
