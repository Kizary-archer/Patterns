package Patterns.Facade;

import Patterns.Facade.ComplexClasses.Mail;
import Patterns.Facade.ComplexClasses.MailAgent;
import Patterns.Facade.ComplexClasses.Power;

public class Facade {
    Mail mail;
    Power power = new Power();
    MailAgent mailAgent = new MailAgent();

    public void sendMail(String str){
        if (!power.isStatus())
        power.on();
        mail = new Mail(str);
        MailAgent mailAgent= new MailAgent();
        mailAgent.sendMail(mail);
    }
}
