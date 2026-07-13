import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {



    /*
    Notification notification;

    public void sendNotification() {

        EmailNotification email = new EmailNotification(); //OrderService, EmailNotification classına tightly coupled.
        email.send();

        SMSNotification sms = new SMSNotification();
        sms.send();

    } //Örn sonradan XNotification eklemek istesek buradaki kodu değiştirmek zorunda kalacağız. // SOLID aykırı !! (open closed)

    */






    /*
    Notification notification;
    public void sendNotification(String type) {

        if (type.equals("EMAIL")){
            notification = new EmailNotification();
        }else if (type.equals("SMS")) {
            notification = new SMSNotification();
        }

        notification.send();

    } // burası da ayrı bir class olarak  notification factorye taşındı. code duplicity oluyor.
    // bu obje oluşturma mantığı da clienttan bağımsız olmalı client sadece send ile ilgileniyor bu yüzden arada bir factory classı olmalı.



    */
        //Notification notification = NotificationFactory.createNotification("EMAIL");
        //notification.send();




    /* //list olunca:


        public void sendNotification(){
            //Notification notification = NotificationFactory.sendNotification("EMAIL");
            List<Notification> notifications = NotificationFactory.sendNotification(new ArrayList<>(Arrays.asList("EMAIL", "SMS")));
            for (Notification notification : notifications){
            notification.send();
            }
        }
     */

    public void sendNotification() { //ABSTRACT FACTORY
        NotificationFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();
        Template template = factory.createTemplate();
        notification.send();
        template.format();
    }




}
