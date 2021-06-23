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
public class FabricaApple implements FabricaCelular{     
    
    Mediatek proc;
    Ios so;
    
    public FabricaApple()
    {
        this.proc = this.criarProcessador();
        this.so = this.criarSistemaOperacional();     
        this.info();
    }
    
    void info()
    {
        System.out.println("#########################");
        System.out.println("Celular Apple");
        this.proc.exibirVelocidade();
        this.so.exibirInfo();
        System.out.println("#########################");
    }
    
    @Override
    public Mediatek criarProcessador() {
        return new Mediatek();
    }

    @Override
    public Ios criarSistemaOperacional() {
        return new Ios();
    }   
}
