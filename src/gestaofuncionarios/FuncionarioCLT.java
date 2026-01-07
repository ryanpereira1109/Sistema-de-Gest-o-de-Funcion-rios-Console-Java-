
package gestaofuncionarios;


public class FuncionarioCLT extends Funcionario {
    
    
    private double desconto , salarioBase;





    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public FuncionarioCLT(String _nome , String _cpf ,double _salarioBase, double _desconto) {
        super(_nome , _cpf );
        
        this.salarioBase = _salarioBase;
        this.desconto = _desconto;
    }
    
    
    
    @Override
    public double calcularPagamento() {
        
      return salarioBase - desconto;
      
        
    }
    
}
