/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author AndreNwa
 */
public class contato {
    
    private String nome;
    private String telefone;
    private String tipoDeNegocio;
    private String horarioContato;
    
    private String permissao;
    private boolean habilitado;

    public contato(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoDeNegocio() {
        return tipoDeNegocio;
    }

    public void setTipoDeNegocio(String tipoDeNegocio) {
        this.tipoDeNegocio = tipoDeNegocio;
    }

    public String getHorarioContato() {
        return horarioContato;
    }

    public void setHorarioContato(String horarioContato) {
        this.horarioContato = horarioContato;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
    public void salvar(){
        
    }
    
    
    
    
    
}
