package InterviewQuestions;/* Save this in a file called InterviewQuestions.Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processData(ArrayList<String> array) {
        int count=0;
        double[] version= new double[array.size()];
        ArrayList<String[]> temp = new ArrayList<String[]>();
        HashMap<String,Double> map= new HashMap<String, Double>(); // storing the latest versions of the softwares, since they are not provided with input
        map.put("MySQL",5.7);map.put("Ubuntu",12.04);map.put("Python",3.7);
        for(int i=0;i<array.size();i++){
             temp.add(array.get(i).split(", ")); // converting each line which is string to string array by splitting the line using ", " delimiter
        }
        for(String[] t:temp){
            //t[2] is the software name
            if(map.containsKey(t[2])){
                //t[3] has the version number which is installed
                String[] tmp=t[3].split("\\.", -1);// splitting this version number by  dot "." to handle multiple points like 2.6.3
                  if(tmp.length>2){
                      t[3]= t[3].substring(0,t[3].length()-2);
                  }
                double vers=Double.parseDouble(t[3]);// converting the string to double
                if(vers<map.get(t[2])){
                    version[count]=vers; //if old version found, adding it to an array
                    count++;
                }
            }
        }
        int num=0;
        HashMap<Double,Boolean> mapVersion= new HashMap<Double, Boolean>();
        for(int j=0;j<count;j++){
            if(mapVersion.containsKey(version[j])){ // finding the duplicates
                num++;  // number of duplicates is our answer
            }else{
                mapVersion.put(version[j],true);
            }
        }
        return num;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        try {
            FileReader file = new FileReader("/Users/sanathchandrayapatla/Desktop/input.txt");
           // Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            Scanner in = new Scanner(new BufferedReader(file));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                    inputData.add(line);
            }
            int retVal = processData(inputData);
            System.out.println(retVal);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
