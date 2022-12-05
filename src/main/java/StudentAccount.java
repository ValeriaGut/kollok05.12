import java.util.Collections;
import java.util.Scanner;

public class StudentAccount implements UserAccount {

    @Override
    public void send_task() {
        System.out.println("ERROR! You don't have permission to do this.");
    }

    @Override
    public void send_solution(String text) {
        System.out.println("Your solution \"" + text + "\" was sent.");
    }

    @Override
    public void send_message(String text) {
        System.out.println("Your message \"" + text + "\" was sent.");
    }


    @Override
    public boolean authorize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username:\n");
        String username = scanner.nextLine();
        System.out.println("Input password:\n");
        String password = scanner.nextLine();
        if (Moodle.FindInStudentsBase(new Account(username, password))){
            System.out.println("Authorization successful!");
            return true;
        } else {
            System.out.println("Authorization unsuccessful, try another one.");
            return false;
        }
    }
}
