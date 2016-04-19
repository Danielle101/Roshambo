package roshamboGame;

import java.util.Scanner;

public class Validator 

{
        public static String get_String(String prompt)
       {
           String s = "";
           boolean isValid = false;
           Scanner sc = new Scanner(System.in);
           while (!isValid){ // loops until user enters a non-blank line

           System.out.print(prompt);
           s = sc.nextLine();
           if (!s.equals(""))
           isValid = true;
       }

           return s;

      }

    public static String getString(String prompt)
    {

            String s = null;
            boolean isValid = false;
            while (!isValid)

       {
            s = get_String(prompt);
            if (s.compareTo("Y") == 0 || s.compareTo("y") == 0 || s.compareTo("N") == 0 || s.compareTo("n") == 0)
            isValid = true;
            else
            System.out.println("\nError! Entry must be 'y' or 'n'. Try again.");
       }

            return s;
     }
    public static String getStringJS(String prompt)
    {

            String s = null;
            boolean isValid = false;
            while (!isValid)

       {
            s = get_String(prompt);
            if (s.compareTo("j") == 0 || s.compareTo("J") == 0 || s.compareTo("s") == 0 || s.compareTo("S") == 0)
            isValid = true;
            else
            System.out.println("\nError! Please enter 'j' or 's'");
       }

            return s;
     }
    public static String getStringRPS(String prompt)
    {

            String s = null;
            boolean isValid = false;
            while (!isValid)

       {
            s = get_String(prompt);
            if (s.compareTo("r") == 0 || s.compareTo("R") == 0 || s.compareTo("p") == 0 || s.compareTo("P") == 0
            		||s.compareToIgnoreCase("s")==0 ||s.compareToIgnoreCase("S")==0)
            isValid = true;
            else
            System.out.println("\nError! Please enter 'r' or 'p' or 's'!");
       }

            return s;
     }
}