import java.io.Serializable;
public class Phone implements Serializable{
    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;

    }
    public Phone() {

    }
    int number;
    String model;
    double weight;
    public void receiveCall(String callerName) {
        System.out.println(callerName + "is ringing");
    }
    public void receiveCall(String callerName, int number) {
        System.out.println(callerName + "is ringing");
    }
    public void sendMessage(int ... numbers) {
      for (int i : numbers){
          System.out.print(i + " ");
      }
    }
    public int getNumber() {
        return number;
    }





}
