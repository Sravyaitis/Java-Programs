public class One {

	public static void main(String[] args) {
		// count num of words in string
		
		String Sentence = "One Two Three Four";
		int countWords = Sentence.split("\\s").length; //Split a string by spaces
		System.out.println(countWords);
		
		System.out.println("*********************");
		
		//Split a string into an array of strings:
		String myStr = "Split a string by spaces, and also punctuation.";
//		String reqex = "[,\\.\\s]";
		//String reqex = "[,\\.\\s]";
		//String reqex = "[,\\.\\s]";
		String[] myArray = myStr.split("[,\\.\\s]");
		for(String s : myArray) {
			System.out.println(s);
		}

	}

}
