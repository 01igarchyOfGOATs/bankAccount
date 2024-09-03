import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Hubert Yang
 * @version 8/21/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("enter your input for celsius");
            double celsius = keyboard.nextInt();
            keyboard.nextLine();  //go past the endline and be ready for more input
            System.out.println(celsius*1.8 + 32);
            System.out.println("this is the conversion from celsius to fahrenheit");
            System.out.println("enter your input for fahrenheit");
            double fahrenheit = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println((fahrenheit-32)/1.8);
            System.out.println("this is the conversion from fahrenheit to celsius");
            System.out.println("enter your input for feet");
            double feet = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(feet*3.281);
            System.out.println("this is the approximate conversion from feet to meters");
            System.out.println("enter your input for meters");
            double meters = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(meters/3.281);
            System.out.println("this is the approximate conversion from meters to feet");
            System.out.println("enter your input for ounces");
            double ounces = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(ounces*29.574);
            System.out.println("this is the approximate conversion from ounces to milliliters");
            System.out.println("enter your input for milliliters");
            double milliliters = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(milliliters/29.574);
            System.out.println("this is the approximate conversion from milliliters to ounces");
            System.out.println("enter your input for inches");
            double inches = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(inches*12);
            System.out.println("this is the conversion from inches to feet");
            System.out.println("enter your input for feet");
            double miles = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(miles*5280);
            System.out.println("this is the conversion from miles to feet");
            System.out.println("enter your input for liters");
            double liters = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(liters*1000);
            System.out.println("this is the conversion from liters to milliliters");
            System.out.println("enter your input for kilograms");
            double kilograms = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(kilograms*1000);
            System.out.println("this is the conversion from kilograms to grams");

            //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
            //You can add even more if you would like.




        }
    }
}