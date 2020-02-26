package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {

    static Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(-5);
        list.add(7);
        list.add(12);
        list.add(-1);
        System.out.println(list);

        list.add(2, 10);
        System.out.println(list);

        list.set(1, 9);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        return list;
    }

    public static ArrayList<Double> firstAndLast(){
        ArrayList<Double> list = new ArrayList<Double>();

        int y = 1;

        while(y != 0) {
            System.out.println("Enter a decimal number: ");
            double x = scan.nextDouble();
            if(x == 0)
                y = 0;
            else
                list.add(x);

        }

        ArrayList<Double> new_list = new ArrayList<>();
        new_list.add((double)list.size());
        new_list.add(list.get(0));
        new_list.add(list.get(list.size() - 1));



        return new_list;
    }

    public static ArrayList<Double> getNumbers(){
        ArrayList<Double> list = new ArrayList<Double>();

        for(int x = 0; x < 3; x++) {
            System.out.println("Enter a decimal number: ");
            double dec = scan.nextDouble();
            list.add(dec);
        }

        return list;
    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){

        double smallest = numbers.get(0);
        double mediumest = numbers.get(0);
        double biggest = numbers.get(0);

        for(int x = 0; x < numbers.size(); x++){
            if(numbers.get(x) < smallest)
                smallest = numbers.get(x);

            else if(numbers.get(x) > biggest)
                biggest = numbers.get(x);

        }

        for(int x = 0; x < numbers.size(); x++){
            if(numbers.get(x) != smallest && numbers.get(x) != biggest){
                mediumest = numbers.get(x);
            }
        }


        ArrayList<Double> new_list = new ArrayList<>();
        new_list.add(smallest);
        new_list.add(mediumest);
        new_list.add(biggest);


        return new_list;
    }



    public static void main(String[] args){
        numberList();
        System.out.println(firstAndLast());

        ArrayList<Double> numbers = getNumbers();
        System.out.println(arrangeList(numbers));

    }

}
