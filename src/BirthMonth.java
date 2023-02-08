public class BirthMonth
{
    public static void main(String[] args)
    {

        //Declared variables
        int birthMonth;

        //Simulating input since we cant yet but added my own input
        System.out.println("Enter birth month in numbers 1-12 ");

        //cant do input so simulate input here
        birthMonth = 2;

        //if/elseif statement to figure out month or output error i added month name and number
        if (birthMonth == 1)
        {
            //output if the Month is the correct month if not continues on to next line
            System.out.println("Your birth month is January (1)");
        }
        else if (birthMonth == 2)
        {
            System.out.println("Your birth month is February (2)");
        }
        else if (birthMonth == 3)
        {
            System.out.println("Your birth month is March (3)");
        }
        else if (birthMonth == 4)
        {
            System.out.println("Your birth month is April (4)");
        }
        else if (birthMonth == 5)
        {
            System.out.println("Your birth month is May (5)");
        }
        else if (birthMonth == 6)
        {
            System.out.println("Your birth month is June (6)");
        }
        else if (birthMonth == 7)
        {
            System.out.println("Your birth month is July (7)");
        }
        else if (birthMonth == 8)
        {
            System.out.println("Your birth month is August (8)");
        }
        else if (birthMonth == 9)
        {
            System.out.println("Your birth month is September (9)");
        }
        else if (birthMonth == 10)
        {
            System.out.println("Your birth month is October (10)");
        }
        else if (birthMonth == 11)
        {
            System.out.println("Your birth month is November (11)");
        }
        else if (birthMonth == 12)
        {
            System.out.println("Your birth month is December (12)");
        }
        else
        {
            //output error if numbers 1-12 isn't added
            System.out.println("You entered an incorrect month value: " + birthMonth + " Enter number between 1-12");
        }

    }
}