/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springIntro;

/**
 *
 * @author buket.genc
 */
public class CustomerManager {

    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void add() {
        iCustomerDal.add();
    }
}
