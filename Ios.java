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
public class Ios implements SistemaOperacional {
    @Override
    public void exibirInfo(){
        System.out.println("Sistema Operacional: IOS 14.0");
    }
}
