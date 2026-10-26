import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		String text="";
		for(int i=0;i<line.length();i++){
			if(!nonLetters.contains(line.substring(i,i+1))){
				text+=line.substring(i,i+1);
			}
		}
		boolean works=true;
		for(int i=0;i<text.length()/2;i++){
			if(text.charAt(text.length()-i-1)!=text.charAt(i)){
				works=false;
			}
		}
		if(works) System.out.println("YES");
		else System.out.println("NO");
	}
}
