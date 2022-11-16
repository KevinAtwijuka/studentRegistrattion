/**
 * Students registration form
 */
package kevin;
import java.util.Scanner;

/**
 * Atwijuka Kevin
 * 2021/A/KIT/0748/F
 */
class univ {
	  private int year;
	  public int getb() {
	    return year;
	  }
	  public void setb(int year) {
	    this.year = year;
	  }
	}
	class Main extends univ {
	  public static void main(String[] args) {
	    Year s = new Year();
	    s.setb(2022);
	    System.out.println("\nYear of Entry " + s.getb());
	    Scanner input = new Scanner(System.in);
	    System.out.println("\nEnter FirstName: ");
	    String myString = input.next();
	    System.out.println("\nYour Name : " + myString);
	    System.out.println("\nEnter last Name: ");
	    String yString = input.next();
	    System.out.println("\nYour last : " + yString);
	    System.out.println("\nEnter Course: ");
	    String xString = input.next();
	    System.out.println("\nYour Your Course is : " + xString);
	  }
	}


