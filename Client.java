package week9workshop;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// Question 1 creating a list
		ArrayList<String> words = new ArrayList<>();
		// Question 2 adding items to a list
		words.add("I");
		words.add("solemnly");
		words.add("swear");
		words.add("that");
		words.add("I");
		words.add("am");
		words.add("upto");
		words.add("no");
		words.add("good");
		// Question 3 - displaying the length of the list
		System.out.println("Number of items in list: " + words.size());
		// Question 4 - display the fifth item
		System.out.println("Fifth item: " + words.get(4));
		// Question 5 - display last item in list
		System.out.println("Last item: " + words.get(words.size() -1));
		// Question 6 - Replace the fifth item by the String you. 
		// Then display the list.
		words.set(4, "you");
		System.out.println("Words: " + words);
		// Question 7 - Remove the second item. 
		// Display the removed item (as Removed item: <value>). 
		// Display the list.
		System.out.println("Removed item: " + words.remove(1));
		System.out.println(words);
		// Question 8 - Replace the fifth item by the String are. 
		// Display the list.
		words.set(4, "are");
		System.out.println(words);
		// Question 9 - Add the String real before the last item. 
		// Display the list.
		words.add(words.size()-1, "real");
		System.out.println(words);
		// Question 10 - Number of words with > 4 characters
		int lengthyWordCount = 0;
		for (String word : words) {
			if (word.length() > 4) {
				lengthyWordCount ++;
			}
		}
		System.out.println("Num words > 4 chars: " + lengthyWordCount);
		int lengthyWordCount2 = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > 4) {
				lengthyWordCount2 ++;
			}
		}
	}
	
	/**
	 * 
	 * @param list
	 * @return true if all items in the list are positive
	 * IMPORTANT: 
	 * return false if list is null
	 * return true if list is empty
	 */
	public static boolean allPositives(ArrayList<Integer> list) {
		if(list == null)
			return false;
		for(Integer item: list) {
			if(item <= 0) { //<= means NOT positive
				return false;
			}
		} //end of loop
		return true;
	}

	/**
	 * 
	 * @param list
	 * @return true if all items in the list are even (divisible by 2)
	 * IMPORTANT: 
	 * return false if list is null
	 * return true if list is empty
	 */
	public static boolean allEven(ArrayList<Integer> list) {
		return false; //to be completed
	}
	
	//countInRange goes here
	
	/**
	 * 
	 * @param list
	 * modify the list so that each item beomes the square of its previous value
	 */
	public static void squared(ArrayList<Integer> list) {
		//to be completed
	}
	
	public static void removeNegatives(ArrayList<Integer> list) {
		//to be completed
	}
	
	public static ArrayList<Integer> getExclusiveItems(ArrayList<ArrayList<Integer>> list) {
		return null; //to be completed
	}
}
