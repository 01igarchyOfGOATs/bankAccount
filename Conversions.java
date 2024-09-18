import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Hubert Yang
 * @version 9/3/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Celsius to fahrenheit");
            System.out.println("2. Fahrenheit to celsius");
            System.out.println("3. Feet to meters");
            System.out.println("4. Meters to feet");
            System.out.println("5. Ounces to milliliters");
            System.out.println("6. Milliliters to ounces");
            System.out.println("7. Inches to feet");
            System.out.println("8. Feet to inches");
            System.out.println("9. Miles to kilometers");
            System.out.println("10. Kilometers to miles");
            System.out.println("11. Feet to miles");
            System.out.println("12. Miles to feet");
            System.out.println("13. Yards to feet");
            System.out.println("14. Feet to yards");
            System.out.println("15. Seconds to minutes");
            System.out.println("16. Minutes to seconds");
            System.out.println("choose a conversion from the menu by inputing its corresponding number (choose from 1-16)");
            //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
            //You can add even more if you would like.
            
            int selection = keyboard.nextInt();
            keyboard.nextLine();  //go past the endline and be ready for more input

            if (selection == 1)
            {
                System.out.println("Enter celsius: ");
                double celsius = keyboard.nextDouble();
                keyboard.nextLine();
                double fahrenheit = celsius * 1.8 + 32;
                System.out.println(fahrenheit + " fahrenheit");
            }
            if (selection == 2)
            {
                System.out.println("Enter fahrenheit: ");
                double fahrenheit = keyboard.nextDouble();
                keyboard.nextLine();
                double celsius = (fahrenheit - 32) / 1.8;
                System.out.println(celsius + " celsius");
            }
            if (selection == 3)
            {
                System.out.println("Enter feet: ");
                double feet = keyboard.nextDouble();
                keyboard.nextLine();
                double meters = (feet/3.281);
                System.out.println(meters + " meters");
            }
            if (selection == 4)
            {
                System.out.println("Enter meters: ");
                double meters = keyboard.nextDouble();
                keyboard.nextLine();
                double feet = (meters*3.281);
                System.out.println(feet + " feet");
            }
            if (selection == 5)
            {
                System.out.println("Enter ounces: ");
                double ounces = keyboard.nextDouble();
                keyboard.nextLine();
                double milliliters = (ounces*29.574);
                System.out.println(milliliters + " millileters");
            }
            if (selection == 6)
            {
                System.out.println("Enter milliliters: ");
                double milliliters = keyboard.nextDouble();
                keyboard.nextLine();
                double Ounces = (milliliters/29.574);
                System.out.println(Ounces + " ounces");
            }
            if (selection == 7)
            {
                System.out.println("Enter inches: ");
                double inches = keyboard.nextDouble();
                keyboard.nextLine();
                double feet = (inches/12);
                System.out.println(feet + " feet");
            }
            if (selection == 8)
            {
                System.out.println("Enter feet: ");
                double feet = keyboard.nextDouble();
                keyboard.nextLine();
                double inches = (feet*12);
                System.out.println(inches + " inches");
            }
            if (selection == 9)
            {
                System.out.println("Enter miles: ");
                double miles = keyboard.nextDouble();
                keyboard.nextLine();
                double kilometers = (miles*1.609);
                System.out.println(kilometers + " kilometers");
            }
            if (selection == 10)
            {
                System.out.println("Enter kilometers: ");
                double kilometers = keyboard.nextDouble();
                keyboard.nextLine();
                double miles = (kilometers/1.609);
                System.out.println(miles + " miles");
            }
            if (selection == 11)
            {
                System.out.println("Enter feet: ");
                double feet = keyboard.nextDouble();
                keyboard.nextLine();
                double miles = (feet/5280);
                System.out.println(miles + " miles");
            }
            if (selection == 12)
            {
                System.out.println("Enter miles: ");
                double miles = keyboard.nextDouble();
                keyboard.nextLine();
                double feet = (miles*5280);
                System.out.println(feet + " feet");
            }
            if (selection == 13)
            {
                System.out.println("Enter yards: ");
                double yards = keyboard.nextDouble();
                keyboard.nextLine();
                double feet = (yards*3);
                System.out.println(feet + "feet");
            }
            if (selection == 14)
            {
                System.out.println("Enter feet: ");
                double feet = keyboard.nextDouble();
                keyboard.nextLine();
                double yards = (feet/3);
                System.out.println(yards + " yards");
            }
            if (selection == 15)
            {
                System.out.println("Enter seconds: ");
                double seconds = keyboard.nextDouble();
                keyboard.nextLine();
                double minutes = (seconds/60);
                System.out.println(minutes + " minutes");
            }
            if (selection == 16)
            {
                System.out.println("Enter minutes: ");
                double minutes = keyboard.nextDouble();
                keyboard.nextLine();
                double seconds = (minutes*60);
                System.out.println(seconds + "s econds");
            }
            if (selection == 0)
            {
                break;
            }
        
        }
        }
    }

