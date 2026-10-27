import java.util.*;
class Binary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		String output="";
		while(input>0){
			if(input%2==0){
				output="0"+output;
			}
			else{
				output="1"+output;
			}
			input/=2;
		}
		System.out.println(output);
		
	}
}
