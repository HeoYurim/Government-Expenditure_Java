package ch02;

import java.util.Scanner;

public class Test80_9 {

	public static void main(String[] args) {
	
		int major, liberal, general;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		major = scan.nextInt();
		System.out.print("교양 이수 학점 : ");
		liberal = scan.nextInt();
		System.out.print("일반 이수 학점 : ");
		general = scan.nextInt();
		
		boolean b = ((major + 
				
				liberal + general) >= 140) && (major >=70) && ((liberal >= 30 && general >=30) || (liberal + general >= 80));
		System.out.println("전공학점이 70 " + ((major >= 70)? "이상" : "이하"));
		System.out.println(b ? "졸업가능" : "졸업불가");
		
		
		/*	
		int Plus = major + liberal + general;
		
		if(Plus >= 140) {
			if((major >= 70)&&(liberal >=30 && general >=30)) {
				System.out.println("졸업 가능");
			}
			else if((major >= 70)&&((liberal + general) >= 80)) {
				System.out.println("졸업 가능");
			}
		}
		else {
			System.out.println("졸업 불가능");
		} */
		
	}

}
