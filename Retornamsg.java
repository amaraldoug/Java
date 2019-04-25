package calculangulo;

public class Retornamsg {

	public static String escrever(long calcAngulo){
		long angMenor = 0; //Inicializa a variável angMenor
		long angMaior = 0; //Inicializa a variável angMaior
		String msg = ""; //Inicializa a variável msg.
		
		if (calcAngulo == 180) { //Se o ângulo foi igual a 180º não há a necessidade de mostrar qual o valor do outro ângulo, uma vez que será o mesmo valor.
			msg = "O valor do ângulo entre os ponteiros é de: " + calcAngulo +"º";
		} else if (calcAngulo > 180) {
			angMenor = (360 - calcAngulo); //Calcula ângulo menor.
			angMaior = calcAngulo; //Calcula ângulo maior.
			msg = "O menor ângulo entre os ponteiro é: "+ angMenor +"º"
					+ "\nO maior ângulo entre os ponteiros é: "+ angMaior + "º";
		} else {
			angMaior = (360 - calcAngulo); //Calcula ângulo maior.
			angMenor = calcAngulo; //Calcula ângulo menor.
			msg = "O menor ângulo entre os ponteiro é: "+ angMenor +"º"
					+ "\nO maior ângulo entre os ponteiros é: "+ angMaior + "º";
		}
		
		return msg; //Retorna a mensagem.
	}
}
