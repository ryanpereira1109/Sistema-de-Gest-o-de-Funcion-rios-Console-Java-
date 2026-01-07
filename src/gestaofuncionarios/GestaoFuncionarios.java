
package gestaofuncionarios;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionarios {

    
    public static void main(String[] args) {
        
         Scanner leia = new Scanner(System.in);
         int escolha;        Funcionario f;
         ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        
       
            
        do  {  
        mostrarMenu();
        escolha = leia.nextInt();
        leia.nextLine();

        switch (escolha) {
            case 1: 
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = leia.nextLine();
        System.out.println("CLT ou PJ?: ");
        String tipo = leia.nextLine();
 
        
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
          break;
                
            case 2:
                System.out.println("--- Lista de Funcionários ---");
               for (Funcionario fun : listaFuncionario) {
                System.out.println("Nome: " + fun.getNome() + " | CPF: " + fun.getCpf() + " | Tipo: " + fun.getTipo() + " | Salario: " + fun.calcularPagamento());
            }
                break;
                
            case 3:
               System.out.println("--- encerrando programa ---"); 
               break;
                
        }
        
        } while(escolha < 4 && escolha != 3);
    }
    
    
        public static void mostrarMenu() {
        System.out.println("1- Cadastrar funcionários");
        System.out.println("2- Listar funcionários");
        System.out.println("3- Sair");
 }
        
        
}
    
