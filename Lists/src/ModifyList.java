import java.util.ArrayList;

public class ModifyList {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("melon");
        fruits.add("water melon");
        //int ListSize = fruits.size();
        //String place = fruits.get(3);
        fruits.set(1,"green banana");

        System.out.println(fruits);
    }
}