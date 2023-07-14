package exercicios;

import java.util.Scanner;

public class K_Katmandu {
	private static Scanner sc = new Scanner(System.in);

	//FINALIZADO
	
	public static void main(String[] args) {
		System.out.println(res(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}

	static char res(int minsDescansado, int tempoTotal, int qntRef) {
		if (qntRef == 0) {
			if (tempoTotal >= minsDescansado)
				return 'Y';
			return 'N';
		}
		int[] list = new int[qntRef];
		for (int i = 0; i < qntRef; i++)
			list[i] = sc.nextInt();
		if (list[0] > minsDescansado)
			return 'Y';
		for (int i = 0; i < qntRef - 1; i++)
			if (list[i + 1] - list[i] >= minsDescansado)
				return 'Y';

		if (tempoTotal - list[list.length - 1] >= minsDescansado)
			return 'Y';
		return 'N';

	}
}
