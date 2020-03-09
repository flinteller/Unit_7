package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {

    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        ArrayList<Integer> dups = new ArrayList<Integer>();


        Scanner input = new Scanner(new File("C:\\Users\\ellerfl\\IdeaProjects\\Unit_7\\file1.txt"));
        Scanner scan = new Scanner(new File("C:\\Users\\ellerfl\\IdeaProjects\\Unit_7\\file2.txt"));

        while (input.hasNext()) {
            ints1.add(input.nextInt());
        }

        while (scan.hasNext()) {
            ints2.add(scan.nextInt());
        }

        for(int x = 0; x < 20; x++){
            for(int y = 0; y < 20; y++){
                if(ints1.get(x) == ints2.get(y))
                    dups.add(ints2.get(y));
            }
        }
        for(int x = 0; x < dups.size(); x++){
            System.out.println(dups.get(x));
        }


        return dups;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        ArrayList<String> names_list = new ArrayList<>();
        String names_string = "";


        Scanner scan = new Scanner(new File("C:\\Users\\ellerfl\\IdeaProjects\\Unit_7\\names.txt"));

        names_string += scan.nextLine();

        int total_length = 0;

        while(names_string.indexOf(" ", total_length) != -1){
            String word = names_string.substring(total_length, names_string.indexOf(" ", total_length) + 1);
            names_list.add(word);
            total_length += word.length();
        }


        names_list.add(names_string.substring(total_length));

        System.out.println(names_list);


        for(int x = 0; x < names_list.size(); x++){
            for(int y = 0; y < names_list.size(); y++){
                if(names_list.get(x).equals(names_list.get(y)) &&  x != y) {
                    names_list.remove(y);
                }
            }
        }

        return names_list;

    }

    public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        ArrayList<Integer> ints = new ArrayList<>();

        Scanner input = new Scanner(new File("C:\\Users\\ellerfl\\IdeaProjects\\Unit_7\\file1.txt"));

        //finds max number

//        int max_num = Integer.MIN_VALUE;
//
//        for(int a = 0; a < 20; a++){
//            int num = input.nextInt();
//            if(num > max_num)
//                max_num = num;
//        }

        int max_num = 97;

        max_num ++;

        System.out.println(max_num);

        // 97

        // adds zeros
        for(int w = 0; w < max_num; w++){
            ints.add(0);
        }

        //add in numbers at index and element
        while(input.hasNext()){
            int num = input.nextInt();
            ints.set(num, num);
            //System.out.println(num + " hi");
        }

        // removes zeros
        for(int x = 0; x < ints.size(); x++){
            if(ints.get(x) == 0){
                ints.remove(x);
                x--;
            }

        }

        for (int y = 0; y < ints.size(); y++) {
            System.out.print(ints.get(y) + " , ");
        }

        //System.out.println(5);

        return ints;
    }

    public static void main(String[] args) throws FileNotFoundException {
        fileDuplicates();

        fileDuplicatesTwo();

        orderedList();
    }
}
