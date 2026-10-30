package Lab3;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int temperature;
		System.out.print("Input the amount of City: ");
		temperature = sc.nextInt();
		sc.nextLine();
		String[][] citytemp = new String[temperature][3];
        for (int i = 0; i < temperature; i++) {
            System.out.println("\n---Enter details for City Number " + (i + 1) );            
            System.out.print("Input City's Name: ");
            citytemp[i][0] = sc.nextLine();
           
            System.out.print("Input City's Temperature (in Celsius): ");
            citytemp[i][1] = sc.nextLine();
            double celsius = Double.parseDouble(citytemp[i][1]);
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            citytemp[i][2] = String.valueOf(fahrenheit);
        }
        System.out.println("\n---City Details");
        for (int i = 0; i < citytemp.length; i++) {
            System.out.println("-City Number " + (i + 1) + ":");
            System.out.println("Name:     " + citytemp[i][0]);
            System.out.println("Temperature:  " + citytemp[i][1] + "°C or " + citytemp[i][2]+ "°F");
        }
        sc.close();

	}

}
