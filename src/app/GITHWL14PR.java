package app;


import app.models.Device;
import app.service.Printer;

public class GITHWL14PR {
    public static void main(String[] args) {

        Printer printer = new Device();

        Device.Message message1 = new Device.Message(null , null);
        Device.Message message2 = new Device.Message("Hello" , "James");
        Device.Message message3 = new Device.Message("Hello" , null);

        printer.print(message1);
        printer.print(message2);
        printer.print(message3);




    }
}
