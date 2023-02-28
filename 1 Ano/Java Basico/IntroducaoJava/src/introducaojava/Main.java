package introducaojava;
//Importando classe Joption para usarmos os paineis de diálogo
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int[] valores = new int[10];
		int maiorValor = 0;
		//receber e guardar os 10 números
		

			for (int i=0; i<10; i++) {
				do {
				valores[i]= Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i+1)+" º valor:"));

				}while (valores[i] < 0);
			}
			
		
		
	
      //criando variável para armazenar se usuário deseja encerrar o programa
		String repetir;
		//Inigio da estrutura para o menu
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja ver?"
			+ "\n 1 - Todos os valores"
			+ "\n 2 - Somente o primeiro valor"
			+ "\n 3 - Maior valor Digitado"
			+ "\n 4 - Somente o último valor"
			+ "\n 5 - Mostrar valores pares"));
			//programação do menu
			switch (opcao) {
			//mostrando todos os valores
			case 1:
				for (int i=0; i<10; i++) {
					JOptionPane.showMessageDialog(null, valores[i], "valor" + (i+1), JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			//mostrando somente o primeiro valor
			case 2:
				JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor", JOptionPane.INFORMATION_MESSAGE);
			break;
			//Mostrar o maior valor
			case 3:
				
				for(int i=0; i<10; i++) {
					if(i==0) {
						maiorValor = valores[i];
					}
					if (valores[i] >  maiorValor) {
						maiorValor = valores[i];
					}
					
				}
				JOptionPane.showMessageDialog(null, maiorValor, "Maior Valor", JOptionPane.INFORMATION_MESSAGE);
			break;
			//Mostrar Somente o Último valor 
			case 4:
				JOptionPane.showMessageDialog(null, valores[9],"Último valor", JOptionPane.INFORMATION_MESSAGE);
			break;
			//Mostrar somente os valores pares
			case 5:
				String valoresPares = "";
				for(int i=0; i<10; i++) {
					if(valores[i]%2==0) {
						if(valoresPares !="") {
							valoresPares += " ,";
						}
						valoresPares += valores[i];
					}
				}
				JOptionPane.showMessageDialog(null,  valoresPares, "valores Pares", JOptionPane.INFORMATION_MESSAGE);
			
			}
			
			//solicitar se usuario deseja voltar ao menu
	    repetir = JOptionPane.showInputDialog("Deseja voltar ao manu?"
	    		+ "\n Digite S ou s para sim ou outro caractere para encerrar:");
			//fim da estrutura de repetição para o menu
			
		} while (repetir.equals("S")||(repetir.equals("s")));
	}

}
