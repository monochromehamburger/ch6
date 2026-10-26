import java.util.*;
class Scrabble{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String letters=sc.nextLine();
		String word=sc.nextLine();
		System.out.println(isScrabble(word, letters));
	}
	public static boolean isScrabble(String word, String letters){
		for(int i=0;i<word.length();i++){
			int count=0;
			boolean found=false;
			for(int j=0;j<word.length();j++){
				if(j<i && word.charAt(j)==word.charAt(i)){
					found=true;
				}
				else if(word.charAt(j)==word.charAt(i))count++;
			}
			if(!found){
				int lastIndex=0;
				for(int j=0;j<count;j++){
					if(letters.substring(lastIndex).indexOf(word.charAt(i))!=-1){
						lastIndex+=letters.substring(lastIndex).indexOf(word.charAt(i))+1;
					}
					else{
						return false;
					}
				}
			}
		}
		return true;
	}
	
}
