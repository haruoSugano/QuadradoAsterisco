package application;

import javax.swing.JOptionPane;



public class Program {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));//5
		int aux = 1;// acrescentar asterisco *
		
		// Faz um tratamento
		while(x<1) {//5 e maior que 1, nao há tratamento
			 x = Integer.parseInt(JOptionPane.showInputDialog("Erro.\nDigite um numero: "));
			
		} 

		 for( int i = 1; i <= (x/2)+1; i++) { //contador de linhas 5/2+1 = 3,5 arredondamento para baixo!! = 3
			 	//contador de espaços
				for( int j = (x/2)+1; j > i; j-- ) { // 1°laco -  5/2+1=3,5  3 > 1   3--
						System.out.print( "1" );//adicionando 2 espacos
				}
				for( int k = 1 ; k <= aux; k++ ) { //contador de asteriscos k<=1(aux)
						System.out.print( "*" );// adicionando 1(aux) asterisco
				}
				aux += 2; //aux adicionado;
				System.out.println();
		}
		 //aux == 7
		//lado oposto
		aux -= 2;
		//aux == 5
		for( int i = 1; i <= (x/2); i++ ) { //contador de linhas  i<3
		
				for( int j = 1; j <= i; j++ ) { //contador de espaços j<= i   1<=1 --> 1<=2
						System.out.print( "2" );// um espaco
				}
				aux -= 2;// aux == 3 -> aux == 1
				
				for( int k = 1 ; k <= aux; k++ ) { //contador de asteriscos 1 <= 4
						System.out.print( "*" );
				}
				System.out.println();
		}
	}

}
