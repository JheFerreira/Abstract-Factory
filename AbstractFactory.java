/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Jéssica Ferreira
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaMotorola motog5 = new FabricaMotorola();
        FabricaApple iphone = new FabricaApple();       
    }
    
}
