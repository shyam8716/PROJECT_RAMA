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
    public static void main(String[] args) {
        Method_overloading2 product=new Method_overloading2();
        product.product_details();
        Method_overloading2 movie=new Method_overloading2();
        System.out.println(movie.movie_details());
        Method_overloading2 bike=new Method_overloading2();
        System.out.println("bike price is: "+bike.bike_details(20000));  
     }
}
