import java.util.ArrayList;

public class DeleteList {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("melon");
        fruits.add("water melon");
        //int ListSize = fruits.size();
        //String place = fruits.get(3);
        //fruits.remove(1);
        fruits.clear();

        System.out.println(fruits);
    }
}