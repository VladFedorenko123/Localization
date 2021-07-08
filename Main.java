package src.srccode.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Localization en = new EnglishLocalization();
		Localization ua = new UkraineLocalization();
		Localization fr = new FranceLocalization();
		Localization huc = new HusulLocalization();

		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		in.close();

		System.out.println("Interface");

		List<String> listNames = new ArrayList<String>() {
			{
				add(en.printLocalization(name, en));
				add(ua.printLocalization(name, ua));
				add(ua.printLocalization(name, ua));
				add(fr.printLocalization(name, fr));
				add(huc.printLocalization(name, huc));
				add("Abstract");
				add(en.printThroughAbstract(name, en));
				add(ua.printThroughAbstract(name, ua));
				add(fr.printThroughAbstract(name, fr));
				add(huc.printThroughAbstract(name, huc));
			}
		};

		for (int i = 0; i < listNames.size(); i++) {
			System.out.println(listNames.get(i));
		}
	}
}
