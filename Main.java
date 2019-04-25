package calculangulo;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar horario = new GregorianCalendar(); //Inicializa horario.
		
		while(true) {
			
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Digite a ação desejada: \n" //Mostra para o usuário o menu de opções.
					+ "1 - Calcular o ângulo entre os ponteiros \n" + "2 - Sair"));
			
			switch(acao) {
			case 1:
				
				int horaE = 0; //Inicializa a variável hora de entrada.
				int minE = 0; //Inicializa a variável minuto de entrada.
				
				int hora = Entrada.horaEntrada(horaE); //Recebe a hora de entrada do método horaEntrada da classe Entrada.
				int min = Entrada.minutoEntrada(minE); //Recebe o minuto de entrada do método minutoEntrada da classe Entrada.
				      
				horario.set(2019, 4, 25, hora, min); //Seta as variáveis parâmentros hora e min para horario.
				
				long calcAngulo = RetornaAnguloRelogio.calcular(horario); //Passa horário como parâmetro para o método calcular da classe RetornaAnguloRelogio.
				
				String msg = Retornamsg.escrever(calcAngulo); //Passa o ângulo calculado na classe RetornaAnguloRelogio, para o método escrever da classe Retornamsg, para essa modelar a resposta.
				
				JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.OK_CANCEL_OPTION); //Mostra na tela para o usuário a mensagem com a resposta.
				
			break;
			case 2: 
				System.exit(0); //Sai do sistema.
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION); //Avisa o usuário que o caracter digitado é inválido.
			break;
			}
		}
	}

}
