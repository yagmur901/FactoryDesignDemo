//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { // abstract factorynin maini (factory of factories)

    public static void main(String[] args) {
        //tek bir noktadan aile seçilir. (örn email ailesi = EmailNotification + EmailTemplate)

        // Örn EmailFactory seçildiğinde, birbiriyle alakasız bir SMS templateinin yanlışlıkla üretilmesi imkansız hale gelir.
        NotificationFactory factory = new EmailFactory();

        Template template = factory.createTemplate();
        Notification notification = factory.createNotification();

        template.format();
        notification.send();
    }
}