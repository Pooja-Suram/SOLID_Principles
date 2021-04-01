package liskovandinterface.followed;


class Message {

    private String message;
    Message(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}


interface SendingMail {
    public void sendMail(Message message);
}


interface ReceivingMail{
    public void receiveMail(Message received);
}


class AdvertisementMail implements SendingMail {

    @Override
    public void sendMail(Message message) {
        System.out.println("Sending Mail:" + message.getMessage());
    }

}


class PersonalMail implements SendingMail, ReceivingMail {

    @Override
    public void sendMail(Message message) {
        System.out.println("Sending Mail: "+ message.getMessage());
    }

    @Override
    public void receiveMail(Message received) {
        System.out.println("Received Mail: "+ received.getMessage());
    }
}



public class ImplementationFollowingPrinciples {

    public static void main(String[] args) {

        Message sendMessage = new Message("Hello");
        Message receiveMessage = new Message("Received message");

        AdvertisementMail advertisementMail = new AdvertisementMail();
        advertisementMail.sendMail(sendMessage);

        PersonalMail personal = new PersonalMail();
        personal.sendMail(sendMessage);
        personal.receiveMail(receiveMessage);
    }
}
