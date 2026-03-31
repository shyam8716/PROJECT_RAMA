public class Method_overloading2 {
    /*11.Create a program for Product Store using method overloading.*/
    public void product_details(){
        System.out.println("The product name  is lapotops");
        System.out.println("The product price is: "+45000000);
        System.out.println("The product model is: "+2026);
    }
    /*12.Create a program for Movie Information System using method overloading.*/
    public String movie_details(){
        return "Avengers doomday";
    }
    /*13.Create a program for Bike Showroom using method overloading.*/
    public int bike_details(int price){
        return  price;
    }
    /*14.Create a program for City Information System using method overloading*/
    public String city_information(String city_name,int population){
        return "The city name is: "+city_name+" and the city population is: "+population;
    }
    /*15.Create a program for Game Details System using method overloading*/
    public void game_system(){
        System.out.println("The game name is :free_fire");
        System.out.println("Number of players are: multi-player");
        System.out.println("The game price is: free");
    }
    /*16.Create a program for Library Management System using method overloading.*/
    public String library_details(String book_name,String author_name,int nuMber_of_books){
        return "The book name is: "+book_name+" and the book author is: "+author_name+" and number of books are: "+nuMber_of_books;
    }
    /*17.Create a program for Restaurant Information System using method overloading.*/
    public void restaurant_system(){
        System.out.println("The restaurant name is: pai vaisory");
        System.err.println("The restaurant location is: Tirupati");
        System.out.println("The restaurant rating is: 5.5/10");
        System.out.println("The restaurant quantity is super");
    }
    /*18.Create a program for School Management System using method overloading.*/
    public int school_details(int number_of_boys,int number_of_girls){
        return number_of_boys+number_of_girls;
    }
    /*19.Create a program for Technology Company System using method overloading.*/
    public void technology_company(){
        System.out.println("The company name is: sri vency company");
        System.out.println("The company location is: Tirupati");
        System.out.println("The company CEO IS: Bhanu prakash");
    }
    /*20.Create a program for Vehicle Information System using method overloading*/
    public String vehicle_details(String vehicle_name,String vehicle_model,String vehicle_type,int vehicle_price){
        return "The vehicle name is: "+vehicle_name+"\n The vehicle model is: "+vehicle_type+"\n The vehicle price is"+vehicle_price;
    }
    public static void main(String[] args) {
        Method_overloading2 product=new Method_overloading2();
        product.product_details();
        Method_overloading2 movie=new Method_overloading2();
        System.out.println(movie.movie_details());
        Method_overloading2 bike=new Method_overloading2();
        System.out.println("bike price is: "+bike.bike_details(20000));  
        Method_overloading2 city=new Method_overloading2();
        System.out.println(city.city_information("Tirupati",500000000));
        Method_overloading2 game=new Method_overloading2();
        game.game_system();
        Method_overloading2 library=new Method_overloading2();
        System.out.println(library.library_details("vajrayudam", "R.Megha Shyam", 100));
        Method_overloading2 restaurant=new Method_overloading2();
        restaurant.restaurant_system();
        Method_overloading2 school=new Method_overloading2();
        System.out.println("The total number of students are: "+school.school_details(25,45));
        Method_overloading2 company=new Method_overloading2();
        company.technology_company();
        Method_overloading2 vehicle=new Method_overloading2();
        System.out.println(vehicle.vehicle_details("toyota", "camry", "sedan", 200000));
     }
}
