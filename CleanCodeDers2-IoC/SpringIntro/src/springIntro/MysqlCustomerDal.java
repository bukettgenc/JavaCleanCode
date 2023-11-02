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
public class MysqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Mysql veritabanına eklendi.");    }
    
}
