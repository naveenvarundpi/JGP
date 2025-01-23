package javachallenge;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="fly me   to   the moon";
		String[] split = s.split(" ");
		int length = split[split.length-1].length();
		System.out.println("Last word of the string: "+split[split.length-1]+" and it's length: "+length);
	}

}
