package calculangulo;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar horario = new GregorianCalendar(); //Inicializa horario.
		
		while(true) {
			
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Digite a a��o desejada: \n" //Mostra para o usu�rio o menu de op��es.
					+ "1 - Calcular o �ngulo entre os ponteiros \n" + "2 - Sair"));
			
			switch(acao) {
			case 1:
				
				int horaE = 0; //Inicializa a vari�vel hora de entrada.
				int minE = 0; //Inicializa a vari�vel minuto de entrada.
				
				int hora = Entrada.horaEntrada(horaE); //Recebe a hora de entrada do m�todo horaEntrada da classe Entrada.
				int min = Entrada.minutoEntrada(minE); //Recebe o minuto de entrada do m�todo minutoEntrada da classe Entrada.
				      
				horario.set(2019, 4, 25, hora, min); //Seta as vari�veis par�mentros hora e min para horario.
				
				long calcAngulo = RetornaAnguloRelogio.calcular(horario); //Passa hor�rio como par�metro para o m�todo calcular da classe RetornaAnguloRelogio.
				
				String msg = Retornamsg.escrever(calcAngulo); //Passa o �ngulo calculado na classe RetornaAnguloRelogio, para o m�todo escrever da classe Retornamsg, para essa modelar a resposta.
				
				JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.OK_CANCEL_OPTION); //Mostra na tela para o usu�rio a mensagem com a resposta.
				
			break;
			case 2: 
				System.exit(0); //Sai do sistema.
			break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION); //Avisa o usu�rio que o caracter digitado � inv�lido.
			break;
			}
		}
	}

}
