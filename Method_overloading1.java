public class Method_overloading1 {
    /*1.Create a program for Student Information using method overloading.*/
   public void student()
{
    System.out.println("Student details");
}

public void student(String name)
{
    System.out.println("Name: " + name);
}

public void student(String name, int age, String course)
{
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Course: " + course);
}
    /*2.Create a program for Addition Calculator using method overloading.*/
    public void addition(int a, int b){
        int sum=a+b;
        System.out.println("The sum of two numbers are: "+sum);
    }
    /*3.Create a program for Employee Salary System using method overloading.*/
    public void salary(int basic, int bonus, int allowance){
        System.out.println("Employee basic salary is: "+basic+" and bonous salary is: "+bonus+" and allowance is: "+allowance);
    }
    /*4.Create a program for Car Showroom Details using method overloading.*/
    public void car(String name, int price, String color, String model){
        System.out.println(" The car name is: "+name+" \n car price is: "+price+" \n car color is: "+color+ "\n car model is: "+model);
    }
    /*5.Create a program for Mobile Store Details using method overloading.*/
    public void mobile(String name, int price, String model){
        System.out.println(" The mobile name is: "+name+"\n  mobile price is: "+price+"\n  mobile model is: "+model);
    }
    /*6.Create a program for Area Calculator (different shapes) using method overloading.*/
    public int area(int length, int breath){
    int area=length*breath;
    return area;
    }
    /*7.Create a program for Bank Transaction System using method overloading.*/
    public void transaction(String account, int amount){
        System.out.println("Account name is: "+account+"\n amount is: "+amount);
    }
    /*8.Create a program for Course Details using method overloading.*/
    public void course(String name, int duration, int fee){
        System.out.println("I am pursuing this course "+name+" for "+duration+"months and course fee is: "+fee);
    }
    /*9.Create a program for Book Information System using method overloading.*/
    public String book(String name, String author, int price){
        return "The bbok name is: "+name+" and author name is: "+author+" and price is: "+price;
    }
    /*10.Create a program for Hospital Management System using method overloading.*/
    public String hospital(String name, int patients, int doctors){
        return "The hospital name is: "+name+" and patient count is: "+patients+" and doctor count is: "+doctors;
    }
    public static void main(String[] args) {
        Method_overloading1 student=new Method_overloading1();
        student.student("R.Megha Shyam", 22, "Full Stack Java Developer");
        Method_overloading1 adding=new Method_overloading1();
        adding.addition(10, 20);
        Method_overloading1 employee=new Method_overloading1();
        employee.salary(1000000,2000000 , 30000);
        Method_overloading1 car=new Method_overloading1();
        car.car("Toyota",500000,"black","2025");
        Method_overloading1 mobile=new Method_overloading1();
        mobile.mobile("samsung", 200000, "galaxy 42l");
        Method_overloading1 area1=new Method_overloading1();
        System.out.println("The area of rectangle is:"+area1.area(5, 10));
        Method_overloading1 bank=new Method_overloading1();
        bank.transaction("R.megha shyam",1100000);
        Method_overloading1 course=new Method_overloading1();
        course.course("Full stack java",6,24000);
        Method_overloading1 book=new Method_overloading1();
        System.out.println(book.book("vajrayudam", "R.Megha Shyam",200000));
        Method_overloading1 hospital=new Method_overloading1();
        System.out.println(hospital.hospital("Apollo Hospitals", 20000, 290728974));
        }
}
