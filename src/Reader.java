package src;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Reader{
    public int[] read(String file){
        File f = new File(file);
        try{
            try{
                FileReader fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
                String[] line = bf.readLine().split(" ");
                int[] array = new int[line.length];
                for(int i = 0; i < line.length; i++){
                    array[i] = Integer.parseInt(line[i]);
                }
                return array;
            }catch(FileNotFoundException e){
                System.out.println("Archivo no encontrado");
                System.exit(0);
            }
        }catch(IOException e){
            System.out.println("Error");
            System.exit(0);
        }
        return null;
    }
}