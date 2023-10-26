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
public class CustomerManager {

    private BaseLogger[] baseLoggers;

    public CustomerManager(BaseLogger[] baseLoggers) {
        this.baseLoggers = baseLoggers;
    }


    public void add() {
       
        //Bu bağımlı bi kullanma şeklidir değişikliğe açık değildir.
        // DatabaseLogger dbLogger = new DatabaseLogger();
      
        for (BaseLogger logger : baseLoggers) {
            logger.Log("Log mesajı");
        }
    }
}
