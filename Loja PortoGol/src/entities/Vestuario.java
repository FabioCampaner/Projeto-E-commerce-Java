package entities;

import java.util.Scanner;

public final class Vestuario extends Produto {
	
	Scanner entrada = new Scanner(System.in);
	private String tamanho; //PP,P,M,G,GG
	private char cor; //RGBW
	
	
	//CONSTRUTOR ---------------------------------------------------------------------//	
	public Vestuario(String codigo, String nome, double valor, int estoque) {
		super(codigo, nome, valor, estoque);
	}
	
	//MÉTODOS COM POLIMORFISMO-------------------------------------------------------//
	@Override
	public String getTamanho() {
		return tamanho;
	}

	
	@Override
	public char getCor() {
		return cor;
	}
	
	@Override
	public void escolherTamanho(String tamanho ) {
			
	if(tamanho.equals("PP")  || tamanho.equals("P") || tamanho.equals("M")  || tamanho.equals("G")  || tamanho.equals("GG") ) {
				
			this.tamanho = tamanho;
		}
		else{
			System.out.printf("\n─────────────────────────────────────────────────────────────────────────────────");
			System.out.print("\n Digite um tamanho válido: ");
			tamanho = entrada.nextLine().toUpperCase();
			escolherTamanho(tamanho);
				
		}
			
	}
	
	@Override
	public void escolherCor(char cor) {
			
		if(cor == 'R' || cor == 'G' || cor == 'B' || cor == 'W') {
				
			this.cor = cor;
		}
		else{	
			System.out.printf("\n─────────────────────────────────────────────────────────────────────────────────");
			System.out.printf("\n Digite uma cor válida \n R - Vermelho,\n G - Verde,\n B - Azul,\n W - Branco.\n Cor: ");
			cor = entrada.nextLine().toUpperCase().charAt(0);
			escolherCor(cor);
		}
			
	}

}