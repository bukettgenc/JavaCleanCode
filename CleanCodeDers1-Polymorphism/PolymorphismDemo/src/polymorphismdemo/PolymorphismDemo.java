/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismdemo;

/**
 *
 * @author buket.genc
 */
public class PolymorphismDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
//
//        for (BaseLogger logger : loggers) {
//            logger.Log("Log mesajı");
//        }
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        customerManager.add();
    }

}
