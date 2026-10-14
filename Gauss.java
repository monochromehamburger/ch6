import java.util.*;
class Gauss{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int number2=sc.nextInt();
		System.out.println(gauss(number,number2));
	}
	public static double gauss(int x, int n){
		double output=1;
		double current=1;
		for(int i=2;i<=n;i++){
			current*=-1;
			current*=x*x;
			current/=i-1;
			output+=current;
		}
		return output;
	}
}

