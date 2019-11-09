package src;

public class InterpolationSearch{
    public static int search(int[] sorted_list, int n){
        int l = 0;
        int h = sorted_list.length - 1;
        return search_help(sorted_list, n, l, h);
    }

    protected static int search_help(int[] sorted_list, int n, int l, int h){
        if(l == h){
            return sorted_list[l] == n?l:-1;
        }
        if(l < h){
            int i = l + (((h-l) / (sorted_list[h]-sorted_list[l]))*(n - sorted_list[l]));
            if(sorted_list[i] == n){
                return i;
            }else{
                if(sorted_list[i] < n){
                    l = i + 1;
                }else{
                    h = i - 1;
                }
                return search_help(sorted_list, n, l, h);
            }
        }
        return -1;
    }
}