import java.util.*;
class Course
{
    public int code,credit,count,students;
    public String tittle,date,time,venue,mentor;
    Course(int code,int credit,String tittle,String date,String time,String venue,String mentor)
    {
        this.code=code;
        this.credit=credit;
        this.tittle=tittle;
        this.date=date;
        this.time=time;
        this.venue=venue;
        this.mentor=mentor;
    }
    public void display()
    {
        System.out.println("*******************************");
        System.out.println("COURSE CODE:"+code);
        System.out.println("COURSE CREDIT:"+credit);
        System.out.println("COURSE TITTLE:"+tittle);
        System.out.println("COURSE DATE:"+date);
        System.out.println("COURSE TIME:"+time);
        System.out.println("COURSE VENUE:"+venue);
        System.out.println("COURSE MENTOR:"+mentor);
        System.out.println("NO.OF COUNT:"+count);
        System.out.println("NO.OF STUDENTS:"+students);
        System.out.println("*******************************");
    }
}
class Fees extends Course
{
    int course_id;
    Fees(int code,int credit,String tittle,String date,String time,String venue,String mentor,int course_id)
    {
        super(code,credit,tittle,date,time,venue,mentor);
        this.course_id=course_id;
    }


    public void feescourse()
    {
        System.out.println("\t\t--------------------------");
        System.out.println("\t\tWELCOME TO COURSE MANAGEMENT\n");
        System.out.println("\t\t--------------------------");
        System.out.println("*******************************");
        System.out.println("-----FEES COURSE-----");
        System.out.println("->Java");
        System.out.println("->c");
        System.out.println("->python");
        System.out.println("->Data structure");
        System.out.println("->c++");
        System.out.println("->Biopython");
        System.out.println("->HTML");
        System.out.println("->COST FOR THREE MONTH:RS 2250");
        System.out.println("********************************");
    }
    public void dis()
    {
        feescourse();
    }
}
interface Extracourse
{
     void disp();
}
class Student implements Extracourse
{
    public void Subjectcourse()
    {
        System.out.println("********************************");
        System.out.println("----- STUDENT -----");
        System.out.println("->1 Student Name");
        System.out.println("->Student ID");
        System.out.println("->First Name");
        System.out.println("->Last Name");
        System.out.println("->SurName");
        System.out.println("->Student E-mail");
        System.out.println("->Student Address");
        System.out.println("->Student Phone");
        System.out.println("->Student D.O.B");
        System.out.println("->Student Age");
        System.out.println("********************************");
    }
    public void disp()
    {
        Subjectcourse();
    }
}

public class Shar {

    public static void main(String[] args) {
	// write your code here
        Course[] C;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STUDENTS:\n");
        int N=sc.nextInt();
        C=new Course[N];
        for(int i=0;i<N;i++)
        {
            System.out.println("ENTER STUDENTS DETAILS FOR COURSE REGISTRATION\n");
            System.out.println("ENTER THE CODE:");
            int code=sc.nextInt();
            System.out.println("ENTER THE CREDIT:");
            int credit=sc.nextInt();
            System.out.println("ENTER THE TITTLE:");
            String tittle=sc.next();
            System.out.println("ENTER THE DATE:");
            String date=sc.next();
            System.out.println("ENTER THE TIME:");
            String time=sc.next();
            System.out.println("ENTER THE VENUE:");
            String venue=sc.next();
            System.out.println("ENTER THE MENTOR:");
            String mentor=sc.next();
            System.out.println("ENTER NO.OF.STUDENTS:");
            int students=sc.nextInt();
            System.out.println("TOTAL="+(students));
            System.out.println("ENTER THE TOTAL NO.OF DAYS:");
            int days=sc.nextInt();
            C[i]=new Course(code,credit,tittle,date,time,venue,mentor);
            System.out.println("AVAILABLE PACKAGES");
            Fees f=new Fees(1,3,"3","6","xxxxxxxxxx","0123456789",mentor,101);
            f.feescourse();
            Student s=new Student();
            s.Subjectcourse();
            System.out.println("SELECT YOUR PREFERENCE\n");
            System.out.println("1.Fees course");
            System.out.println("2.Student course");
            System.out.println("-------------------------");
            int select=sc.nextInt();
            switch(select)
            {
                case 1:
                    System.out.println("----------------------------------");
                    System.out.println("You have selected fees course");
                    System.out.println("Total cost=RS "+(days*2250));
                    System.out.println("----------------------------------");
                    C[i].display();
                    System.out.println("ADDITIONAL COURSE");
                    System.out.println("->CYBER SECURITY");
                    System.out.println("->BLOCK CHAIN");
                    System.out.println("->INTERNET OF THINGS");
                    System.out.println("->DATA BASE MANAGEMENT");
                    System.out.println("ARTIFICIAL INTELLIGENCE");
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("You have selected Student course");
                    System.out.println("Total cost=RS "+(days*3240));
                    System.out.println("----------------------------------------");
                    C[i].display();
                    System.out.println("ADDITIONAL COURSE");
                    System.out.println("->CYBER SECURITY");
                    System.out.println("->BLOCK CHAIN");
                    System.out.println("->INTERNET OF THINGS");
                    System.out.println("->DATA BASE MANAGEMENT");
                    System.out.println("ARTIFICIAL INTELLIGENCE");
                    break;
                default:
                    System.out.println("NO COURSES AVAILABLE");
                    break;
            }
        }
    }
}