import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3Q1 {

	public static void main(String[] args) {
		int listNum = 10;
		ArrayList<Integer> list = new ArrayList<Integer>();

		Random r = new Random();
		for (int i = 0; i < listNum; i++) {
			list.add(r.nextInt(49) + 1);
		}
		System.out.println(list);
		System.out.println("*****************");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		input.close();

		// Search
		int position = list.indexOf(number);

		if (position != -1) {
			System.out.println("the number is in the list.");
		} else {
			System.out.println("the number is not in the list.");
		}

	}

}