import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
         
     double saldo = 3000;
     String nome = "Julio";
     String tipoConta = "corrente";
     int opcao = 0;

     Scanner leitura = new Scanner (System.in);

     System.out.println("******************************");
     System.out.println("Olá " + nome );
     System.out.println("Tipo de conta: " + tipoConta);
     System.out.println("Salado inicial " + saldo);
     System.out.println("******************************");

     boolean parar = false;
     while (!parar){
        System.out.println("******************************");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("0 - Sair");
        System.out.println("******************************");
        try {
            System.out.println("insira um número");
            opcao = leitura.nextInt();
        if (opcao == 1){
            System.out.println("Seu saldo é de R$ " + saldo);
        } else if (opcao == 2){
            System.out.println("qual valor deseja adicionar? ");
            try{
                double valorAdicionar = leitura.nextDouble();
                saldo += valorAdicionar;
                System.out.println("Seu novo saldo é de R$ " + saldo);
            }catch (Exception erro){
                System.out.println("Opção inválida, insira uma opção válida:");
                leitura.next();
            }
        }else if (opcao ==3){
            System.out.println("Quanto deseja transferir? ");
            try{
                double valorTransferir = leitura.nextDouble();
                if (valorTransferir > saldo){
                    System.out.println("Desculpe, saldo insuficiente");
                }else {
                    saldo -= valorTransferir;
                    System.out.println("Seu novo saldo é de R$ " + saldo);
                }
            }catch (Exception erro){
                System.out.println("Opção inválida, insira uma opção válida: ");
                leitura.next();
            }
        }else if (opcao == 0) {
            parar = true;
         break;
        }else {
            System.out.println("opção inválida, insira uma opção válida:");
          }
        }catch (Exception erro){
        leitura.next();
        }
     }
        System.out.println("Operação finalizada!");
    }
}