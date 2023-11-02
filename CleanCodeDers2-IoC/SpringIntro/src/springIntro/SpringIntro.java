/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author buket.genc
 */
public class SpringIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("src/applicationContext.xml");
        
      CustomerManager customerManager=new CustomerManager(context.getBean("database",ICustomerDal.class));
      customerManager.add();
    }
    //IoC -  Inversion of Control
    //Bu yapıyı ayağa kaldıran tasarım deseni ise dependency injection
}
