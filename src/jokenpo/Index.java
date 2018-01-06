
package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		String[] computador = {"Pedra", "Papel", "Tesoura"};
		
		int ganhou = 0, perdeu = 0, empatou = 0, movimento = 0, verificaResultado;
		String decidir;
		
		System.out.println("Insira sua jogada que seja pedra, papel ou tesoura");
		while(movimento ==0) {
			String jogador = teclado.next();
	
			if(jogador.equals("pedra")) {
				int i = random.nextInt(3);
				Pedra novaPedra = new Pedra(jogador, computador[i]);
				verificaResultado = novaPedra.getResultado();
			}
			else {
				if(jogador.equals("papel")) {
					int i = random.nextInt(3);
					Papel novoPapel = new Papel(jogador, computador[i]);
					verificaResultado = novoPapel.getResultado();
				}
				else {
					if(jogador.equals("tesoura")){
						int i = random.nextInt(3);
						Tesoura novoTesoura = new Tesoura(jogador, computador[i]);
						verificaResultado = novoTesoura.getResultado();
					}
					else {
						System.out.println("jogada Incorreta\n\n");
						System.out.println("Insira uma jogada válida");
						continue;
					}
				}
			}
			
			//Ganhar - 0, Empatar - 1,Perder - 2
			switch(verificaResultado) {
				case 0:
					ganhou++;
					break;
				case 1:
					empatou++;
					break;
				case 2:
					perdeu++;
					break;
			}
			
			System.out.println("\nVocê deseja parar de jogar?\n Digite - 1 se deseja, se não qual quer outra tecla");
			decidir = teclado.next();
			if (decidir.equals("1")) {
				movimento = 1;
			}
			else {
				movimento = 0;
				System.out.println("\nInsira sua jogada que seja pedra, papel ou tesoura");
			}
			
		}
		System.out.println("\n FIM DE JOGO");
		System.out.println("\n\n----------------------------------\n\n");
		System.out.println(" Ganhou --- " + ganhou);
		System.out.println(" Empatou --- " + empatou);
		System.out.println(" Perdeu --- " + perdeu);
		System.out.println("\n\n----------------------------------");
		teclado.close();
	}
}

