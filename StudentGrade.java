import java.util.Scanner;
public class StudentGrade{
     public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          System.out.print("enter the number of subjects:");
          int n=sc.nextInt();
          int[]marks=new int[n];
          int total=0;
          for(int i=0;i<n;i++){
               System.out.print("Enter the marks of a subject "+(i+1)+"(out of 100): ");
               marks[i]=sc.nextInt();  
               if(marks[i]<0 || marks[i]>100){
                    System.out.println("Invalid marks! Please enter betwen 0 and 100.");
                    i--;
                    continue;
               }
               total+=marks[i];
          }
          double average=(double)total/n;
          String grade;
          if(average>=90){
               grade="A+";
          }
          else  if(average>=80){
               grade="A";
          }
          else if(average>=70){
               grade="B";
          }
          else if(average>=60){
               grade="C";
          }
          else if(average>=50){
               grade="D";
          }
          else{
               grade="F(Fail)";
          }
          System.out.println("-----Results-----");
          System.out.println("Total marks: "+total);
          System.out.println("Average marks: "+average+"%");
          System.out.println("Grade: "+grade);
     }
}