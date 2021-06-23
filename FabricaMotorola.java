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
public class FabricaMotorola implements FabricaCelular{     
    
    Qualcomm proc;
    Android so;
    public FabricaMotorola()
    {
        this.proc = this.criarProcessador();
        this.so = this.criarSistemaOperacional();     
        this.info();
    }
    
    void info()
    {
        System.out.println("#########################");
        System.out.println("Celular Motorola");
        this.proc.exibirVelocidade();
        this.so.exibirInfo();
        System.out.println("#########################");
    }
    
    @Override
    public Qualcomm criarProcessador() {
        return new Qualcomm();
    }

    @Override
    public Android criarSistemaOperacional() {
        return new Android();
    }   
}
