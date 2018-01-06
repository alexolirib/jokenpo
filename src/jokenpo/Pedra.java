package jokenpo;

public class Pedra {
	private int resultado;

	Pedra(String jogador, String Computador) {
		System.out.println("Seu oponente escolheu " + Computador);
		//Possiveis resultados 0 - Ganhou, 1 - empatou, 2 - perdeu
		
		if (Computador.equals("Papel")) {
			System.out.println("Você perdeu");
			this.resultado = 2;
		} else {
			if (Computador.equals("Pedra")) {
				System.out.println("Deu empate");
				this.resultado = 1;
			} else {
				if (Computador.equals("Tesoura")) {
					System.out.println("Parabéns, você ganhou!");
					this.resultado = 0;
				}
			}
		}
	}
	
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
}

