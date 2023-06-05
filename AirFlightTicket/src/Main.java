import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;

        System.out.print("Write Your Age :");   int age=input.nextInt();
        System.out.print("Write The Distance :"); double km=input.nextDouble();
        System.out.print("Select The Ticket \n1-One Way ----- 2-Round Trip"); choose=input.nextInt();

        double ticketprice = (km*0.10);

        switch (choose){

            case 1:
                    if (age<12)
                    {
                        ticketprice=ticketprice/2;
                        System.out.print("Ticket Price ="+ticketprice);
                    }
                    else if (age>12 && age<24)
                    {
                        ticketprice=ticketprice-(ticketprice*0.10);
                        System.out.println("Ticket Price="+ticketprice);
                    }
                    else if (age >65)
                    {
                        ticketprice=ticketprice-(ticketprice*0.30);
                        System.out.println("Ticket Price="+ticketprice);
                    }
                                    break;

            case 2:
                    ticketprice=ticketprice-(ticketprice*0.20);

                if (age<12)
                {
                    ticketprice=ticketprice/2;
                    System.out.print("Ticket Price ="+ticketprice);
                }
                else if (age>12 && age<24)
                {
                    ticketprice=ticketprice-(ticketprice*0.10);
                    System.out.println("Ticket Price="+ticketprice);
                }
                else if (age >65)
                {
                    ticketprice=ticketprice-(ticketprice*0.30);
                    System.out.println("Ticket Price="+ticketprice);
                }
                break;



}}}