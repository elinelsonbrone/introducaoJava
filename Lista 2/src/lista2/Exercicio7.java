package lista2;



import javax.swing.JOptionPane;

public class Exercicio7 {

//7) Um estudante do ensino m�dio gostaria de controlar melhor suas notas nas disciplinas exatas. 
//Ele gostaria de poder enxergar suas notas dos 4 bimestres com exatamente duas casas decimais e em formato de matriz, como no exemplo a seguir:

//Matem�tica      Fisica     Qu�mica
// 9.53           8.66       8.45
// 7.57           9.00       8.01
// 8.87           9.44       7.88
// 7.30           6.77       9.21

//Al�m disso, o estudante gostaria de poder escolher algumas op��es de visualiza��o de acordo com o menu abaixo:
//Todas as notas de todas as disciplinas;
//Qual a maior nota e em qual disciplina foi;
//A m�dia das notas de alguma disciplina (solicitar qual);
//As notas de um dos bimestres (solicitar qual);
//Encerrar.
//Fa�a um programa que permita cadastrar as notas de acordo com o exemplo (considerando a ordem das disciplinas) 
//e forne�a os dados supracitados. O menu deve ser exibido repetitivamente, at� que o usu�rio deseje encerrar o programa.

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ol� usu�rio. Este programa"
				+ " foi desenvovildo com o objetivo de mostar as \n notas de um " + " aluno de forma organizada. ");
		int l;
		int c;
		double[][] notas = new double[4][3];
		String[] materias = new String[3];
		double Maiornota = 0;
		double mediaAlgumasdiciplinas = 0;
		double somaNotas = 0;
		int linha =0;
		int opcao;
		String  retornar = "";
		
		materias[0] = "Matem�tica";
		materias[1] = "F�sica";
		materias[2] = "Qu�mica";
		 
       
        	for (l = 0; l < 4; l++) {
    			for (c = 0; c < 3; c++) {

    					
    					notas[l][c] = Double.parseDouble(JOptionPane
    							.showInputDialog(" Informe a "+ (l + 1) + " � nota de " + materias[c]));

    				 while ((notas[l][c] < 0)||(notas[l][c] > 10)) {
    					 
    					 notas[l][c] = Double.parseDouble(JOptionPane
     							.showInputDialog(" Informe a "+ (l + 1) + " � nota de " + materias[c])); 
    				 }

    			}
    		}
        	
        	do {
        		
    		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o que voc� deseja \n ver suas notas:"
    				+ "\n 1 - Todas as notas de todas as disciplinas;" + "\n 2 - A maior nota e em qual disciplina foi;"
    				+ "\n 3 - A m�dia das notas de alguma \n disciplina (solicitar qual)"
    				+ "\n 4 - As notas de um dos bimestres (solicitar qual);" + "\n 5 - Encerrar."));
    	
    		switch (opcao) {
    		// Mostrar todas as notas
    		case 1:
    			for (l = 0; l < 4; l++) {
    				for (c = 0; c < 3; c++) {
    					JOptionPane.showMessageDialog(null,notas[l][c]," " + materias[c], JOptionPane.INFORMATION_MESSAGE);
    				}
    			}

    			break;
    		// Verificar qual a maior nota em determinada mat�ria.
    		case 2:
    			String melhorMateria = "";

    			for (l = 0; l < 4; l++) {
    				for (c = 0; c < 3; c++) {

    					if (notas[l][c] > Maiornota) {

    						Maiornota = notas[l][c];
    						melhorMateria = materias[l];
    					}
    				}
    			}
    			JOptionPane.showMessageDialog(null, Maiornota, " a maior nota � de " + melhorMateria,
    					JOptionPane.INFORMATION_MESSAGE);
    			break;
    		// verificar A m�dia das notas de alguma disciplina
    		case 3:
    			int consulta;
    			do {

    				consulta = Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina voc� gotaria de ver a m�dia:"
    						+ " \n 1 - Matem�tica" + " \n 2 - F�sica" + " \n 3 - Quimica:"));

    				switch (consulta) {
    				// m�dia de matem�tica
    				case 1:
    					somaNotas =0;
    					for (c = 0; c < 3; c++) {
    						somaNotas = somaNotas + notas[0][c];
    					}

    					mediaAlgumasdiciplinas = somaNotas / 4;
    					JOptionPane.showMessageDialog(null, mediaAlgumasdiciplinas, " m�dia de matem�tica ",
    							JOptionPane.INFORMATION_MESSAGE);
    					break;
    				// m�dia de f�sica
    				case 2:
    					somaNotas = 0;

    					for (c = 0; c < 3; c++) {
    						somaNotas = somaNotas + notas[1][c];
    					}
    					mediaAlgumasdiciplinas = somaNotas / 4;
    					JOptionPane.showMessageDialog(null, mediaAlgumasdiciplinas, " m�dia de f�sica",
    							JOptionPane.INFORMATION_MESSAGE);
    					break;
    				// media de qu�mica
    				case 3:
    					somaNotas =0;
    					for (c = 0; c < 3; c++) {
    						somaNotas = somaNotas + notas[2][c];
    					}
    					mediaAlgumasdiciplinas = somaNotas / 4;
    					JOptionPane.showMessageDialog(null, mediaAlgumasdiciplinas, " m�dia de qu�mica ",
    							JOptionPane.INFORMATION_MESSAGE);
    					break;
    				default:
    					JOptionPane.showMessageDialog(null, "Comando inv�lido");
    					break;
    				}

    			} while (((consulta == 1) || (consulta == 2) || (consulta == 3)) == false);

    			break;
    		// Notas de 1 dos bimestres
    		case 4:
    
    			do {
    				
    				linha = Integer.parseInt(JOptionPane.showInputDialog("Informe qual bimestre voc� que ver \n a nota(1�, 2�, 3� ou "
    						+ "4�)"));
    				
    			}while((linha <1)|| (linha >4));
    			
    			 linha -= 1;
    			 
    			JOptionPane.showMessageDialog(null,materias[0] +  " " +  materias[1] + " " + materias[2] + " \n "
    				+ notas[linha][0] + " " + notas[linha][1] + " " 	+ notas[linha][2]);	 
    			 
    			

    			break;
    		// encerrar
    		case 5:
    			System.exit(0);
    			break;
    		default:
    			JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
    			break;

    		}
    		//perguntar se o usu�rio deseja retornar ao menu.
			
            retornar = JOptionPane.showInputDialog(" Deseja Voltar ao menu?"
            		+ " Digite S ou s para sim outro para n�o.");
        }while (retornar.equals("S")||(retornar.equals("s")));
		
	}

}
