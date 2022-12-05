import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TasksJournal {
    private static Map<Integer, String> journal;
    public TasksJournal(){
        journal = new TreeMap<Integer, String>();
    }
    public void addTask(int number, String condition){
        journal.put(number, condition);
    }
    public static String getTask(int number){
        return journal.get(number);
    }
}
