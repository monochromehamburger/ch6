import java.util.*;
class PPAP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();
		int index1=line.indexOf("I have a ");
		int index2=line.indexOf("I have a ",index1+1);
		String output="UH! ";
		output+=line.substring(index2+9,index2+10).toUpperCase();
		output+=line.substring(index2+10);
		output+=" ";
		output+=line.substring(index1+9,index2-2);
		System.out.println(output);
	}
}
