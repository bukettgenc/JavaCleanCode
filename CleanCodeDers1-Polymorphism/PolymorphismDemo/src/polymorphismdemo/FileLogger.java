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
public class FileLogger extends BaseLogger{
    public void Log(String message) {
        System.out.println("File logger:" + message);
    }
}
