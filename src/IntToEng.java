
import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n==0) return "zero";
    	if(n==1) return "one";
    	if(n==2) return "two";
    	if(n==3) return "three";
    	if(n==4) return "four";
    	if(n==5) return "five";
    	if(n==6) return "six";
    	if(n==7) return "seven";
    	if(n==8) return "eight";
    	if(n==9) return "nine";
    	if(n==10) return "ten";
    	if(n==11) return "eleven";
    	if(n==12) return "twelve";
    	if(n==13) return "thirteen";
    	if(n==14) return "fourteen";
    	if(n==15) return "fifteen";
    	if(n==16) return "sixteen";
    	if(n==17) return "seventeen";
    	if(n==18) return "eighteen";
    	if(n==19) return "nineteen";	
    	if(n==20) return "twenty";
    	
    	String a[] = {"","one","two","three","four","five","six","seven","eight","nine"}; 
    	if(n>=21 && n<30){
    		int A=n-20;
    		return "twenty "+a[A];
    	}
    	if(n==30) return "thirty";
    	if(n>=31 && n<40){
    		int A=n-30;
    		return "thirty "+a[A];
    	}
    	if(n==40) return "fourty";
    	if(n>=41 && n<50){
    		int A=n-40;
    		return "fourty "+a[A];
    	}
    	return "";
    }
}
