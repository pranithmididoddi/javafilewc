/**
 * Created by Pranith on 5/9/16.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class wordCount {

    public static void main(String[] args)
    {
        String fileName="data.rtf";
        File file=new File(fileName);
        int count=0;

        try {

            Scanner input= new Scanner(file);
            Map<String, Integer> unique=new TreeMap<String, Integer>();

            while(input.hasNext()) {
                count++;
                String data = input.next();
                String[] str = data.split(",");

                if(unique.containsKey(data))
                {
                    unique.put(data, unique.get(data)+1);
                }
                else
                {
                    unique.put(data,1);
                }
            }
            System.out.println(unique);
            System.out.println(count);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
