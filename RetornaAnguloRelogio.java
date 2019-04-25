package calculangulo;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class RetornaAnguloRelogio {
	
	public static long calcular(GregorianCalendar horario) {
		//Em Java nos m�todos construtores n�o � poss�vel definir um tipo de dados de retorno.

		int hora = horario.getTime().getHours(); //Recebe a hora.
		int min = horario.getTime().getMinutes(); //Recebe o minuto.
			
		if (hora > 12) { //Esse "if" serve para tratar o formato da hora inserido pelo usu�rio.
			hora -= 12;
		}
			
		int anguloHora = (hora * (360/12)); //Hora que o usu�rio solicitou vezes o �ngulo que correspondente cada hora.
		int anguloMin = (min * (360/60)); //Minuto que o usu�rio solicitou vezes o �ngulo que correspondente cada minuto. 
			
		long calcAngulo = Math.abs(anguloHora - anguloMin);//Utiliza-se o m�todo abs() da classe Math para retornar o valor absoluto.
		
		return calcAngulo; //Retorna o �ngulo calculado.
	}

}
