import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int res = 0;
        for (String x : list) {
            if(x.substring(0,1).equalsIgnoreCase("a")) res++;
        }
        return res;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            res.add(i, list.get(i) + "!");
        }
        return res;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int x: list1) {
            for (int y : list2) {
                if(x == y) return true;
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for (int x :
                list) {
            if(x % 2 != 0) count++;
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int num = 0;
        for (int x : arr) {
            res.add(num, x);
            num++;
        }
        return res;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        list1.sort(Comparator.naturalOrder());
        return list1;
    }

    public static void main(String[] args) {
        System.out.println(MyMain.countOdd(new ArrayList<Integer>(Arrays.asList(new Integer[] {3, 1, 3, 2, 5})))); // 4
        System.out.println(MyMain.convertToArrayList(new int[] {3, 1, 3, 2, 5})); // [3, 1, 3, 2, 5]

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 7, 7, 9}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {7, 10, 11, 18, 19}));

        System.out.println(MyMain.merge(list1, list2)); // [1, 2, 7, 7, 7, 9, 10, 11, 18, 19]
    }
}
