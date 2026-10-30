package Lab3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the amount of Students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        // Columns: [0]Name, [1]ID, [2]Math, [3]Physic, [4]Chem, [5]Prog, [6]Sport, [7]Avg, [8]Grade
        String[][] grade = new String[n][9];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");            
            System.out.print("-Input Name: ");
            grade[i][0] = sc.nextLine();
            
            System.out.print(" Input Student ID: ");
            grade[i][1] = sc.nextLine();
            
            System.out.println("-Input Your Subject's Score out of 100");
            System.out.print(" Input Math Score: ");
            grade[i][2] = sc.nextLine();
            
            System.out.print(" Input Physic Score: ");
            grade[i][3] = sc.nextLine();
            
            System.out.print(" Input Chemistry Score: ");
            grade[i][4] = sc.nextLine();
            
            System.out.print(" Input Programming Score: ");
            grade[i][5] = sc.nextLine();
            
            System.out.print(" Input Sport Score: ");
            grade[i][6] = sc.nextLine();
            double totalscore = 0;
            for (int k = 2; k <= 6; k++) {
                totalscore += Double.parseDouble(grade[i][k]);
            }
            double avgscore = totalscore / 5.0;
            grade[i][7] = String.valueOf(avgscore);
            String gpa;
            if (avgscore >= 90 && avgscore <= 100) {
                gpa = "A";
            } else if (avgscore >= 75) {
                gpa = "B";
            } else if (avgscore >= 50) {
                gpa = "C";
            } else if (avgscore >= 0) {
                gpa = "F";
            } else {
                gpa = "Error";
            }
            grade[i][8] = gpa;
        }

        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < grade.length; i++) {
            double total = 0;
            for (int k = 2; k <= 6; k++) {
                total += Double.parseDouble(grade[i][k]);
            }

            System.out.println("\n- Student " + (i + 1) + ":");
            System.out.println("Name: " + grade[i][0]);
            System.out.println("Student ID: " + grade[i][1]);
            System.out.println("Math: " + grade[i][2] + ", Physic: " + grade[i][3] 
                             + ", Chemistry: " + grade[i][4] + ", Programming: " + grade[i][5] 
                             + ", Sport: " + grade[i][6]);
            System.out.println("Total Score: " + total + "/500");
            System.out.println("Average Score: " + grade[i][7]);
            System.out.println("Grade Letter: " + grade[i][8]);
        }

        sc.close();
    }
}