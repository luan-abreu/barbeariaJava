package model;


public class Usuario extends Pessoa {
    
    protected String senha;
    protected String nivelAcesso;
    protected String rg;

    public Usuario(int id, String nome, char sexo, String telefone, String email, String rg, String senha, String nivelAcesso){
        super(id, nome, sexo, telefone, email);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.rg = rg;
    }

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
   
    
    
}
