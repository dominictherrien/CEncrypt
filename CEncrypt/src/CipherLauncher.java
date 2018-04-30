import java.util.Scanner;
import java.util.ArrayList;

public class CipherLauncher {
	
	public static void main(String[] args) {
		Cipher cipher = new Cipher();
		Scanner entry = new Scanner(System.in);
		String key;
		String phrase;
		
		System.out.println("Enter the key:");
		key = entry.nextLine();
		key = key.toUpperCase();
		
		for (int i = 0; i < key.length(); ++i)
			cipher.addChar(key.charAt(i));
		
		cipher.printNumCipher();
		
		System.out.println("Enter the phrase to be encoded:");
		phrase = entry.nextLine();
		System.out.println(cipher.encryptPhrase(phrase));
	}
	
	

}
