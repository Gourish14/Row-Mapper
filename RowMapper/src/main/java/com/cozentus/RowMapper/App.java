package com.cozentus.RowMapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("beanfile.xml");
    	StudentDAO studentDAO = (StudentDAO) ac.getBean("studentDAO"); // Retrieve the bean from the Spring context

        List<Student> stu = studentDAO.getAllStudent();

        for (Student stud : stu) {
            System.out.println(stud.getId() + ": " + stud.getName() + " " + stud.getScore());
        }
    }
}
