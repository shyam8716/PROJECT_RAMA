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
    public static void main(String[] args) {
        Method_overloading1 student=new Method_overloading1();
        student.student_info("R.Megha Shyam", 22, "Full Stack Java Developer");
        Method_overloading1 adding=new Method_overloading1();
        adding.addition(10, 20);
        Method_overloading1 employee=new Method_overloading1();
        employee.employee_salary_system(1000000,2000000 , 30000);
        Method_overloading1 car=new Method_overloading1();
        car.car_showroom("Toyota",500000,"black","2025","Toyota motors");

    }
}
