public class String_Introduction{
    public static void main(String[] args){
        
        String name = "Jai Gora";                                       //method 1 (optimised method than method 2) {stored in String pool area}
        String anotherName = new String("Jai Gora");                   // method 2 {stored in heap area}
        System.out.println(name);
        System.out.println(anotherName);
        
        System.out.println(name == anotherName);     
        System.out.println("Enter the first number: ");                  // false because one is stored at heap area and another is at string pool area
        
    }
}
