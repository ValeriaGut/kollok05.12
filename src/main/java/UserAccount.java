public interface UserAccount {
    void send_task();
    void send_solution(String text);
    void send_message(String text);
    boolean authorize();
}
