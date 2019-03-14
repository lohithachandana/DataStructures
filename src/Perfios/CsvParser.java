package Perfios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CsvParser {
    public static void main(String[] a){

       // File file= new File("/Users/sanathchandrayapatla/Desktop/input.csv");
        Scanner sc=new Scanner(System.in);
        String filepath=sc.nextLine();
        File file= new File(filepath);

        // this gives you a 2-dimensional array of strings
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));
            }

            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[][] maze=new String[lines.size()][lines.get(0).size()];
        for(int i=0;i<lines.size();i++){
            for(int j=0;j<lines.get(i).size();j++){
                maze[i][j]=lines.get(i).get(j);
            }
        }
        // /Users/sanathchandrayapatla/Desktop/input.csv
        //String[][] maze=lines.toArray().toString().split("");
        //System.out.println(Arrays.deepToString(maze));
        System.out.println(maze[2][6]);
    }
}
