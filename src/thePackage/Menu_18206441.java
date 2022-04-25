
/*
 * @author Name: Nabil Ahmed
 * Student ID: 18206441
 * Campus: Parramata
 * Tutor Name: Paul Davies
 * Class day: Friday
 * Class Time: 3:00pm-4:00pm & 11:00am-1:00pm
 */
package thePackage;

import java.util.Scanner;

public class Menu_18206441 {

  static Scanner kb = new Scanner(System.in);

  //displayMenuItem is the method for menu item
  public static void displayMenuItem(String[] menu) {

    System.out.println("Enter your menu choice");
    System.out.println();

    for (int i = 0; i < menu.length; i++) {
      System.out.println((i + 1) + "." + menu[i]);

    }

  }

  //displayMenuItem1 is the method for menu items
  public static void displayMenuItem1(String[] menu) {
    System.out.println("Enter your menu choice");
    System.out.println();

    for (int i = 0; i < menu.length; i++) {
      System.out.println((i + 1) + "." + menu[i]);
    }
  }

  public static int getMenuChoice(int minimumMenu, int maximumMenu) {

    int userInput;
    do {
      userInput = kb.nextInt();
      if (userInput < minimumMenu || userInput > maximumMenu) {
        System.out.println("Menu choice out of range");

      }

    } while (userInput < minimumMenu || userInput > maximumMenu);
    return userInput;

  }

  //It is the method to get the menu
  public static int getMenuChoice1(int minMenu1, int maxMenu1) {

    int userInput1;
    do {
      userInput1 = kb.nextInt();
      if (userInput1 < minMenu1 || userInput1 > maxMenu1) {
        System.out.println("Menu choice out of range");
      }

    } while (userInput1 < minMenu1 || userInput1 > maxMenu1);
    return userInput1;
  }
}
