package HQL.HibernateHQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Entity.student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       String hql = "from student where marks > 80";
       
       Session s = sf.openSession();
       Transaction t =  s.beginTransaction();
       
       Query<student>  qur = s.createQuery(hql,student.class);
       List<student> res = qur.getResultList();
       
       //System.out.println(res);
       
       for (student st : res) {
    	   System.out.println("Id : "+ st.getId());
    	   System.out.println("Name :"+st.getName());
    	   System.out.println("Marks :" + st.getMarks());
    	   
    	   System.out.println();
       }
       
       System.out.println("Data Loaded successfully!!!");
       t.commit();
       s.close();
       sf.close();
       
       
    }
}
