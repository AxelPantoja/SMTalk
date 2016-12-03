/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smtalk;

import com.leapmotion.leap.*;

/**
 *
 * @author Axel
 */
public class Eventos extends Listener {

    public void onFrame(Controller controller) {
        System.out.println("Nuevo Frame");
    }

    public void onInit(Controller controller) {
        System.out.println("Inicializando");
    }

    public void onConnect(Controller controller) {
        System.out.println("Conectado");
    }

    public void onDisconnect(Controller controller) {
        System.out.println("Desconectado");
    }

    public void onFocusGained(Controller controller) {
        System.out.println("Enfocado");
    }

    public void onFocusLost(Controller controller) {
        System.out.println("Enfoque perdido");
    }
}
