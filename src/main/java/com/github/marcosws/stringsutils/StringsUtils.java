package com.github.marcosws.stringsutils;

public class StringsUtils {
	
	public static String removeAccents(String text) {
		
		String lettersWithAccents = "ÁÃÂÀÄÅÉÊËÈÏÍÌÎÓÕÔÖÒÚÙÛÜÇÑÝŸŠáãâàäåéêëèïíìîóõôöòúùûüçñýÿš";
		String lettersWithoutAccents = "AAAAAAEEEEIIIIOOOOOUUUUCNYYSaaaaaaeeeeiiiiooooouuuucnyys";
		for(int i = 0; i < lettersWithAccents.length(); i++) 
			text = text.replace(lettersWithAccents.charAt(i), lettersWithoutAccents.charAt(i));
		return text;
		
	}
	
	public static String normalize(String texto) {
		return removeAccents(texto).replaceAll("[^A-Za-z0-9]","").toUpperCase();
	}

}

