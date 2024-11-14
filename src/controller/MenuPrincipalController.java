package controller;

import view.Agenda;
import view.Login;
import view.MenuPrincipal;


public class MenuPrincipalController {
    
    //Importando a view
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        // botao de agenda
        // abre a tela de agenda
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        // fecha o jframe atual
        this.view.dispose();
    }
    
    public void sair(){
        // botao de sair
        // abre a tela de login
        Login login = new Login();
        login.show();
        // fecha o jframe atual
        this.view.dispose();
    }
}
