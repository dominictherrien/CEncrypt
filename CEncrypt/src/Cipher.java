
import java.util.ArrayList;
public class Cipher {

	private static final int offset = 65;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	public void addChar(char c){
		int val = c - offset;
		int valTens = val / 10;
		int valOnes = val % 10;
		if (valTens>0)
			arr.add(valTens);
		arr.add(valOnes);
	}
	
	public void printNumCipher(){
		System.out.println("Offset sequence is ");
		for (int i = 0; i<arr.size(); ++i)
			System.out.print(arr.get(i));
		System.out.println();
	}
	
	public String encryptPhrase(String phrase){
		String output = "";
		int offset;
		for(int i = 0; i<phrase.length(); ++i){
			
			offset = 65;
			if (Character.isLowerCase(phrase.charAt(i)))
				offset = 97; 
			System.out.println(phrase.charAt(i));
			System.out.println((char)((phrase.charAt(i) - offset + arr.get(i%arr.size())) % 26));
			output = output + (char)(
					
					(phrase.charAt(i) - offset //brings it to char value 0
					
					+ arr.get(i%arr.size())) //add the shift value
					
					% 26) //wrap it around to 0 if it goes off the end of the alphabet
					
					+ offset; //bring it back up from its zeroed position
			
		}
		
		return output;
	}
	
	public int getIntAt(int i){
		return arr.get(i);
	}
}
