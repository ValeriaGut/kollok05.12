/*тесты чуть-чуть не успела сделать,но свою работу с ними я продемонстрировала на прошлом коллоквиуме :)))
спасибо за понимание*/
import java.util.Scanner;

public class Main {
    private static TasksJournal taskJournal = new TasksJournal();
    private static Moodle moodle = new Moodle();
    private static UserAccount userAccount;
    static {
        taskJournal.addTask(1, "Solve differential equation");
        taskJournal.addTask(3, "Solve matrix equation");
        taskJournal.addTask(5, "Solve quadratic equation");
        taskJournal.addTask(6, "Build graph");
        taskJournal.addTask(7, "Draw the system of coordinates");
    }
    static {
        moodle.AddStudentAccount("Misha24", "12345");
        moodle.AddStudentAccount("Vova12", "123");
        moodle.AddStudentAccount("Diman999", "0000");

        moodle.AddTeacherAccount("Oleg Gennadievich", "999t");
        moodle.AddTeacherAccount("Vladislav Dmitryvich", "0000k");
        moodle.AddTeacherAccount("Nataly Olegovna", "123123");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the moodle system.\n");
        String username = "";
        String password = "";
        while (true) {
            System.out.println("Choose a type of your account:\n1. Student.\n2. Teacher.");
            int chosen = scanner.nextInt();
            if (chosen == 1) {
                userAccount = new StudentAccount();
                break;
            } else if (chosen == 2) {
                userAccount = new TeacherAccount();
                break;
            }
            else {
                System.out.println("Wrong value!!!.\n");
            }
        }

        moodle.authorizationTrying(userAccount);

        userAccount.send_solution("Plus 1 minus 2");
        userAccount.send_message("Hello world");
        userAccount.send_task();
    }
}
