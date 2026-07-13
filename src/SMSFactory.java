public class SMSFactory implements NotificationFactory{


    @Override
    public Notification createNotification() { //sadece sms notification üretmekten sorumlu

        return new SMSNotification();
    }

    @Override
    public Template createTemplate() {
        return new SMSTemplate();
    }



}
