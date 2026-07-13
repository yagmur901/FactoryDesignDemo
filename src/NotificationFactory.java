import java.util.ArrayList;
import java.util.List;

public interface NotificationFactory {


    // nesne yaratma mantığı bu sınıfta artık. orderserviceden aldık.
    // loose coupling
    /*
      public static Notification sendNotification(String type) {
        if (type.equals("EMAIL")) {
            return new EmailNotification();
        } else if (type.equals("SMS")) {
            return new SMSNotification();
        } else {
            throw new IllegalArgumentException("Invalid type");
        }
    } //mesela bu haliyle ekstradan 50 şart eklenirse (classlar vb.) solidi bozmuş oluyor
      //çok if else olunca bağımlı olur o yuzden böyle bir classı interface yapıp tüm notification tiplerine implemente ettirmeliyiz.
*/








    /* //list halinde alırsa:


        public static List<Notification> sendNotification(List<String> types) {

            List<Notification> notifications = new ArrayList<>();

            for (String type : types) {
                if (type.equals("EMAIL")) {
                    notifications.add(new EmailNotification());
                } else if (type.equals("SMS")) {
                    notifications.add( new SMSNotification());
                } else {
                    throw new IllegalArgumentException("Invalid type");
                }

                return notifications;
            }
        }

        // metot static çünkü static olunca fazla nesne üretmeden direkt sınıf adııyla metodu çağırabiliyoruz. (daha interface değilken classken.)


     */



    Notification createNotification(); // interface e dönüştürdükten sonra.
    //notification üret.

    Template createTemplate();
}   // o notificationa ait template'i üret.

// bu factoryi iki factoryde böldük gibi oldu.