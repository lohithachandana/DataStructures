package Perfios.Submission;

import java.io.*;
import java.util.*;



public class Maze {

    public static String toString(List<List<Integer>> list){
        String s="";
        for(List<Integer> tmp:list){
            s=s+"("+tmp.get(0)+","+tmp.get(1)+")"+"->";
        }
        return s.substring(0,s.length()-2);
    }
    public static void exits(String[][] maze){
        int i=0,j=0;String curr;
        List<List<Integer>> path= new ArrayList<List<Integer>>();
        path.add(Arrays.asList(i,j));

        int row=maze.length,col=maze[0].length;
        while(i>=0&&i<row && j>=0 && j<col){
            curr=maze[i][j];
            List<Integer> tmp=new ArrayList<>();
            int size=path.size();
            //String right=j+1<col?maze[i][j+1]:-1,left=j-1>=0?maze[i][j-1]:-1,up=i-1>=0?maze[i-1][j]:-1,down=i+1<row?maze[i+1][j]:-1;
            String right=j+1<col?maze[i][j+1]:"1"
                    ,left=j-1>=0?maze[i][j-1]:"1"
                    ,up=i-1>=0?maze[i-1][j]:"1"
                    ,down=i+1<row?maze[i+1][j]:"1";

            if(i==row-1 && j==col-1){
                System.out.println(toString(path));
                return;
            }

            if(right.equals("O")||down.equals("O")){
                if(right.equals("O")){

                    j=j+1<col?j+1:j;
                    tmp.add(i);tmp.add(j);
                    path.add(tmp);
                }else if(down.equals("O")){

                    i=i+1<row?i+1:i;
                    tmp.add(i);tmp.add(j);
                    path.add(tmp);

                }
            }else{
                if(left.equals("O")){

                    path.remove(size-1);
                    maze[i][j]="X";
                    j=j-1<0?j:j-1;

                }else if(up.equals("O")){

                    path.remove(size-1);
                    maze[i][j]="X";
                    i=i-1<0?i:i-1;


                }

            }
        }
    }

    public static void main(String[] a) throws  Exception{
        Scanner sc=new Scanner(System.in);
        String filepath=sc.nextLine();

       // File file= new File("/Users/sanathchandrayapatla/Desktop/input.csv");
        File file= new File(filepath);
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
        exits(maze);
    }
}
