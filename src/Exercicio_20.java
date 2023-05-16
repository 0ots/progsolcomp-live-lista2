/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_20
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_20{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a carga máxima do elevador: ");
        double cargaMaxima = teclado.nextDouble();
        System.out.println("Digite a capacidade máxima de pessoas do elevador: ");
        double qtdpessoasMaxima = teclado.nextDouble();
        double totalPeso = 0;
        double totalPessoa = 1;
        do{
            System.out.println("Digite o peso de quem entrará no elevaro: ");
            double pesonovoOcupante = teclado.nextDouble();
            totalPeso += pesonovoOcupante;
            totalPessoa += 1;
        }while(totalPeso <= cargaMaxima && totalPessoa <= qtdpessoasMaxima);
        System.out.println("Você atinngiu uma ou mais restrições do elevador.");
        teclado.close();
    }
}
