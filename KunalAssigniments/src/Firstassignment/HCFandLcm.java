package Firstassignment;

import java.util.Scanner;

public class HCFandLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b=sc.nextInt(),temp1,temp2,temp,hcf,lcm;
		temp1=a;
		temp2=b;
		while(temp2!=0) {
			temp=temp2;//3,1
			temp2=temp1%temp2;//1,0
			temp1=temp;//3,1
		}
		hcf=temp1;
		lcm=a*b/hcf;
System.out.println("the hcf and lcm are " + hcf +" "+lcm);
	}

}
