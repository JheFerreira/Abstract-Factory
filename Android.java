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
public class Android implements SistemaOperacional{
    
    @Override
    public void exibirInfo(){
        System.out.println("Sistema Operacional: Android 10.0");
    }
}
