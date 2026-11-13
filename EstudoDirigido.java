/**

* DOMÍNIO:
* Tema: Adivinhe o Número Secreto no Terminal
* CLASSES E ATRIBUTOS:
* Classe jogo
* numeroSecreto (int): Número gerado que o jogador deve adivinhar.
* vidas (int): Quantidade de tentativas restantes.
* Classe Jogador
* nome (String): Nome do jogador.
* chute (int): O número digitado pelo jogador.
* VALIDAÇÕES PREVISTAS
* Validar a entrada do número
* Validar o chute do jogador
* TEMPO PREVISTO
* A aula inteira
* USO DE IA
* Sera usada o gemini para me ajudar nas minhas duvidas
*/

import java.util.Random;
import java.util.Scanner;

public class EstudoDirigido {
public static void main(String[] args) {
Jogo jogo = new Jogo();

Jogador jogador = new Jogador();
Scanner leitura = new Scanner(System.in);
 
System.out.println("Digite seu nome: ");
 
jogador.nome = leitura.nextLine();

while (jogo.vida > 0) {
System.out.println("Digite seu chute: ");
jogador.chute = leitura.nextInt();
System.out.println("\n");

if (jogador.chute == jogo.numeroSecreto) {
System.out.println("Parabéns, você acertou !!");
break;
}
System.err.println("Número errado, tente de novo.");
jogo.vida--;
System.out.println("\n");
System.out.println("Sua vida atual é: " + jogo.vida);
}
if (jogo.vida == 0) {
System.out.println("Você perdeu.");
System.out.println("\n");
System.out.println("O número era:" + jogo.numeroSecreto);
}
leitura.close();
}
}
 
class Jogo {
int vida = 3;
int numeroSecreto = new Random().nextInt(10) + 1;
 
 
}

class Jogador {
String nome;
int chute;
 
}
