import java.util.*;
class pigLatin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sentence=sc.nextLine();
		int lastIndex=-1;
		while(sentence.indexOf(" ", lastIndex+1)!=-1){
			int index=sentence.indexOf(" ",lastIndex+1);
			String temp=sentence.substring(lastIndex+1,index);
			if(temp.length()>2){
				System.out.print(temp.substring(1)+temp.charAt(0)+"ay ");
			}
			else{
				System.out.print(temp+" ");
			}
			lastIndex=index;
		}	
		if(sentence.substring(lastIndex+1).length()>2){
			System.out.print(sentence.substring(lastIndex+2)+sentence.charAt(lastIndex+1)+"ay");
		}
		else{
			System.out.print(sentence.substring(lastIndex+1)+" ");
		}
	}
}
