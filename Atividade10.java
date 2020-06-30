package tarefaAula;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Atividade10 {

	public static void main(String[] args) {
		//Mostre a data atual do sistema
		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = formatar.format(data);
		System.out.println(dataFormatada);
	}

}
