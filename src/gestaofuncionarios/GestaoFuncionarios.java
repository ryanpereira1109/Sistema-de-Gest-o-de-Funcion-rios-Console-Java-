
package gestaofuncionarios;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionarios {

    
    public static void main(String[] args) {
        
        Funcionario f;
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = leia.nextLine();
        System.out.println("CLT ou PJ?: ");
        String tipo = leia.nextLine();
        System.out.println("Digite seu salario: ");
        Double salario = leia.nextDouble();
        
        switch(tipo) {
            case "PJ":

                System.out.println("Digite o valor da hora: ");
                Double valorHora = leia.nextDouble();
                System.out.println("Digite quantas horas trabalhadas: ");
                Double horasTrabalhadas = leia.nextDouble();
                
                f = new FuncionarioPJ(nome ,cpf , valorHora, horasTrabalhadas);
                System.out.println("Salario reajustado: " + f.calcularPagamento());
                listaFuncionario.add(f);
                break;
                
               
                
            case "CLT":
                
                System.out.println("Digite o salario base: ");
                Double salarioBase = leia.nextDouble();
                System.out.println("Digite o desconto: ");
                Double desconto = leia.nextDouble();
                
                
                f = new FuncionarioCLT(nome ,cpf, salarioBase , desconto);
                 System.out.println("Salario reajustado: " + f.calcularPagamento());
                 listaFuncionario.add(f);
                
                break;
                
            default:
                System.out.println("Digite um tipo valido.");
                break;
                
        }
        
        
    }
    
}
