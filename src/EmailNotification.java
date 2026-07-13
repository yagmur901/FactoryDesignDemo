public class EmailNotification implements Notification{

    //public void send() { System.out.println("Sending Email."); // daha interface yokken

    @Override
    public void send() { // interface ekleyince
        System.out.println("Sending Email.");
    }
}
