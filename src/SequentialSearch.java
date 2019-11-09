package src;

public class SequentialSearch{
    public static int search(int[] sorted_list, int n){
        if(sorted_list.length <= 0){
            return -1;
        }else if(sorted_list[0] == n){
            return 0;
        }else{
            int[] new_array = new int[sorted_list.length - 1];
            System.arraycopy(sorted_list, 1, new_array, 0, new_array.length);
            if(search(new_array, n) != -1){
                return 1 + search(new_array, n);
            }else{
                return -1;
            }
        }
    }
}