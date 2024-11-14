package controller.helper;

import java.util.ArrayList;
import model.Agendamento;
import view.Agenda;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import model.Cliente;
import model.Servico;

public class AgendaHelper implements IHelper{
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo o table model
        //é um for each, ele consegue acessar cada  
        //agendamento dentro da lista "agendamento"
        
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
            
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
              
                
            });
                    
        }
        
    }
    
    
    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjClienteBox().getModel();
        
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
            
        }
        
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjServicoBox().getModel();
        
        for (Servico servico : servicos) {
            
            comboBoxModel.addElement(servico);
            
        }
        
    }
    
    public void preencherId() {
        JTextField idField = view.getIdField();
        idField.setText("0");
    }
    
    public Cliente obterCliente() {           
        return (Cliente) view.getjClienteBox().getSelectedItem();        
    }
    
    public Servico obterServico() {
        return (Servico) view.getjServicoBox().getSelectedItem();    
    }
    

    public void setarValor(float valor) {
        view.getValorField().setText(valor + "");
    }
    
    public void setarId(int id){
        view.getIdField().setText("0");
    }

    @Override
    public Object obterModelo() {
        
        String idString = view.getIdField().getText();
        int id = Integer.parseInt(idString); 
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getValorField().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getDataField().getText();
        String hora = view.getHoraField().getText();
        String dataHora = data + " " + hora;    
        String observacao = view.getObservacaoField().getText();
        
        Agendamento agendameto = new Agendamento(id, cliente, servico, valor, dataHora, observacao);       
        return agendameto;
    }

    @Override
    public void limparTela() {
        view.getIdField().setText("0");
        view.getDataField().setText("");
        view.getHoraField().setText("");
        view.getObservacaoField().setText("");
    }

    

    

    
  
}
