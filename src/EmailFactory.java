public class EmailFactory implements NotificationFactory{


    @Override
    public Notification createNotification() { //sadece email üretmekten sorumlu

        return new EmailNotification();
    }

    @Override
    public Template createTemplate() {
        return new EmailTemplate();
    }


}


