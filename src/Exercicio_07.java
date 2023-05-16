/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_7
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_07{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias de hospedagem: ");
        double qtdDias = teclado.nextDouble();
        double hospedagem, taxaServico, totalDiaria;
        if(qtdDias > 15){
            hospedagem = qtdDias * 60;
            taxaServico = qtdDias * 5.50;
            totalDiaria = hospedagem + taxaServico;
            System.out.println("O valor total da diária é: R$ " + totalDiaria);
        }
        else if(qtdDias == 15){
            hospedagem = qtdDias * 60;
            taxaServico = qtdDias * 6.00;
            totalDiaria = hospedagem + taxaServico;
            System.out.println("O valor total da diária é: R$ " + totalDiaria);
        }
        else if(qtdDias < 15){
            hospedagem = qtdDias * 60;
            taxaServico = qtdDias * 8.00;
            totalDiaria = hospedagem + taxaServico;
            System.out.println("O valor total da diária é: R$ " + totalDiaria);
        }
        teclado.close();
    }
}