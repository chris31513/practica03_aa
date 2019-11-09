package src;
import src.BinarySearch;

public class ExponentialSearch{
    public static int search(int[] sorted_list, int n){
        if(sorted_list[0] == n){
            return 0;
        }else{
            int i = 1;
            while(i < sorted_list.length && sorted_list[i] <= n){
                i = i*2;
            }
            return BinarySearch.search(sorted_list, n, i/2, Math.min(i, sorted_list.length));
        }
    }
}