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
  
    	String a[] = {"","one","two","three","four","five","six","seven","eight","nine"}; 
    	if(n>=20 && n<30){
    		int A=n-20;
    		return "twenty "+a[A];
    	}
    	if(n>=30 && n<40){
    		int A=n-30;
    		return "thirty "+a[A];
    	}
    	if(n>=40 && n<50){
    		int A=n-40;
    		return "fourty "+a[A];
    	}
       	if(n>=50 && n<60){
    		int A=n-50;
    		return "fifty"+a[A];
    	}
    	if(n>=60 && n<70){
    		int A=n-60;
    		return "sixty "+a[A];
    	}
    	if(n>=70 && n<80){
    		int A=n-70;
    		return "seventy"+a[A];
    	}
    	if(n>=80 && n<90){
    		int A=n-80;
    		return "eighty "+a[A];
    	}
    	if(n>=90 && n<100){
    		int A=n-90;
    		return "ninety "+a[A];
    	}
    	if(n==100){
    		return "one hundred";
    	}
    	return "";
    }
}
