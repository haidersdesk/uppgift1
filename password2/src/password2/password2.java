package password2;

import java.util.Scanner;

public class password2 {

	public static void main(String[] args) {

		int i = 0;

		while (i < 3) { // while loop som repeterar tills variabel i är mindre än 3

			System.out.println(" :::::::PLEASE ENTER A VALID PINCODE :::::::");
			Scanner reader = new Scanner(System.in);

			try {
				String userPass = reader.nextLine();
				int userPin = Integer.parseInt(userPass); // omvandla string till integer med parseInt
				System.out.println("Pincode accepted");
				break; // avsluta loop om användaren matar in siffror
			}

			catch (Exception e) { // Om användaren matar in fel
				System.err.println("You can only enter numbers");
				i++; // Variabel i höjs med +1

				if (i == 3) // om variabel är lika med 3 då visas meddelandet att konton är avstängd
				{
					System.out.println("Sorry Your account is Locked");

				}

			}
		}

	}
}
