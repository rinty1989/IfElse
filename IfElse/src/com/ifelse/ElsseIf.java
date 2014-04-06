package com.ifelse;

public class ElsseIf {
public static void main(String[] args){
	int a = 67;
	if (a>=99){
		System.out.println("Result A");
	}
	else if (a<90 && a>=80){
		System.out.println("Result B");
	}
	else if ( a< 79 && a>=60){
		System.out.println("Result C");
	}
	else if (a< 59 && a>=50){
		System.out.println("Result D");
	}
	else{
		System.out.println("Result F");
	}
}
}
