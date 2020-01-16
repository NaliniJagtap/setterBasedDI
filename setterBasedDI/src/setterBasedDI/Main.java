package setterBasedDI;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  


public class Main {
	
	 public static void main(String[] args) {  
	        Resource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	        Movie m=(Movie)factory.getBean("movie");  
	        m.display();  
	    }  

}
