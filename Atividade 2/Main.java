import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("Conversor de temperatura");
            System.out.println("1 - celsius para fahrenheit");
            System.out.println("2 - fahrenheit para celsius");
            System.out.println("0 - sair");
            opcao = teclado.nextLine();

            switch (opcao) {
            
                case "1":
                    System.out.print("Digite a temperatura que deseja converter: ");
                    int c = teclado.nextInt();
                    teclado.nextLine();
                    Conversor conversorC = new Conversor(c);
                    int resultadoF = conversorC.cparaf();
                    System.out.printf("%d°C = %d°F", c, resultadoF);
                    break;

                case "2":
                    System.out.print("Digite a temperatura que deseja converter: ");
                    int f = teclado.nextInt();
                    teclado.nextLine();
                    Conversor conversorF = new Conversor(f);
                    int resultadoC = conversorF.fparac();
                    System.out.printf("%d°F = %d°C", f, resultadoC);
                    break;

                case "0":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("0"));
        teclado.close();
    }
}