
package gestaofuncionarios;


public class FuncionarioPJ extends Funcionario {
    
    private Double valorHora , horasTrabalhadas; 
    
    public FuncionarioPJ(String _nome , String _cpf , double _valorHora , double _horasTrabalhadas) {
        super(_nome , _cpf );
        this.valorHora = _valorHora;
        this.horasTrabalhadas = _horasTrabalhadas;
        
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
        
        
    
    
    @Override
    public double calcularPagamento() {
       return valorHora * horasTrabalhadas;
    }
    
}
