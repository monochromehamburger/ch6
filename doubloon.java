import java.util.*;
class doubloon{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println(isDoubloon(word));
	}
	public static boolean isDoubloon(String word){
		word=word.toLowerCase();
		for(int i=0;i<word.length()-1;i++){
			int first=word.indexOf(word.substring(i,i+1));
			int second=word.indexOf(word.substring(i,i+1),first+1);
			if(second==-1)return false; 
			int third=word.indexOf(word.substring(i,i+1),second+1);
			if(third!=-1)return false;
		}
		return true;
	}
	
}
