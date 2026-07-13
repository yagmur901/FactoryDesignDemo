public interface Template { //Abstract facory metodundan
    void format();
}


/** ===> when we have families of objects etc -> the abstract factory comes in handy
 *
 * family 1 = email familiy
 * -product 1 --> email notification
 * -product 2 --> email template
 *
 * family 2 = sms family
 * -product 1 --> sms notification
 * -product 2 --> sms template
 */
