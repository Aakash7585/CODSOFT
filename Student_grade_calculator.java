import java.util.*;
public class Student_grade_calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number of Subjects:");
        int n=sc.nextInt();
        int marks[]=new int[n];
        float total=0;
        float average_percentage;

        for(int i=0;i<n;i++){
            System.out.print("Enter the marks of subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            total=total+marks[i];
        }
        average_percentage=(total/(n*100))*100;

        System.out.print("Total marks obtained is : "+total);
        System.out.println();
        System.out.print("Total average percentage obtained is : "+average_percentage+"%");
        System.out.println();

        if(average_percentage>=85){
            System.out.print("Your Grade is 'A'");  
        }
        else if(average_percentage>=70 && average_percentage<85){
            System.out.print("Your Grade is 'B'");
        }
        else if(average_percentage>=55 && average_percentage<70){
            System.out.print("Your Grade is 'C'");
        }
        else if(average_percentage>=40 && average_percentage<55){
           System.out.print("Your Grade is 'D'"); 
        }
        else{
            System.out.print("Your Grade is 'E'");
        }
        sc.close();
    }
}
