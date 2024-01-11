import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Phone phone1 = new Phone(7708, "darl", 78.0);

            /*phone1.number = 7708;
            phone1.model = "Darl";
            phone1.weight = 78.0;*/

            Phone phone2 = new Phone(3801, "Mive", 79.6);
            /*phone2.number = 3801;
            phone2.model = "Mive";
            phone2.weight = 79.6;*/

            Phone phone3 = new Phone(5609, "Zano", 71.3);
            /*phone3.number = 5609;
            phone3.model = "Zano";
            phone3.weight = 71.3;*/

            System.out.println("Number 1: " + phone1.number + "\nModel 1: " + phone1.model + "\nWeight 1: " + phone1.weight);
            System.out.println("Number 2: " + phone2.number + "\nModel 2: " + phone2.model + "\nWeight 2: " + phone2.weight);
            System.out.println("Number 3: " + phone3.number + "\nModel 3: " + phone3.model + "\nWeight 3: " + phone3.weight);
            phone1.receiveCall("Sanzhar");
            int phone1number = phone1.number;
            System.out.println(phone1number);

            phone2.receiveCall("NotSanzhar");
            int phone2number = phone2.number;
            System.out.println(phone2number);

            phone1.receiveCall("Sonya ", 777778888);
            phone1.sendMessage(7708, 7347, 3801, 3432565);
        }

}
