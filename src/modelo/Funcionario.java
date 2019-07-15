package modelo;

public class Funcionario {
 
    private String nome;
    private String sobrenome;
    private double salario;
    private int codCargo;
    private int tempServico;
    public String cargo;
    
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    
    public String getSobrenome(){
    
    return this.sobrenome;
    
}
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public int getTempServico() {
        return tempServico;
    }

    public void setTempServico(int tempServico) {
        this.tempServico = tempServico;
    }
    
}