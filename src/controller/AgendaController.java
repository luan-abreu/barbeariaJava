package controller;

import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import controller.helper.AgendaHelper;
import java.util.ArrayList;
import javax.swing.JTextField;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.Agenda;
import view.Login;
import view.MenuPrincipal;

public class AgendaController {
    
    //Importando a view
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void navegarParaMenu(){
        // botao de agenda
        // abre a tela de agenda
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        // fecha o jframe atual
        this.view.dispose();
    }
    
    public void atualizaTabela(){
        //Busca lista com agendamentos do DB
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibe esta lista na view
        helper.preencherTabela(agendamentos);
        
    }
    
    public void atualizaCliente(){
        //Busca clientes do DB
        ClienteDAO clientedao = new ClienteDAO();
        ArrayList<Cliente> clientes = clientedao.selectAll();
        
        //Exibe clientes no JcomboBox
        helper.preencherClientes(clientes);
    }

    public void atualizaServico(){
        //Busca lista com servicos do DB
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //Exibe servicos no JcomboBox
        helper.preencherServicos(servicos);
    
    }
    
    public void atualizaValor(){
        helper.obterServico();
            Servico servico = helper.obterServico();
            helper.setarValor(servico.getValor());
    }
    
    public void atualizaId(){
        helper.preencherId();
    }
    
    public void agendar(){
    //buscar objeto agendamento da tela
    Agendamento agendamento = (Agendamento) helper.obterModelo();
    //salvar objeto no banco de dados 
    new AgendamentoDAO().insert(agendamento);
    //inserir objeto na tabela
    atualizaTabela();
    helper.limparTela();
    }
    
}
