import java.util.Random;
import java.util.Scanner;

public class WeekTwoReChallengeClass {
    public static void main(String[] args)
    {
        String name = "";
        String anotherName;
        String category;
        boolean isDone;
        int mainlevel = 0;
        String full="";
        String levell="";
        int countlevel1 =0;
        int countlevel2 =0;
        int countlevel3 =0;
        int count= 0;
        int count1= 0;

        Scanner myScan = new Scanner(System.in);
        Random rnd = new Random();
        int level = rnd.nextInt(3);
        int amountLevelItems = 0;
        int itemsDone;
        if (level == 1) {
            mainlevel = 1;
        }
        else if (level == 2) {
            mainlevel = 2;
        }
        else
        {
            mainlevel = 3;
        }


        while (!name.equalsIgnoreCase("quit") )
        {
            outputLine("Enter the item you have to do:");
            name = myScan.next();
            if (name.equals("quit")) {
                break;
            }
            outputLine("Enter the category of this item:");
            category = myScan.next();
            outputLine("Your assigned priority is:");
            level = mainlevel;
            System.out.println(level);
            outputLine("Is this item completed? (true or false):");
            isDone = myScan.nextBoolean();
            outputLine("Do you have another item? Enter q or quit to exit.");
            anotherName = myScan.nextLine();

            amountLevelItems = amountLevelItems + level ;
           if  (isDone == true)
            {
                 count ++;
            }
            else
           {
               count1 ++;
           }

          if (level == 1)
          {
              levell = "low";

              countlevel1++;
          }
           else if (level == 2)
            {
                levell = "medium";

                countlevel2++;
            }
            else
          {
              levell = "high";

              countlevel3++;
          }

            full = full + name + "\t\t" + category + "\t\t" + levell + "\t\t\t" + isDone + "\t\t" + "\n";
          level = mainlevel;
           }
        outputLine("==================================================================");
        outputLine("Item Name" +"\t" + "Category"+ "\t" + "Priority"+ "\t" +"Done?");
        outputLine(full);
        outputLine("Low-level:" + countlevel1 +"\t" + " Medium-level:"+ countlevel2 + "\t" + "High-level:"+ countlevel3);

        outputLine("# of items completed:" + count );
        outputLine("# of items NOT completed:" + count1 );



    }
    private static void outputLine( String message)
    {
        System.out.println(message);
    }
    private static void output( String message)
    {
        System.out.print(message);
    }
}
