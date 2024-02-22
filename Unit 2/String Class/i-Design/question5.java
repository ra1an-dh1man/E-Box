/*
input1:	Kattoor road,2nd cross Extension,coimbatore,India
 	kattoor road,2nd cross extension,Coimbatore,india
output:	BLUE

input2:	KR main road,Kashmir,India
	KR Street,Kashmir,India
output: GREEN
*/
import java.util.*;
public class Main {
	public static void main(String []args){
		//fill your code here
		Scanner scn = new Scanner(System.in);
		System.out.println("Address 1:");
		String add1 = scn.nextLine();

    System.out.println("Address 2:");
		String add2 = scn.nextLine();


		String res1 = add1.replaceAll(" ","");
		String res2 = add2.replaceAll(" ","");

  if(add1.equals(add2))
			System.out.println("RED");
		else if(add1.equalsIgnoreCase(add2))
			System.out.println("BLUE");
		else if(res1.equals(res2))
			System.out.println("YELLOW");
		else if(!(add1.equals(add2) || add1.equalsIgnoreCase(add2)))
			System.out.println("GREEN");
