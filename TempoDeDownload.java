package git;
import java.util.Scanner;
public class TempoDeDownload {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Qual o tamanho do arquivo em MB");
		double MB = scan.nextDouble();
		
		System.out.println("Velocidade da Internet em MBPS: ");
			double MBPS = scan.nextDouble();
			double megabytesPorSegundo = MBPS / 8;
			double tempo = MB / megabytesPorSegundo;
			double convertMin = tempo / 60;
			double convertHR = convertMin / 60;
			
				System.out.println(megabytesPorSegundo + " Megabytes por segundo.");
				System.out.println("Tempo Aproximado De Download Do Arquivo Usando Este Link \n");

//				System.out.println("Total de " + tempo + " segundos");
//				System.out.println("Total de " + convertMin + " minutos");
//				System.out.println("Total de " + convertHR + " horas");
//								OOOUUU
				System.out.println("Total em segundos: " + tempo);
				System.out.println("Total em minutos " + convertMin);
				System.out.println("Total em horas " + convertHR);	
	}
}
