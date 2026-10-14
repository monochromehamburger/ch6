import java.util.*;
class Roots{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(squareRoot(number));
	}
	public static double squareRoot(int n){
		double guess=n/2;
		double lastGuess=n/2;
		while(Math.abs(guess*guess-n)>0.0001 && Math.abs(lastGuess*lastGuess-n)>0.0001){
			lastGuess=guess;
			guess=(guess+n/guess)/2;
		}
		return guess;
	}
}
