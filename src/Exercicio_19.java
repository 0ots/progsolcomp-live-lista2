/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_19
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_19{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o volume inicial: ");
        double volumeInicial = teclado.nextDouble();
        double tempo = 0;
        double i = volumeInicial;
        while(i <= 1000){
            i *= 2;
            tempo++;
        }
        System.out.println("O volume " + volumeInicial + " levará " + tempo + " segundos para atingir 1000 centímetros cúbicos.");
        teclado.close();
    }
}
