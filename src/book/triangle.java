package book;

import java.util.Scanner;



public class triangle {


	String n;
	
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Please set line number");
    String n = sc.nextLine();
    try {
      triangle(Integer.valueOf(n));

    } catch (Exception e) {
      System.out.println("input error");
    }

  }


  private static void triangle(int len) {

    for (int i = 0; i <= len; i++) {

      for (int j = 0; j < i; j++) {

        System.out.print(" ");

      }

      for (int k = 0; k <= (len - i) * 2; k++) {

        System.out.print("*");
      }

      System.out.println(" ");
    }
  }


}

