package Model.DAO;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;   
import java.text.ParseException;
import java.util.ArrayList;


public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "barbeiro", 'M', "30212121", "rafael.novo@fmpsc.edu.br", "521454123", "barbeiro", "administrador");
        Usuario usuario2 = new Usuario(2, "estagiario", 'M', "30212122", "jefferson.silva@aluno.fmpsc.edu.br", "451244123", "estagiario", "funcionario");
        Usuario usuario3 = new Usuario(3, "jefferson", 'M', "4898823721", "barbeiro@barbershop.com", "12345", "12345", "proprietario");
        Usuario usuario4 = new Usuario(4, "rafaelprofessor", 'M', "4898823721", "barbeiro@barbershop.com", "521454123", "12345", "administrador");

           
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", 'M', "30212126", "rafael.novo@fmpsc.edu.br");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30212127", "jefferson.silva@aluno.fmpsc.edu.br");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", 'M', "30212128", "pauloricardo@gmail.com");
        Cliente cliente4 = new Cliente(4, "Neymar Junior", 'M', "30212130", "neymarjunior@gmail.com");
        Cliente cliente5 = new Cliente(5, "Cristiano Ronaldo", 'M', "30212131", "cris@gmail.com");
        Cliente cliente6 = new Cliente(6, "Matuidi Pareira", 'M', "302122324", "matuidi@gmail.com");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", 'F', "302121292", "martasouza@gmail.com");
        Cliente cliente8 = new Cliente(8, "Aline Souza", 'F', "302121451", "alinesouza@gmail.com");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", 'M', "302121189", "samuelcoltinho@gmail.com");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", 'M', "3021212478", "felipeluis@gmail.com");
        
        Servico servico1 = new Servico(1, "Corte Simples", 18);
        Servico servico2 = new Servico(2, "Corte Degrade", 30);
        Servico servico3 = new Servico(3, "Barba Simples", 15);
        Servico servico4 = new Servico(4, "Barba Desenhada", 25);
        Servico servico5 = new Servico(5, "Sombrancelhas", 10);
        Servico servico6 = new Servico(6, "Penteados", 35);

        Agendamento agendamento1 = new Agendamento(0, cliente9, servico6, 30, "28/11/2023 14:00", "cliente vai atrasar");
        Agendamento agendamento2 = new Agendamento(0, cliente3, servico1, 40, "28/11/2023 14:00", "cliente vai atrasar");
        Agendamento agendamento3 = new Agendamento(0, cliente5, servico3, 18, "28/11/2023 14:00", "cliente vai atrasar");
       
     
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        usuario.add(usuario4);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        //agendamento.add(agendamento1);
        //agendamento.add(agendamento2);
        //agendamento.add(agendamento3);
        
    }
    
    
}
