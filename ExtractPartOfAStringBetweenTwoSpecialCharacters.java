package org.off.wrk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPartOfAStringBetweenTwoSpecialCharacters {
	public static void main(String[] args) throws IOException {
		/*
		 * String str = "21*90'89\""; Pattern pattern =
		 * Pattern.compile("'(.*?)\""); Matcher matcher = pattern.matcher(str);
		 * if (matcher.find()) { System.out.println(matcher.group(1));
		 */

		File f = new File("F:\\FileRead.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;
		String[] words = null;
		int count = 0;
		while ((line = br.readLine()) != null) {
			words = line.split(" ");
			Pattern pattern = Pattern.compile(".com/(.*?)>");
			Matcher matcher = pattern.matcher(line);
			for (String word : words) {
				if (matcher.find()) {
					count++;
					System.out.println(matcher.group(1));

				}
			}

		}
	}
}
