package com.ga.superhero;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static int wrongs = 0;
	public static int corrects = 0;
	public static List<String> superheroes = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("test"|);
		File file = new File("input.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;

		while ((st = br.readLine()) != null)
			superheroes.add(st);

		playGame();
	}


	public static String playBatmanName (String str) {
		String name = Superhero.askName(str);
		if (name.equalsIgnoreCase("Bruce Wayne")) {
			corrects++;
			return name;
		} else {
			wrongs++;
			return "Wrong Name";
		}

	}
	public static String playBatmanCity (String str) {
		String city = Superhero.askCity(str);
		if (city.equalsIgnoreCase("Gotham")) {
			corrects++;
			return city;
		} else {
			wrongs++;
			return "Wrong city";
		}
	}


	public static String playSupermanName (String str) {
		String name = Superhero.askName(str);
		if (name.equals("Clark Kent")) {
			corrects++;
			return name;

		} else {
			wrongs++;
			return "Wrong Name";
		}
	}
	public static String playSupermanCity (String str) {
		String city = Superhero.askCity(str);
		if (city.equalsIgnoreCase("Metropolis")) {
			corrects++;
			return city;
		} else {
			wrongs++;
			return "Wrong City";
		}
	}

	public static String playSpidermanName (String str) {
		String name = Superhero.askName(str);
		if (name.equalsIgnoreCase("Peter Parker")) {
			corrects++;
			return name;
		} else {
			wrongs++;
			return "Wrong Name";
		}
	}
	public static String playSpidermanCity (String str) {
		String city = Superhero.askCity(str);
		if (city.equalsIgnoreCase("NYC")) {
			corrects++;
			return city;
		} else {
			wrongs++;
			return "Wrong City";
		}
	}

	public static String playWonderwomanName (String str) {
		String name = Superhero.askName(str);
		if (name.equalsIgnoreCase("Diana")) {
			corrects++;
			return name;
		} else {
			wrongs++;
			return "Wrong Name";
		}
	}
	public static String playWonderwomanCity (String str) {
		String city = Superhero.askCity(str);
		if (city.equalsIgnoreCase("Metropolis")) {
			corrects++;
			return city;
		} else {
			wrongs++;
			return "Wrong City";
		}

	}

	public static void playAgain () throws IOException {
		System.out.println(wrongs + " " + corrects);
		System.out.println("Do you want to play again?");
		String answer = Superhero.askQuestion();
		if (answer != null && answer.equalsIgnoreCase("yes")) {
			playGame();
		} else {
			System.out.println(Superhero.declareWinner(wrongs, corrects));
			System.out.println("Thank you for playing");
			System.exit(0);
		}
	}

	public static void playGame () throws IOException {
		int superhero = Superhero.askSuperhero(superheroes);
		switch(superhero) {
			case 1:
				String name = playSupermanName("Superman");
				String city = playSupermanCity("Superman");
				outputFile("output.txt", "Superman " + name, city);
				playAgain ();
				break;
			case 2:
				name = playBatmanName("Batman");
				city = playBatmanCity("Batman");
				outputFile("output.txt","Batman " + name, city);
				playAgain ();
				break;
			case 3:
				name = playSpidermanName("Spiderman");
				city = playSpidermanCity("Spiderman");
				outputFile("output.txt", "Spiderman " + name, city);
				playAgain ();
				break;
			case 4:
				name = playWonderwomanName("Wonder Woman");
				city = playWonderwomanCity("Wonder Woman");
				outputFile("output.txt", "Wonder Woman " + name, city);
				playAgain ();
				break;
		}

	}

	public static void outputFile (String fileName, String name, String city) throws IOException {
		try {
			FileWriter writer = new FileWriter("output.txt", true);
			writer.write("\r\n");
			writer.write(name + " " + city);
			writer.write("\r\n");   // write new line
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}


