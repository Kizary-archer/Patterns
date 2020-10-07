package Patterns.Facade.ComplexClasses;

public class MailAgent {
    private boolean status = false;

    public void openAgent() {
        System.out.println("Агент открыт");
        this.status = true;
    }

    public void closeAgent() {
        System.out.println("Агент открыт");
        this.status = false;
    }

    public void sendMail(Mail mail) {
        System.out.println("Отправленное письмо: " + mail.getMail());
    }
}
