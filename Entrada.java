package calculangulo;

import javax.swing.JOptionPane;

public class Entrada {
	
	public static int horaEntrada(int horaE){
		
		//Trata a entrada de dados para se caso o usuário informar uma hora inválida o sistema peça outra.
		do{
		horaE = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora desejada: "));
		if (horaE > 24){
			JOptionPane.showMessageDialog(null, "Hora inválida, favor inserir entre 0 e 24!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		}while(horaE > 24);
	
	return horaE; //Retorna a hora digitada pelo usuário.
	}
		
	public static int minutoEntrada(int minE){
		
		//Trata a entrada de dados para se caso o usuário informar um minuto inválido o sistema peça outro.
		do{
			minE = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto desejado: "));
			if (minE > 59){
				JOptionPane.showMessageDialog(null, "Minuto inválido, favor inserir entre 0 e 59!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			}while(minE > 59);
	
		return minE; //Retorna o minuto digitada pelo usuário.
	}
}
