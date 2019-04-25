package calculangulo;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class RetornaAnguloRelogio {
	
	public static long calcular(GregorianCalendar horario) {
		//Em Java nos métodos construtores não é possível definir um tipo de dados de retorno.

		int hora = horario.getTime().getHours(); //Recebe a hora.
		int min = horario.getTime().getMinutes(); //Recebe o minuto.
			
		if (hora > 12) { //Esse "if" serve para tratar o formato da hora inserido pelo usuário.
			hora -= 12;
		}
			
		int anguloHora = (hora * (360/12)); //Hora que o usuário solicitou vezes o ângulo que correspondente cada hora.
		int anguloMin = (min * (360/60)); //Minuto que o usuário solicitou vezes o ângulo que correspondente cada minuto. 
			
		long calcAngulo = Math.abs(anguloHora - anguloMin);//Utiliza-se o método abs() da classe Math para retornar o valor absoluto.
		
		return calcAngulo; //Retorna o ângulo calculado.
	}

}
