package calculangulo;

import javax.swing.JOptionPane;

public class Entrada {
	
	public static int horaEntrada(int horaE){
		
		//Trata a entrada de dados para se caso o usu�rio informar uma hora inv�lida o sistema pe�a outra.
		do{
		horaE = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora desejada: "));
		if (horaE > 24){
			JOptionPane.showMessageDialog(null, "Hora inv�lida, favor inserir entre 0 e 24!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		}while(horaE > 24);
	
	return horaE; //Retorna a hora digitada pelo usu�rio.
	}
		
	public static int minutoEntrada(int minE){
		
		//Trata a entrada de dados para se caso o usu�rio informar um minuto inv�lido o sistema pe�a outro.
		do{
			minE = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto desejado: "));
			if (minE > 59){
				JOptionPane.showMessageDialog(null, "Minuto inv�lido, favor inserir entre 0 e 59!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			}while(minE > 59);
	
		return minE; //Retorna o minuto digitada pelo usu�rio.
	}
}
