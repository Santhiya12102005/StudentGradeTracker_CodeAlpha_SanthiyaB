//studentgradetracker codesoft project-1
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class studentgradetracker{
    public static void main(String args[])
    {
        ArrayList<Integer> grades=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter grades of students (enter -1 to finish): ");
        while(true)
        {
            System.out.println("Enter grade :");
            int grade=s.nextInt();
            if(grade==-1)
            {
                break;
            }
            grades.add(grade);
        }
        if(grades.isEmpty())
        {
            System.out.println("No grades were entered.");
        }
        else
        {
            double avg=calculateAverage(grades);
            int high=Collections.max(grades);
            int low=Collections.min(grades);
            System.out.println("Results: ");
            System.out.println("Average grade is: "+avg);
            System.out.println("Highest grade is: "+high);
            System.out.println("Lowest grade is: "+low);
        }
        //Scanner.close();
    }
    public static double calculateAverage(ArrayList<Integer> grades)
    {
        int sum=0;
        for(int grade:grades)
        {
            sum+=grade;
        }
        return (double) sum/grades.size();
    }
}
