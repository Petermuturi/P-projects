import java.util.Scanner;


public class jane {
 public static void main(String arg[]){
	 System.out.println("Hey my name is Jane,and I'm looking for a guy with specifc qualities to go out with\n"
	 		+ "Please go through this test, and help me know a little about you.\n"
	 		+ "How old are you?");
	 int a = 0;
	 int b = 0;
	 int c = 0;
	 int d = 0;
	 int e = 0;
	 int f = 0;
	 int g = 0;
	 int h = 0;
	 int i = 0;
	 int j = 0;
	 int k = 0;
	 int l = 0;
	 int m = 0;
	 int n = 0;
	 Scanner age = new Scanner(System.in);
	 int ae = age.nextInt();
	 if(ae >= 26){
		 a= 10;
	 }System.out.println("Interesting.\n"
	 		+ "do you work?\nselect a number:(1:yes 2:no)");
	 Scanner wrk = new Scanner(System.in);
	 int yn = wrk.nextInt();
	 if(yn == 1){
		 b= 10;
	 }
	 System.out.println("Good to know.\n"
		 		+ "do you work-out?\nselect a number:(1:yes 2:no)");
		 Scanner ut = new Scanner(System.in);
		 int gym = ut.nextInt();
		 if(gym == 1){
			 c= 10;
		 }
	 System.out.println("Okay.\n"
		 		+ "Are you a coder?\nselect a number:(1:yes 2:no)");
		 Scanner cd = new Scanner(System.in);
		 int oe = cd.nextInt();
		 if(oe == 1){
			 d= 10;
		 }
	 System.out.println("Cool\n"
		 		+ "Are you are Christian?\nselect a number:(1:yes 2:no)");
		 Scanner ch = new Scanner(System.in);
		 int st = ch.nextInt();
		 if(st == 1){
			 e= 10;
		 }
	 System.out.println("Okay.\n"
		 		+ "Do You live alone?\nselect a number:(1:yes 2:no)");
		 Scanner lv = new Scanner(System.in);
		 int aln = lv.nextInt();
		 if(aln == 1){
			 f= 10;
		 }
	 System.out.println("Haha, cool.\n"
		 		+ "Do you love pets?\nselect a number:(1:yes 2:no)");
		 Scanner pt = new Scanner(System.in);
		 int es = pt.nextInt();
		 if(es == 1){
			 g= 10;
		 }
	 System.out.println("Me too.\n"
		 		+ "Do you own a car?\nselect a number:(1:yes 2:no)");
		 Scanner cr = new Scanner(System.in);
		 int ar = cr.nextInt();
		 if(ar == 1){
			 h= 10;
		 }
	 System.out.println("Cool, just a couple of more qustions.\n"
		 		+ "Do you own a carpet(s)in the house?\nselect a number:(1:yes 2:no)");
		 Scanner cp = new Scanner(System.in);
		 int ets = cp.nextInt();
		 if(ets == 1){
			 i= 10;
		 }
	 System.out.println("About shoes....\n"
		 		+ "Do you own brown shoes?\nselect a number:(1:yes 2:no)");
		 Scanner brn = new Scanner(System.in);
		 int shs = brn.nextInt();
		 if(shs == 1){
			 j= 10;
		 }
		 System.out.println("Here are some bonus questions you can answer.\n"
			 		+ "Do you play any sport?\nselect a number:(1:yes 2:no)");
			 Scanner sp = new Scanner(System.in);
			 int rt = sp.nextInt();
			 if(rt == 1){
				 k= 6;
			 }
		 System.out.println("Cool.\n"
			 		+ "Do you read books?\nselect a number:(1:yes 2:no)");
			 Scanner bk = new Scanner(System.in);
			 int oo = bk.nextInt();
			 if(oo == 1){
				 l= 6;
			 }
		 System.out.println("Okay.\n"
			 		+ "How many times a day do you Shower?\nselect a number:(1:Once 2:Twice)");
			 Scanner sh = new Scanner(System.in);
			 int wer = sh.nextInt();
			 if(wer == 2){
				 m= 6;
			 }
 
		 System.out.println("The last qst.\n"
			 		+ "Do you love dogs?\nselect a number:(1:yes 2:no)");
			 Scanner dg = new Scanner(System.in);
			 int ss = dg.nextInt();
			 if(ss == 1){
				 n= 6;
			 }
	 int z = a+b+c+d+e+f+g+h+i+j+k+l+m+n;
	 System.out.println(z);
 }
}
