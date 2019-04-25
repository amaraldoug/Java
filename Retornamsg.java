package calculangulo;

public class Retornamsg {

	public static String escrever(long calcAngulo){
		long angMenor = 0; //Inicializa a vari�vel angMenor
		long angMaior = 0; //Inicializa a vari�vel angMaior
		String msg = ""; //Inicializa a vari�vel msg.
		
		if (calcAngulo == 180) { //Se o �ngulo foi igual a 180� n�o h� a necessidade de mostrar qual o valor do outro �ngulo, uma vez que ser� o mesmo valor.
			msg = "O valor do �ngulo entre os ponteiros � de: " + calcAngulo +"�";
		} else if (calcAngulo > 180) {
			angMenor = (360 - calcAngulo); //Calcula �ngulo menor.
			angMaior = calcAngulo; //Calcula �ngulo maior.
			msg = "O menor �ngulo entre os ponteiro �: "+ angMenor +"�"
					+ "\nO maior �ngulo entre os ponteiros �: "+ angMaior + "�";
		} else {
			angMaior = (360 - calcAngulo); //Calcula �ngulo maior.
			angMenor = calcAngulo; //Calcula �ngulo menor.
			msg = "O menor �ngulo entre os ponteiro �: "+ angMenor +"�"
					+ "\nO maior �ngulo entre os ponteiros �: "+ angMaior + "�";
		}
		
		return msg; //Retorna a mensagem.
	}
}
