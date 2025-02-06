package practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="naveenkumardpi1@gmail.com";
		String pat="[a-z0-9]+@[a-z]+.[a-z]{2,3}";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(email);
		boolean matches = matcher.matches();
		System.out.println(matches);
		String data="Amazon 51000 employees in 18 states";
		pat="\\d+";
		Pattern compile2 = Pattern.compile(pat);
		Matcher matcher2 = compile2.matcher(data);
		while(matcher2.find())
		{
			String group = matcher2.group();
			System.out.println(group);
		}
	}

}
