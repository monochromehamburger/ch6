import java.util.*;
class word{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println(isAbecedarian(word));
	}
	public static boolean isAbecedarian(String word){
		for(int i=1;i<word.length();i++){
			if(word.charAt(i)<=word.charAt(i-1)){
				return false;
			}
		}
		return true;
	}
	
}
