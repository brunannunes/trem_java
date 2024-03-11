import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double SOb = 0;
        double SOa = 0;
        double Vb = 0;
        double Va = 0;

        Scanner ler = new Scanner(System.in);

        while (true){
            try {
                System.out.println("digite a posição inicial do trem A:");
                SOa = ler.nextDouble();
                if (SOa > 10000){
                    System.out.println("por favor o numero deve ser menor que 10.000");

                }
            } catch (InputMismatchException e){
                System.out.println("por favor digite apenas numeros");
                ler.nextLine();
                continue;
            }
            try {
                System.out.println("digite a velocidade do trem A:");
                Va = ler.nextDouble();

                if (Va < 0){
                    System.out.println("A velocidade do trem A sempre será positiva");
                }
            }catch (InputMismatchException e){
                System.out.println("digite apenas numeros");
                ler.nextLine();
                continue;
            }
            try {
                System.out.println("digite a posição inicial do trem B:");
                SOb = ler.nextDouble();

                if ()
            }


        }

    }
}