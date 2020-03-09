package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

    public static ArrayList<Integer> getUnsorted() throws FileNotFoundException {
        ArrayList<Integer> unsorted = new ArrayList<>();

        Scanner scan = new Scanner(new File("/Users/flinteller/IdeaProjects/Unit_7/sortedData1.txt"));

        while(scan.hasNext()){
            unsorted.add(scan.nextInt());
        }

        return unsorted;
    }


    public static boolean isSorted(ArrayList<Integer> arr){
        boolean answer = false;

        int y = arr.size() - 2;

        int count = 0;

        for(int x = arr.size() - 1; x > 0; x--){
            if(arr.get(x) > arr.get(y))
                count++;
            y--;
        }

        if(count == 7)
            answer = true;

        return answer;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> arr = getUnsorted();
        System.out.println(isSorted(arr));
    }


}