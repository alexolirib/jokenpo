package jokenpo;

public class Papel {
	private int resultado;

	Papel(String jogador, String Computador) {
		System.out.println("Seu oponente escolheu " + Computador);
		//Possiveis resultados 0 - Ganhou, 1 - empatou, 2 - perdeu

		if (Computador.equals("Papel")) {
			System.out.println("Empatou");
			this.resultado = 1;
		} else {
			if (Computador.equals("Pedra")) {
				System.out.println("Parab�ns, voc� ganhou!");
				this.resultado = 0;
			} else {
				if (Computador.equals("Tesoura")) {
					System.out.println("Voc� perdeu ");
					this.resultado = 2;
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