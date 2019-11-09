package src;
import java.util.Scanner;
import src.Reader;
import src.InterpolationSearch;
import src.BinarySearch;
import src.SequentialSearch;
import src.ExponentialSearch;

public class Main{
    public static void main(String[] args) {
        System.out.println("Indica el archivo a leer");
        Scanner s = new Scanner(System.in);
        String file = s.nextLine();
        Reader r = new Reader();
        int[] sorted_list = r.read(file);
        if(sorted_list != null){
            System.out.println("¿Que número quieres buscar?");
            Scanner sc = new Scanner(System.in);
            int search = Integer.parseInt(sc.nextLine());
            System.out.println("¿Qué búsqueda quieres usar? (basta con poner interpolacion, binaria, secuencial, exponencial)");
            Scanner sr = new Scanner(System.in);
            String b = sr.nextLine();
            if(b.equals("interpolacion")){
                int res = InterpolationSearch.search(sorted_list, search);
                if(res == -1){
                    System.out.println("El elemento no está en el archivo");
                }else{
                    System.out.print("El elemento ocupa la posición: ");
                    System.out.println(res);
                }
            }else if(b.equals("binaria")){
                int res = BinarySearch.search(sorted_list, search);
                if(res == -1){
                    System.out.println("El elemento no está en el archivo");
                }else{
                    System.out.print("El elemento ocupa la posición: ");
                    System.out.println(res);
                }
            }else if(b.equals("secuencial")){
                int res = SequentialSearch.search(sorted_list, search);
                if(res == -1){
                    System.out.println("El elemento no está en el archivo");
                }else{
                    System.out.print("El elemento ocupa la posición: ");
                    System.out.println(res);
                }
            }else if(b.equals("exponencial")){
                int res = ExponentialSearch.search(sorted_list, search);
                if(res == -1){
                    System.out.println("El elemento no está en el archivo");
                }else{
                    System.out.print("El elemento ocupa la posición: ");
                    System.out.println(res);
                }
            }
        }
    }
}