package com.coforge;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Pearson;
import com.coforge.beans.Wisher;
import com.coforge.config.BeanConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static  void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext( BeanConfiguration.class);
    	
    	Wisher w = container.getBean( Wisher.class);
    	
    	
        System.out.println( w.getMessage() );
        
	Wisher w2 = container.getBean( Wisher.class);
	
	w2.setMessage("bye");
    	
	 System.out.println( w.getMessage() );
        System.out.println( w2.getMessage() );
        
    	Pearson p = container.getBean( Pearson.class);
    	
    	System.out.println(p.getName());
    	System.out.println(p.getAge());
    	System.out.println(p.getAdd().getHno());
    	System.out.println(p.getAdd().getStreet());
        
        container.close();
    }
}
