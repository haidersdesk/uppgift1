package password2;

import java.util.Scanner;

public class password2 {

	public static void main(String[] args) {

		int i = 0;

		while (i < 3) { // while loop som repeterar tills variabel i �r like mindre �n 3

			System.out.println(" :::::::PLEASE ENTER A VALID PINCODE :::::::");
			Scanner reader = new Scanner(System.in);

			try {
				String userPass = reader.nextLine();
				int userPin = Integer.parseInt(userPass); // omvandla string till integer med parseInt
				System.out.println("Pincode accepted");
				break; // avsluta loop om anv�ndaren matar in siffror
			}

			catch (Exception e) { // Om anv�ndaren matar in fel
				System.err.println("You can only enter numbers");
				i++; // Variabel i h�js med +1

				if (i == 3) // om variabel �r lika med 3 d� visas meddelandet att konton �r avst�ngd
				{
					System.out.println("Sorry Your account is Locked");

				}

			}
		}

	}
}