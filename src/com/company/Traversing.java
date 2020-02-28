package com.company;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {

    static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates() {
        ArrayList<String> states = new ArrayList<String>();

        boolean done = false;

        System.out.println("Enter the name of a state or 'Stop' to quit: ");
        String state = scan.nextLine();

        if (state.equals("Stop"))
            done = true;
        else
            states.add(state);

        while (!done) {
            System.out.println("Next state or 'Stop': ");
            String nextState = scan.nextLine();
            if (nextState.equals("Stop"))
                done = true;
            else
                states.add(nextState);
        }

        return states;

    }

    public static String createList(ArrayList<String> states) {
        String list = "";
        int y = 0;
        int z = 0;

        for (int x = 0; x < states.size(); x++) {
            list += (states.get(x));
            y++;
            if (x < states.size() - 1) {
                list += " -> ";
                z++;
            }

        }

        return list;
    }


    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        ArrayList<Integer> ints = new ArrayList<Integer>();

        Scanner input = new Scanner(new File("C:\\Users\\ellerfl\\IdeaProjects\\Unit_7\\numbers.txt"));

        while (input.hasNext()) {
            ints.add(input.nextInt());
        }

        for (int x = 0; x < ints.size(); x++)
            System.out.print(ints.get(x) + " ");

        int smallest = ints.get(0);
        int biggest = ints.get(0);

        for(int x = 0; x < ints.size(); x++){
            if(ints.get(x) < smallest)
                smallest = ints.get(x);
            else if(ints.get(x) > biggest)
                biggest = ints.get(x);
        }

        ints.remove(ints.indexOf(biggest));
        ints.add(biggest);

        ints.remove(ints.indexOf(smallest));
        ints.add(0, smallest);

        System.out.println();

        for (int x = 0; x < ints.size(); x++)
            System.out.print(ints.get(x) + " ");

        return ints;

    }

    public static void main (String[]args) throws IOException {
        ArrayList<String> states = getStates();
        createList(states);

        //largestAndSmallest();
    }

}