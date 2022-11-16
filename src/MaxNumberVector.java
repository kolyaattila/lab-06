import java.util.Scanner;

public class MaxNumberVector {

	public static void main(String[] args) {
		System.out.println("Citeste si afiseaza numerele unui vector");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Numar de elemente: ");
		int numar = scanner.nextInt();

		int[] v = new int[numar];

		for (int i = 0; i < numar; i++) {
			System.out.print("V[" + i + "]=");
			v[i] = scanner.nextInt();
		}

		int max = v[0];
		for (int i = 1; i < numar; i++) {
			if (max < v[i]) {
				max = v[i];
			}
		}

		System.out.println("Valoarea maxima este: " + max);
	}

}
