
import java.util.Scanner;

public class MenuManager {

    Helper helper = new Helper();

    public void printMenu() {
        System.out.println("Welcome to Vaccine Management - @ 2021 by SE150058 - Dau Le Duc");
        System.out.println("Select the options below :");
        System.out.println("1. Show information all students have been injected");
        System.out.println("2. Add student's vaccine injection information");
        System.out.println("3. Updating information of students' vaccine injection");
        System.out.println("4. Delete student vaccine injection information");
        System.out.println("5. Search for injection information");
        System.out.println("6. save to file");
        System.out.println("7. Quit");
    }

    public void printSearchMethodMenu() {
        System.out.println("Select the method you want to search :");
        System.out.println("1. studentID");
        System.out.println("2. studentName");
    }

    public void printConfirmMenu(String msg) {
        System.out.println(msg);
        System.out.println("1. Yes");
        System.out.println("2. No");
    }

    public int getUserChoice() {
        int choice = helper.getInt("your selection : ");;
        return choice;
    }

    public void printInjectionMenu(Injection injection) {
        System.out.println("Choose one to add the properties of new Injection :");
        System.out.println("Select the options below :");
        System.out.println("1. injection ID : " + injection.injectionID);
        System.out.println("2. first place : " + injection.firstPlace);
        System.out.println("3. second place : " + injection.secondPlace);
        System.out.println("4. first date : " + injection.firstDate);
        System.out.println("5. second date : " + injection.secondDate);
        System.out.println("6. student ID : " + injection.studentID);
        System.out.println("7. vaccine ID : " + injection.vaccineID);
        System.out.println("8. confirm");
    }
}
