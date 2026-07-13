public class DeliveryService {


    Notification notification;

    public void sendNotification() {
        //Notification notification = NotificationFactory.sendNotification("SMS");// notification factoryi interface yapınca böyle yaptık.
        //notification.send();

        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();

        notification.send();

    }




    public static void main(String[] args) { //simple geliştirilmiş hali maini

        // hangi factoryi kullanacağına karar verir.
        // if else blokları kalktı, kod gelişime açık değişime kapalı (SOLID => open-closed principle) hale geldi




        NotificationFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();
        notification.send();



    }





}
