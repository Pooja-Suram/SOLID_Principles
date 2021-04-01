package liskovandinterface.notfollowed;

class Message {

    private String message;
    Message(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}


interface Email {

    public void sendMail(Message message);
    public void receiveMail(Message received);
}


class AdvertisementMail implements Email{


    @Override
    public void sendMail(Message message) {
        System.out.println("Sending Mail:" + message.getMessage());
    }

    @Override
    public void receiveMail(Message received) {
        System.out.println("I don't receive mails!\n");
    }
}


class PersonalMail implements Email{


    @Override
    public void sendMail(Message message) {
        System.out.println("Sending Mail: "+ message.getMessage());
    }

    @Override
    public void receiveMail(Message received) {
        System.out.println("Received Mail: "+ received.getMessage());
    }
}


public class ImplementationWithoutPrinciples {

    public static void main(String[] args) {

        Message sendMessage = new Message("Hello");
        Message receiveMessage = new Message("Received message");

        Email advertisementMail = new AdvertisementMail();
        advertisementMail.sendMail(sendMessage);
        advertisementMail.receiveMail(receiveMessage);

        Email personal = new PersonalMail();
        personal.sendMail(sendMessage);
        personal.receiveMail(receiveMessage);

    }
}

