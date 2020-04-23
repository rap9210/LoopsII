import javax.swing.plaf.synth.SynthMenuBarUI;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LoopsII
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int i;

        //cube
        System.out.println("Enter a number to display the cube \nof all numbers up to that one: ");
        int user_input = scn.nextInt();
        System.out.println("The cubes of all numbers up to "+user_input);
        for (i = 1; i <= user_input; i++)
        {
            int cubes = i*i*i;
            System.out.println(i+"^3 = "+cubes);
        }

        //multiplication table
        System.out.println("Enter a number to display the multiplication \ntable for that number up to 10: ");
        user_input = scn.nextInt();
        System.out.println("Displaying "+user_input+" times 1 through 10: ");
        for (i = 1; i <= 10; i++)
        {
            int mult = user_input*i;
            System.out.println(i+" * "+user_input+" = "+mult);
        }

        //odds up to a number and their sum
        System.out.println("Enter a number to display all odd numbers \nup to that number and their sum: ");
        user_input = scn.nextInt();
        System.out.println("Displaying all odd numbers up to "+user_input+"\nand their sum: ");
        int sum_total_odds = 0;
        String odds = "[";
        for (i = 1; i < user_input; i+=2)
        {
            sum_total_odds += i;
            if (i == user_input-1)
            {
                odds += i +"]";
            }
            else
            {
                odds += i + ", ";
            }
        }
        if (user_input%2 == 1)
        {
            sum_total_odds += user_input;
            odds += user_input+"]";

        }
        System.out.println("Odds from 1 to "+user_input+"\n"+odds);
        System.out.println("The sum of these numbers is "+sum_total_odds);

        //evens up to a number and their sum
        System.out.println("Enter a number to display all even numbers \nup to that number and their sum: ");
        user_input = scn.nextInt();
        System.out.println("Displaying all even numbers up to "+user_input+"\nand their sum: ");
        String evens = "[";
        int sum_total_evens = 0;
        for (i = 2; i < user_input; i+=2)
        {
            sum_total_evens += i;
            if (i == user_input-1)
            {
                evens += i +"]";
            }
            else
            {
                evens += i + ", ";
            }
        }
        if (user_input%2 == 0)
        {
            sum_total_evens += user_input;
            evens += user_input+"]";

        }
        if (user_input != 1) {
            System.out.println("Evens from 1 to " + user_input + "\n" + evens);
            System.out.println("The sum of these numbers is " + sum_total_evens);
        }else
        {
            System.out.println("[none]");
        }
        //Prompt user for input
        System.out.println("Input anything here: ");
        String anything = scn.nextLine();

        //6-9

        String display_6 = "";
        for (i = 1; i <= 5; i++)
        {
            display_6 += i;
            System.out.println(display_6);
        }

        String display_7 = "";
        for (i = 1; i <= 5; i++)
        {
            display_7 = Integer.toString(i);
            System.out.println(display_7.repeat(i));
        }

//        for (i = 1; i <= 10; i++)
//        {
//            switch(i)
//            {
//                case(1):
//                    System.out.println(i);
//                    break;
//                case(2):
//                    System.out.print(i);
//                    break;
//                case(3):
//                    System.out.println(i);
//                    break;
//                case(4):
//                    System.out.print(i);
//                    break;
//                case(5):
//                    System.out.print(i);
//                    break;
//                case(6):
//                    System.out.println(i);
//                    break;
//                case(7):
//                    System.out.print(i);
//                    break;
//                case(8):
//                    System.out.print(i);
//                    break;
//                case(9):
//                    System.out.print(i);
//                    break;
//                case(10):
//                    System.out.println(i);
//                    break;
//            }

        String display = "";
        int x = 1;
        int y = 2;
        for (i = 1; i<=10; i++)
        {
            display += i;
        }
        for (i = 0; i<=6; i+=0)  // i changes based on x, instead of regular for loop increment
        {
            if (i<6)
            {
                System.out.println(display.substring(i, x));        //String "display" is 1-10, desired substrings are
                i = x;                                              //(0,1),(1,3),(3,6), and (6,11) -11 because 10 is
                x += y;                                             //"1" and "0"- "i" in this case is always "x"'s last value
                y++;                                                //so after print I assign "x" to "i". The change in "x" is
            }                                                       //incremental (first +1, then +2, +3...), that value is "y"
            else                                                    //which I add to "x" every iteration. Because 10 is 2 characters
            {                                                       //I have to make an exception for "0" and add it at the end.
                System.out.println(display.substring(i,x)+"0");
                i = x;
            }
        }
        x = 1;
        String one_zero = "10101";
        for (i=0; x <= 5;)
        {                                                           //Similar to the one before. Initialize a string with all
            if(i == 0)                                              //the 1's and 0's i need given that all the smaller lines of the
            {                                                       //desired print are contained within the mother string.
                System.out.println(one_zero.substring(i, x));       //substrings range from 0 and 1 for i, 1 and 5 for x.
                i++;
                x+=2;
            }
            else if (i == 1)
            {
                System.out.println(one_zero.substring(i,x));
                i--;
            }
        }

        //Palindromes
        System.out.println("Enter a number to find out if it is a palindrome! (numbers that read identical \nfront to back and back to front)");
        String num1 = scn.nextLine();
        String palindrome_check[] = new String[num1.length()];
        palindrome_check = num1.split("");
        String kcehc_omirdnilap[] = new String[num1.length()];
        /*
        Take user's imputed number as string. Split it to turn it into an array. Initialize empty array of same length
        and use a for loop to fill it starting with the elements at the end of the original array.
         */
        x = 0;
        for (i=Array.getLength(palindrome_check)-1; x < Array.getLength(palindrome_check); i--)
        {
            kcehc_omirdnilap[x] = palindrome_check[i];
            x++;
        }
        /*
        Now once our arrays are ready. A for loop to compare each element front to back to see if they are all
        identical. What ever the truth is, display appropriate message.
         */
        int similarity_count = 0;
        for (i=0; i <= Array.getLength(palindrome_check) - 1; i++)
        {
            if (kcehc_omirdnilap[i].equalsIgnoreCase(palindrome_check[i])) {
            }
            else {
                similarity_count +=1;
            }

        }
        if (similarity_count == 0)
        {
            System.out.println("The number you entered, " + num1 + ", is indeed a palindrome.");
        }
        else{
            System.out.println("Looks like " + num1 + " is NOT a palindrome.");
        }
        //Adding integers that are divisible by 9 between 100 and 200
        int integer_sum = 0;
        String int_div_9 = "";
        for (i = 100; i <= 200; i++)
        {
            if (i%9 == 0)
            {
                integer_sum += i;
                int_div_9 += i+" ";
            }
        }
        System.out.println("The numbers between 100 and 200 that are \ndivisible by 9 are "+int_div_9);
        System.out.println("Their sum is "+integer_sum);
    }
}
