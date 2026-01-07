
package gestaofuncionarios;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionarios {

    
    public static void main(String[] args) {
        
         Scanner leia = new Scanner(System.in);
         int escolha;       
         ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
           
        do  {  
           mostrarMenu();
           escolha = leia.nextInt();
           leia.nextLine();

            switch (escolha) {
              case 1:
               cadastrarFuncionario(leia, listaFuncionario);
              break;
                
              case 2:
                listarFuncionario(listaFuncionario);
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
        
        private static void cadastrarFuncionario(Scanner leia, ArrayList<Funcionario> lista) {
             System.out.println("Digite seu nome: ");
             String nome = leia.nextLine();

             System.out.println("Digite seu cpf: ");
             String cpf = leia.nextLine();

             System.out.println("CLT ou PJ?: ");
             String tipo = leia.nextLine().toUpperCase();

             switch (tipo) {
                 case "PJ":
                 System.out.println("Digite o valor da hora: ");
                 Double valorHora = leia.nextDouble();
                 leia.nextLine();
                 System.out.println("Digite quantas horas trabalhadas: ");
                 Double horasTrabalhadas = leia.nextDouble();
                 leia.nextLine();

                 Funcionario f = new FuncionarioPJ(nome, cpf, valorHora, horasTrabalhadas);
                 lista.add(f);
                 break;

            case "CLT":
                 System.out.println("Digite o salario base: ");
                 Double salarioBase = leia.nextDouble();
                 System.out.println("Digite o desconto: ");
                 Double desconto = leia.nextDouble();

                 Funcionario f2 = new FuncionarioCLT(nome, cpf, salarioBase, desconto);
                 lista.add(f2);
                 break;
                }
     
              }   
     
          public static void listarFuncionario(ArrayList<Funcionario> lista) {
                System.out.println("--- Lista de Funcionários ---");
                for (Funcionario fun : lista) {
                System.out.println("Nome: " + fun.getNome() + " | CPF: " + fun.getCpf() + " | Tipo: " + fun.getTipo() + " | Salario: " + fun.calcularPagamento());
            }
         }
}
    
