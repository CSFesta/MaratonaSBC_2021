package exercicios;

import java.util.Scanner;

public class H_Haja {
	private static Scanner sc = new Scanner(System.in);

	//FINALIZADO
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println(res(sc.nextInt(), sc.nextInt()));
	}

	static char res(int qntBlocos, int qntCores) {
		if (qntCores == 0)
			return 'N';
		int[] listB = new int[qntBlocos];
		int[] listC = new int[qntBlocos];
		for (int i = 0; i < listB.length; i++) {
			listB[i] = sc.nextInt();
			listC[i] = sc.nextInt();
		}
		if (qntCores == 1)
			return 'S';
		for (int i = 0; i < qntBlocos - 1; i++)
			for (int j = 0 + i; j < qntBlocos - 1; j++)
				if (listC[i] == listC[j + 1])
					if (listB[i] > listB[j + 1]) {
						int x = listB[i];
						listB[i] = listB[j + 1];
						listB[j + 1] = x;
					}

		return verificaCrescente(listB);
	}

	static char verificaCrescente(int[] listB) {
		if (listB.length == 0)
			return 'N';
		for (int i = 0; i < listB.length - 1; i++) {
			if (listB[i] > listB[i + 1])
				return 'N';
		}
		return 'Y';
	}

}
