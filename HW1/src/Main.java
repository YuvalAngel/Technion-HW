import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner; // Note: Do not change this line.
    public static int menuPrints() {
        //This function prints the menu options
        //Parameters - none, return - User's menu choice
        System.out.println("1. Add a new student");
        System.out.println("2. Display all students");
        System.out.println("3. Calculate a student’s average grade");
        System.out.println("4. Find the top performing student");
        System.out.println("5. Exit");
        System.out.println("Please enter your choice: ");
        return scanner.nextInt();
    }
    public static void addStudent() {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        Student student = new Student(name);
        System.out.println("Enter grades: ");
        String input = scanner.nextLine();
        String[] input_list = input.split(" ");
        double sum = 0;
        int length = input_list.length;
        boolean is_valid = true;
        for (int i = 0; i < length; i++) {
            double temp = Double.parseDouble(input_list[i]);
            if (temp < 0 || temp > 100) {
                System.out.println("Invalid grades.");
                is_valid = false;
            }
        }
    }
    public static void manageGrades() {
        //This is the main function
        System.out.println("Welcome to the Student Grade Management System!");
        int function = menuPrints();
        while (function != 5) {
            //Keep running until user exits program
            switch (function) {
                case 1: addStudent();
                case 2: displayStudents();
                case 3: getAverage();
                case 4: findTopStudent();
            }
            function = menuPrints();
        }
    }
    public static void main(String[] args) throws IOException {
        String path = args[0];
        scanner = new Scanner(new File(path));
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfTests; i++) {
            System.out.println("Test number " + i + " starts.");
            try {
                manageGrades();
            } catch(Exception e){
                System.out.println("Exception " + e);
            }
            System.out.println("Test number " + i + " ended.");
            System.out.println("-----------------------------------------------");
        }
        System.out.println("All tests have ended.");
    }
}