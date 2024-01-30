package adityaverma;

import java.util.ArrayList;

public class SortAnArray {
    public static void sort(ArrayList<Integer> arr){
        if (arr.isEmpty()){
            return;
        }
        int val = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        sort(arr);
        insert(arr,val);
    }
    public static void insert(ArrayList<Integer> arr,int val){
        if ( arr.isEmpty() || arr.get(arr.size()-1) <= val){
            arr.add(val);
            return;
        }
        int temp = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insert(arr, val);
        arr.add(temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(0);
        arr.add(2);
        arr.add(10);
        arr.add(20);
        arr.add(29);
        arr.add(12);
        arr.add(0);
        arr.add(2);
        arr.add(111);
        arr.add(0);
        sort(arr);
        System.out.println(arr);
    }
}
