import java.util.ArrayList;

public class Moodle {
        private static ArrayList<Account> students_data_base;
        private static ArrayList<Account> teachers_data_base;
    Moodle(){
        students_data_base = new ArrayList<Account>();
        teachers_data_base = new ArrayList<Account>();
    }
    void authorizationTrying(UserAccount userAccount){
        while(!userAccount.authorize()){

        }
    }

    public static boolean FindInStudentsBase(Account account){
        for (int i = 0; i < students_data_base.size(); i++) {
            if (account.getUsername().equals(students_data_base.get(i).getUsername()) &&
                    account.getPassword().equals(students_data_base.get(i).getPassword()))
                return true;
        }
        return false;
    }

    public static boolean FindInTeachersBase(Account account){
        for (int i = 0; i < teachers_data_base.size(); i++) {
            if (account.getUsername().equals(teachers_data_base.get(i).getUsername()) &&
                    account.getPassword().equals(teachers_data_base.get(i).getPassword()))
                return true;
        }
        return false;
    }

    void AddStudentAccount(String name, String pass){
        students_data_base.add(new Account(name, pass));
    }
    void AddTeacherAccount(String name, String pass){
        teachers_data_base.add(new Account(name, pass));
    }

    public static ArrayList<Account> getStudents_data_base() {
        return students_data_base;
    }

    public static ArrayList<Account> getTeachers_data_base() {
        return teachers_data_base;
    }
}
