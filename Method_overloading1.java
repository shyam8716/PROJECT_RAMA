public class Method_overloading1 {
    /*1.Create a program for Student Information using method overloading.*/
    public void student_info(String name,int age,String course){
    
        System.out.println("my name is: "+name);
        System.out.println("my age is: "+age);
        System.out.println("my course is: "+course);
    }
    /*2.Create a program for Addition Calculator using method overloading.*/
    public void addition(int a,int b){
        int sum=a+b;
        System.out.println("The sum of two numbers are: "+sum);
    }
    /*3.Create a program for Employee Salary System using method overloading.*/
    public void employee_salary_system(int basic_salary,int bonous,int allowance){
        System.out.println("Employee basic salary is: "+basic_salary+" and bonous salary is: "+bonous+" and allowance is: "+allowance);
    }
    /*4.Create a program for Car Showroom Details using method overloading.*/
    public void car_showroom(String car_name,int price,String color,String model,String company){
        System.out.println(" The car name is: "+car_name+" \n car price is: "+price+" \n car color is: "+color+ "\n car model is: "+model+" \n company name is: "+company);
    }
    /*5.Create a program for Mobile Store Details using method overloading.*/
    public void mobile_details(String mobile_name, int price, String model){
        System.out.println(" The mobile name is: "+mobile_name+"\n  mobile price is: "+price+"\n  mobile model is: "+model);
    }
    /*6.Create a program for Area Calculator (different shapes) using method overloading.*/
    public int area_calculator(int length,int breath){
    int area=length*breath;
    return area;
    }
    /*7.Create a program for Bank Transaction System using method overloading.*/
    public void bank_transcation(String account_name,String account_number,int amount){
        System.out.println("Account name is: "+account_name+"\n account_number is"+account_number+"\n amount is: "+amount);
    }
    /*8.Create a program for Course Details using method overloading.*/
    public void course_details(String course_name, int course_duration,int course_fee){
        System.out.println("I am pursuing this course "+course_name+" for "+course_duration+"months and course fee is: "+course_fee);
    }
    /*9.Create a program for Book Information System using method overloading.*/
    public String book_details(String book_name,String author_name,int price){
        return "The bbok name is: "+book_name+" and author name is: "+author_name+" and price is: "+price;
    }
    /*10.Create a program for Hospital Management System using method overloading.*/
    public String hospital_details(int patient_count,int age,int carona_virus_count){
        return "The patient count is: "+patient_count+" and age is: "+age+" and coronavirus count is: "+carona_virus_count;
    }
    public static void main(String[] args) {
        Method_overloading1 student=new Method_overloading1();
        student.student_info("R.Megha Shyam", 22, "Full Stack Java Developer");
        Method_overloading1 adding=new Method_overloading1();
        adding.addition(10, 20);
        Method_overloading1 employee=new Method_overloading1();
        employee.employee_salary_system(1000000,2000000 , 30000);
        Method_overloading1 car=new Method_overloading1();
        car.car_showroom("Toyota",500000,"black","2025","Toyota motors");
        Method_overloading1 mobile=new Method_overloading1();
        mobile.mobile_details("samsung", 200000, "galaxy 42l");
        Method_overloading1 area1=new Method_overloading1();
        System.out.println("The area of rectangle is:"+area1.area_calculator(5, 10));
        Method_overloading1 bank=new Method_overloading1();
        bank.bank_transcation("R.megha shyam","sbi",1100000);
        Method_overloading1 course=new Method_overloading1();
        course.course_details("Full stack java",6,24000);
        Method_overloading1 book=new Method_overloading1();
        System.out.println(book.book_details("vajrayudam", "R.Megha Shyam",200000));
        Method_overloading1 hospital=new Method_overloading1();
        System.out.println(hospital.hospital_details(20000, 290728974, 737397973));
        }
}
