package mchesney_ice1;

import java.util.Map;

public class Template {
	
	public Template(String s) {
		words = s.split("\\s");
	}
	
	public String instantiate(Map<String, String> args) {
		String [] string_array = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			if (isVar(words[i])) {
				if (args.containsKey(words[i]))
					string_array[i] = args.get(words[i]);
			} else {
				string_array[i] = words[i];
			}
		}
		return String.join(" ", string_array);
	}

	private boolean isVar(String s) {
		return s.charAt(0) == '$';
	}

	private String [] words;
	
}
