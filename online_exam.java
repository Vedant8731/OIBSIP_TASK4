import java.util.Scanner;
public class online_exam {
    public static void main(String[] args) {
        int no=4;
        int choice;
        String stu_name;
        int id = 0;
        Scanner sc = new Scanner(System.in);
      
          System.out.print("Enter student name:");
                stu_name = sc.next();
                System.out.print("Enter roll no:");
                id = sc.nextInt();
                int count = 0;
                 System.out.println("Welcome "+stu_name+" to Online Examination");
        
        do{
        System.out.println("1.Take Exam");
        System.out.println("2.View Marks");
        System.out.println("3.Exit");
            System.out.print("Enter your choice:");
        no=sc.nextInt();
        
        if(no==3)
        {
            System.out.println("Thanks for taking exam!!");
            break;
        }
        switch(no)
        {
            case 1:
            {
                System.out.println("Select programming language:");
                System.out.println("1.Swift \n2.C++");
                System.out.println("Enter your choice:");
                int sub=sc.nextInt();
                System.out.println("There are five questions in the examination");
            
                if(sub==1)
                {
                    count=0;
                    System.out.println("1. What is Swifts type inference?");
                
                System.out.println("1. It allows developers to assign a variable without specifying its data type. \n2. It allows developers to assign a variable with only one data type.\n3. It allows developers to assign a variable with multiple data types.\n4. It does not allow developers to assign a variable without specifying its data type.");
                System.out.print("Enter answer:");
                choice=sc.nextInt();

                if(choice==1)
                {
                    ++count;
                }
                System.out.println("2. What is a closure in Swift?");
                System.out.println("1. A function that does not have a name\n2. A function that does not take any arguments\n3. A function that can capture and store references to any constants and variables from the context in which it is defined\n4. A function that can only be called from within the same file");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();

                if(choice==3)
                {
                    ++count;
                }
                  System.out.println("3. What is a protocol in Swift?");
                System.out.println("1. A blueprint for a class, struct, or enumeration\n2. A way to define properties and methods for a specific type\n3. A collection of related variables and functions\n4. A way to organize code into reusable components");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();

                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("4. What is the difference between a class and a struct in Swift?");
                System.out.println("1. A class is a reference type, and a struct is a value type.\n2. A class can inherit from another class, and a struct can not.\n3. A class has a default initializer, and a struct does not.\n4. A class is used for storing data, and a struct is used for defining behavior.");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();

                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("5. What is an optional in Swift?");
                System.out.println("1. A way to define a property that must have a value.\n2. A way to define a property that may or may not have a value.\n3. A way to define a property that can not have a value.\n4. A way to define a property that must have a default value.");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                
                  if(choice==2)
                {
                    ++count;
                }
                }
                else
                {
                    count=0;
                       System.out.println("Q.1.C++ is developed by:");
                
                System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();

                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q.2.C++ is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();

                if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q.3.C++ is:");
                System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();

                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.4. C++ is:");
                System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Strictly Object Orieneted\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();

                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.5.C++ is:");
                System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();   

                if(choice==1)
                {
                    ++count;
                }
                }                
                break;
            }
            case 2:
            {
                System.out.println("You scored "+count+" out of 5");
            }
        }    
    }while(true);
}
    public online_exam() {
    }
}