package String;
import java.util.*;
public class OrdenarString {
	
	
	public static void main(String [] args) {
		
		String [] tira = {"hola", "como", "estas", "loco"};
		
		
		Arrays.sort(tira);
		
		for(int i = 0 ; i < tira.length ; i++) {
			
			System.out.println(tira[i] + " ");
		}
	
	}
}
