import java.util.Scanner;

public class PalidromExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		String input = sc.nextLine();

		boolean check = checkpalidrom(input);
		if (check) {
			System.out.println("Yes its palidrome");

		} else {
			System.out.println("Not a palidrome");
		}

	}

	private static boolean checkpalidrom(String input) {
		// TODO Auto-generated method stub
		String output = input.replaceAll("\\s+", "").toLowerCase();

		return output.equals(new StringBuffer(output).reverse().toString());
	}

}
