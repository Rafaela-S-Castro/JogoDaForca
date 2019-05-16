package forca;

import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char letra;
		int opcao, sorteio;
		
		String pGame, teste;
		String forca = " |-----| \r\n " + "|     | \r\n " + "| \r\n " + "| \r\n " + "| \r\n " + "| \r\n " + "|__\r\n"
				+ "       \r\n" + "PALAVRA: ";
		String[] palavras = new String[] { "banana", "maça", "limao", "tomate", "melancia" };
		Random r = new Random();

		System.out.println("----JOGO DA FORCA----");
		System.out.println("---------MENU--------");
		System.out.println("1# Iniciar Jogo");
		System.out.println("2# Adicionar palavra");
		System.out.println("3# Sair");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(forca);
			
			sorteio = r.nextInt(5); pGame = palavras[sorteio];
			
			System.out.println(pGame);
			String[] palavraEscondida = new String[pGame.length()];
			
			for(int i = 0; i < palavraEscondida.length; i++) {
				palavraEscondida[i] = "_";
				System.out.print(palavraEscondida[i] + " ");
			}
			
			teste = pGame;
			
			int acertos = 0;
			int erros = 0;
			do {
			System.out.println("");
			System.out.println("Insira uma letra: ");
			letra = sc.next().charAt(0);
			
			/*LÓGICA VERIFICAR E INSERIR LETRA*/
			
			for (int i = 0; i < pGame.length(); i++) {
				
				if (pGame.charAt(i) == letra) {
					palavraEscondida[i] = Character.toString(letra);
					acertos ++;
				}else {
					erros ++;
				}
			}
			
			for(int i = 0; i < palavraEscondida.length; i++) {
				
				if(palavraEscondida[i] != "_") {
					System.out.print(palavraEscondida[i] + " ");
				}
				else {
					System.out.print(palavraEscondida[i] + " ");
				}
				
			   }
			
			}while(acertos < teste.length());
			
			System.out.println("\n\rVoce ganhou meu corno!");
			
			break;
		case 2:

			break;
		case 3:

			break;
		}

	}

}
