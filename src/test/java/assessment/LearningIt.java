package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIt {

	public void larbenumber(int[] arr)

	{
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (large < arr[i]) {
				large = arr[i];
			}
		}
		System.out.println(large);
	}

	public void countOfCharacter(String input, char ch) {
		char[] charArray = input.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (ch == charArray[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

	public void sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int num : arr) {
			System.out.println(num);
		}
	}

	void checkAnagram() {
		String one = "ball";
		String two = "loabl";
		if (one.length() == two.length()) {
			char[] ch1 = one.toCharArray();
			char[] ch2 = two.toCharArray();
			boolean check = false;
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]) {
						check = true;
						break;
					} else {
						check = false;
					}
				}
				if (!check) {
					break;
				}
			}
			boolean check1 = false;
			for (int i = 0; i < ch2.length; i++) {
				for (int j = 0; j < ch1.length; j++) {
					if (ch2[i] == ch1[j]) {
						check1 = true;
						break;
					} else {
						check1 = false;
					}
				}
				if (!check1) {
					break;
				}
			}
			if (check && check1) {
				System.out.println("both are anagram");
			} else {
				System.out.println("both are not anagram");
			}
		} else {
			System.out.println("Length are not same, hence cannot be anagram");
		}

	}

	public void split()
	{
		String num="34,995.00";
		String replace = num.replaceAll("[^0-9]", "");
		System.out.println(replace);
		int parseInt = (Integer.parseInt(replace))/100;
		System.out.println(parseInt);
	}
	public static void main(String[] args) {

//		

		
		  int[] numbers = {45, 12, 78, 34, 89, 23}; LearningIt it=new LearningIt();
		 
		 // it.checkAnagram();
		  it.split();
		 

	}

}
