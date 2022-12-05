import java.util.Scanner;

public class TeacherAccount implements UserAccount {

    @Override
    public void send_task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task number to send");
        int number = scanner.nextInt();
        System.out.println("You gave the next task:\n\"" + TasksJournal.getTask(number) + "\"");
    }

    @Override
    public void send_solution(String text) {
        System.out.println("ERROR! You don't have permission to do this.");
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
        if (Moodle.FindInTeachersBase(new Account(username, password))){
            System.out.println("Authorization successful!");
            return true;
        } else {
            System.out.println("Authorization unsuccessful, try another one.");
            return false;
        }
    }
}
