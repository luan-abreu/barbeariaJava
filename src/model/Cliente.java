package model;


public class Cliente extends Pessoa{

    public Cliente(int id, String nome, char sexo, String telefone, String email){
        super(id, nome, sexo, telefone, email);
    }

    
    @Override
    public String toString(){
        return getNome();
    }
    
}


