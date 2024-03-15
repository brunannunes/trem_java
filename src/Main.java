import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double SOb = 0;
        double SOa = 0;
        double Vb = 0;
        double Va = 0;
        double t = 0;
        double posicao = 0;
        int escolha = 0;
        int hora = 17;
        double horas = 0, minutos = 0, segundos = 0;
        double tempo = 0;
        String horario;



        Scanner ler = new Scanner(System.in);

        while (true){
           try{
               System.out.println("digite as opções desejadas \n1 - para calcular as colisões do trem \n2 - para sair do programa");
               escolha = ler.nextInt();
               switch (escolha){
                   case 1 ->{
                       try {
                           System.out.println("digite a posição inicial do trem A:");
                           SOa = ler.nextDouble();
                           System.out.println("digite a posição inicial do trem B:");
                           SOb = ler.nextDouble();

                           if (SOa > 10000 || SOa < 0 || SOb > 10000 || SOb < 0){
                               System.out.println("por favor o numero deve ser menor que 10.000");
                               continue;

                           }
                           System.out.println("digite a velocidade do trem A:");
                           Va = ler.nextDouble();

                           if (Va < 0 || Va > 300){
                               System.out.println("A velocidade do trem A sempre será positiva e sua velocidade deve ser menor que 300");
                               continue;
                           }
                           System.out.println("Digite a velocidade do trem B: ");
                           Vb = ler.nextDouble();

                           if (Vb > 0 || Vb < -300){
                               System.out.println("a velocidade do trem B sempre será negativa e sua velocidade deve ser menor que 300");
                               continue;
                           }

                           if ((Va == 0 && Vb == 0) || SOa > SOb){
                               System.out.println("\n os trem não colidiram");
                               continue;
                           }

                           t = (SOa - SOb) / (Vb - Va);

                           posicao = SOa + (Va * t);

                           tempo = t * 3600;

                           horas = t + hora;
                           minutos = (tempo/60) % 60;
                           segundos = tempo % 60;

                           horario = String.format("%02.0f:%02.0f:%02.0f", horas,minutos,segundos);

                           System.out.printf(" A colisão irá ocorrer na posição de KM %2.0f, no horario de %s e no segundo %2.0f\n", posicao, horario, tempo);


                       } catch (InputMismatchException e){
                           System.out.println("por favor digite apenas numeros");
                           ler.nextLine();

                       }

                   }case 2->{
                       System.out.println("Fim do programa !!");
                       System.exit(0);
                   }
               }

           }catch (InputMismatchException e){
               System.out.println("Por favor digite as opções indicadas");
               ler.nextLine();
           }


        }

    }
}