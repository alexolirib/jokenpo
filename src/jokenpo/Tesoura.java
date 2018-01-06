package jokenpo;

public class Tesoura {
	private int resultado;
	
	Tesoura(String jogador, String Computador) {
		//Possiveis resultados 0 - Ganhou, 1 - empatou, 2 - perdeu
		
		System.out.println("Seu oponente escolheu " + Computador);
		if (Computador.equals("Papel")) {
			System.out.println("Parabéns, você ganhou!");
			this.resultado = 0;
		} else {
			if (Computador.equals("Pedra")) {
				System.out.println("Você perdeu");
				this.resultado = 2;
			} else {
				if (Computador.equals("Tesoura")) {
					System.out.println("Empatou");
					this.resultado = 1;
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