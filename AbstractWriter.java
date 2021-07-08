package src.srccode.example;

import java.util.Calendar;

public abstract class AbstractWriter implements Localization {
	public String printThroughAbstract(String name, Localization loc) {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.MINUTE) % 2 == 0 ? ("Hello, " + loc.getMale() + name)
				: ("Hello, " + loc.getFamale() + name);
	}

}
