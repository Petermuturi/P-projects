import java.util.Scanner;//importing scanner library that is used to get keyboard input
public class Moringa {//defining the class that hold the entire program
public static void main(String args[]){//main method header
	System.out.println("Hallo, I am Traffic-Guide:"+"\n"+"enter 1 to check which roads have traffic."+"\n"+
			"enter 2 to check which roads do not have traffic."+"\n"+"Enter 3 to check individual roads");
	Scanner road=new Scanner(System.in);
	int choose=road.nextInt();
if(choose==1){
	System.out.print("These roads have traffic:NgongRoad, MombasaRoad,JogooRoad");
}else if(choose==2){
	System.out.print("These roads have traffic:WaiyakiRoad, MbagathiRoad");
}else{
	

System.out.println(" 1:ngong 2:waiyaki 3:MombasaRoad 4:mbagathi 5:Jogoo");
System.out.println(" enter number the road you wish to check traffic status:");

int baro=road.nextInt();
switch(baro){
case 1:
	System.out.println("There is traffic along ngongroad");
	break;
case 2:
	System.out.println("There is no traffic along Waiyaki road");
	break;
case 3:
	System.out.println("There is traffic along Mombasa road");
	break;
case 4:
	System.out.println("There is no traffic along Mbagathi road");
	break;
case 5:
	System.out.println("There is no traffic along jogoo road");
	break;

default:
	System.out.println("Please Enter the available roads.");
    break;
}}}};
 