import java.util.Scanner;

//@author Marlon Rodrigues//

public class conversor_java {

    public static void main(String args[]) {
        float m, km, m3, litro;
        int opcao;

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Digite 1 para converter quilometros em metros: ");
            System.out.println("Digite 2 para converter metros cúbicos em litros: ");
            System.out.println("Digite 3 para sair do programa!");
            System.out.println("----------------------------------------------------");

            Scanner menu = new Scanner(System.in);

            opcao = menu.nextInt();

            System.out.println("");

            if (opcao >= 1 && opcao <= 3) {
                if (opcao == 1) {
                    System.out.println("Digite o valor do quilômetro a ser convertido em metro: ");
                    km = menu.nextInt();
                    System.out.println("");
                    m = (km * 1000);
                    System.out.println( km + " quilômetro(s) convertido(s) equivale(m) a: " + m + " metro(s).\n");
                } 
                
                else if (opcao == 2) {
                    System.out.println("Digite o valor do litro a ser convertido em metro cúbico: ");
                    litro = menu.nextInt();
                    System.out.println("");
                    m3 = (litro / 1000);
                    System.out.println( litro + " litro(s) convertido(s) equivale(m) a: " + m3 + " metro(s) cúbico(s).\n");
                }

                else {
                    System.out.println("Você escolheu sair do programa!");
                    System.exit(0);
                }
            }

            else {
                System.out.println("Essa opção não existe, tente novamente!\n");
            }
        } while (opcao != 3);
    }
}
