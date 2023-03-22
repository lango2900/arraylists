import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

// ArrayList - a resizable array | elements can be removed and stored after compiled | store reference data types
        // need to use wrapper class for int, char, etc when using array lists

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");       // .add method adds strings to array
        food.add("hamburger");
        food.add("hotdog");


       food.set(0,"sushi");// .set method replaces an aspect of an array [index , new string] | pizza replaced by sushi


        food.remove(1); //.remove method deletes a string within your array | this will remove "hamburger"

        food.clear(); //.clear will fully wipe the array list 


        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i)); //.get method returns strings from array | this code will increment the foods
        }
    }
}