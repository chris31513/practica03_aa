package src;

public class BinarySearch{

    public static int search(int[] sorted_list, int n){
        return search(sorted_list, n, 0, sorted_list.length - 1);
    }

    protected static int search(int[] sorted_list, int n, int first, int last){
        int i = (first + last)/2;
        if(last < first){
            return -1;
        }else{
            if(sorted_list[i] == n){
                return i;
            }else if(n < sorted_list[i]){
                return search(sorted_list, n, first, i - 1);
            }else if(n > sorted_list[i]){
                return search(sorted_list, n, i + 1, last);
            }
            return -1;
        }
    }
}