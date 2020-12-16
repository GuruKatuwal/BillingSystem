package BillingSystem.persitence;

import BillingSystem.com.SendMail;
import org.junit.jupiter.api.Test;

class EmailTest {
    @Test
    void getEmailSuccess() {
        SendMail sendMail = new SendMail();
        sendMail.getInfo("hi", "testing\nthis is line break<br>this is second one\r this is third");
    }
}
