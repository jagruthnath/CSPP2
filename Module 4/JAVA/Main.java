import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Student[] s=new Student[10];
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n=S.nextInt();
        String name = null;
        int marks,GPA;
        ArrayList<Student> al=new ArrayList<Student>();
        for (int i=0;i<n;i++) {
            System.out.println("Enter name, marks, GPA of Student : ");
            name = S.next();
            marks = S.nextInt();
            GPA = S.nextInt();
            s[i] = new Student(name, marks, GPA);
            al.add(s[i]);
        }
        for (int i = 0; i < n; ++i)
            for (int j = i+1; j < n; ++j)
                if ( s[i].GPA > s[j].GPA )
                    swap(i,j);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.name+" "+st.marks+" "+st.GPA);
        }
    }
    static void swap(int i,int j)
    {
        String t=null;
        int temp=0;

        temp=s[i].GPA;
        s[i].GPA=s[j].GPA;
        s[j].GPA=temp;

        temp=s[i].marks;
        s[i].marks=s[j].marks;
        s[j].marks=temp;

        t=s[i].name;
        s[i].name=s[j].name;
        s[j].name=t;
    }
}
class Student{
    int marks,GPA;
    String name;
    Student(String name,int marks,int GPA){
        this.marks=marks;
        this.name=name;
        this.GPA=GPA;
    }
}