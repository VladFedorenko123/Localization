package src.srccode.example;

import java.util.Calendar;

public interface Localization {
	default String printLocalization(String name, Localization loc) {
		Calendar cal = Calendar.getInstance();

		return cal.get(Calendar.MINUTE) % 2 == 0 ? ("Hello, " + loc.getMale() + "  " + name)
				: ("Hello, " + loc.getFamale() + name);
	}

	String printThroughAbstract(String name, Localization loc);

	String getMale();

	String getFamale();

}
