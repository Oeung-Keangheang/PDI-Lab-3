package Lab3;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int book;
		System.out.print("Input the amount of books: ");
		book = sc.nextInt();
		sc.nextLine();
		String[][] library = new String[book][4];
        for (int i = 0; i < book; i++) {
            System.out.println("\n--- Enter details for Book " + (i + 1) );            
            System.out.print("Input Book ID: ");
            library[i][0] = sc.nextLine();
            sc.nextLine();
            System.out.print("Input Title: ");
            library[i][1] = sc.nextLine();
            System.out.print("Input Author: ");
            library[i][2] = sc.nextLine();
            System.out.print("Input Price: ");
            library[i][3] = sc.nextLine();
        }
        System.out.println("\n---Book Details");
        for (int i = 0; i < library.length; i++) {
            System.out.println("-Book " + (i + 1) + ":");
            System.out.println("ID:     " + library[i][0]);
            System.out.println("Title:  " + library[i][1]);
            System.out.println("Author: " + library[i][2]);
            System.out.println("Price:  " + library[i][3]);
        }
        float totalprice=0;
        for (int i = 0; i < library.length; i++) {
        	totalprice += Double.parseDouble(library[i][3]);
        }
        double avgprice = totalprice/book;
        System.out.println("\n---Average Price of the books is "+ avgprice+ "$");
        sc.close();
    }								
}