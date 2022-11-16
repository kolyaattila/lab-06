import java.util.Scanner;

public class ExVector {
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

		for (int i = 0; i < numar; i++) {
			System.out.println("V[" + i + "]=" + v[i]);
		}

	}
}