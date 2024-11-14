    package controller;

import Model.DAO.UsuarioDAO;
import controller.helper.LoginHelper;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;


public class LoginController {

    private final Login view;
    private final LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarSistema(){
    //Pegar usuario da view
    Usuario usuario = helper.obterModelo();
    
    //Pesquisar usuario no Banco de Dados
    UsuarioDAO usuarioDAO = new UsuarioDAO(); 
    Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
    
    //Entrar no sistema se usuario e senha for igual ao DB 
    if(usuarioAutenticado != null){
        //abre o menu principal
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        //fecha o jframe atual 
        this.view.dispose();
    }else{
        //erro  
        view.exibeMensagem("Usuário ou Senha inválidos!");
    }
    
    }
    
    public void exit(){
    //Sair do sistema
    System.exit(0);
    }   
    
    public void minimize() {
        view.setExtendedState(Login.ICONIFIED);
    }
    
    public void fizTarefa(){
    
        System.out.println("busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
        
    }
    
}
