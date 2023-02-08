public class BirthMonth
{
    public static void main(String[] args)
    {

        //class BirthMonth
        //	main()
        //	    //Declare variables
        //	    num birthMonth
        //	    //Prompt and input
        //	    output “Enter your birth month in numbers ”
        //	    input birthMonth
        //	    //Process
        //	    If birthMonth < 1 OR > 12 then
        //		output “(“You entered an incorrect month value: N”
        //	    endif
        //	    //Output
        //	    output “Your birth month is: ” + birthMonth
        //	return
        //end class

        //Declared variables
        int birthMonth;

        //Simulating input since we cant yet but added my own input
        System.out.println("Enter birth month in numbers 1-12 ");

        //cant do input so simulate input here
        birthMonth = 2;

        //if else statement to figure out month or output error number
        //Also gives a warning on code cause some numbers are always false since input is simulated
        if (birthMonth >=1 && 12 >=birthMonth)
        {
            //output if the Month is the correct month if not
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            //output error if numbers 1-12 isn't added
            System.out.println("You entered an incorrect month value: " + birthMonth + " Enter number between 1-12");
        }

    }
}