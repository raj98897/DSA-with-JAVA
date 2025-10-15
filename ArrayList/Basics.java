import java.util.*;
class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // Adding element in ArrayList
        arr.add(5);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        // set index to value arr[0] = 1
        arr.set(0,100);
        arr.remove(2); // remove ith element
        Collections.sort(arr); // sort
        Collections.reverse(arr); // reversing
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        System.out.println(arr);

    }
}