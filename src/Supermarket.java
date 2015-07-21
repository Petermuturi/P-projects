import java.util.Scanner;
public class Supermarket {

	public static void main(String[] args) {
int mei=20,mchele=100,wimbi=120,oat=235,mille=145;//cereals per kg
int coke=99,maziwa=102,maji=40;//beverages per litre
int sukuma=40,spina=50,cabbo=65;//vegetables
int ugali=98,jog=88,exeflour=123,taifaflour=120;//per 2kg
int disjog=66,disugali=65,dismaji=20,discoke=75;
Scanner item=new Scanner(System.in);
System.out.println("Enter Item to check price");
		 String input=item.nextLine();
		switch(input){
		case "maize":
			System.out.println("price per cob is "+mei);
			break;
		case "rice":
			System.out.println("price per kg is "+mchele);
			System.out.println("price per 0.5kg is "+mchele/2);

			break;
		case "sorghum":
			System.out.println("price per kg is "+wimbi);
			System.out.println("price per 0.5kg is "+wimbi/2);

			break;
		case "soda":
			System.out.println("price per litre is "+coke);
			System.out.println("discounted price per litre is "+discoke);

			break;
		case "milk":
			System.out.println("price per litre is "+maziwa);
			break;
		case "water":
			System.out.println("price per litre is "+maji);
			System.out.println("price per litre is "+dismaji);

			break;
		case "kales":
			System.out.println("price per bunch is "+sukuma);
			break;
		case "spinach":
			System.out.println("price per bunch is "+spina);
			break;
		case "cabbage":
			System.out.println("price per bunch is "+cabbo);
			break;
		case "jembe":
			System.out.println("price per 2 kg is "+ugali);
			System.out.println("price per 0.5 kg is "+ugali/2);
			System.out.println("price per 2 kg is "+disugali);


			break;
		case "jogoo":
			System.out.println("price per 2 kg is "+jog);
			System.out.println("price per 0.5 kg is "+jog/2);
			System.out.println("Discounted price per 2kg is "+disjog);


			break;
		case "EXE":
			System.out.println("price per 2 kg is "+exeflour);
			System.out.println("price per 0.5 kg is "+exeflour/2);

			break;
		case "Taifa":
			System.out.println("price per 2 kg is "+taifaflour);
			System.out.println("price per 0.5 kg is "+taifaflour/2);

			break;
			default:
				System.out.println("Sorry Item not available");
				break;
				
		}}
	   
		   
	   

	}


