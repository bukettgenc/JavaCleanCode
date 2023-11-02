/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springintro;

/**
 *
 * @author buket.genc
 */
public class SpringIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
      customerManager.add();
    }
    //IoC -  Inversion of Control
    //Bu yapıyı ayağa kaldıran tasarım deseni ise dependency injection
}
