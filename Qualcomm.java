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
public class Qualcomm implements Processador{
    @Override
    public void exibirVelocidade(){
        System.out.println("Velocidade do Processador Qualcomm: 2.4Ghz");
    }
}
