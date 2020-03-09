package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> readFile() throws FileNotFoundException {
        ArrayList<Donor> donors = new ArrayList<>();

        Scanner scan = new Scanner(new File("C:\\Users\\ellerfl\\IdeaProjects\\Unit_7\\donors.txt"));

        while(scan.hasNext()){
            String line = scan.nextLine();
            String name = line.substring(0, line.indexOf(" "));
            String amount_str = line.substring(line.indexOf(" "));
            double amount = Double.parseDouble(amount_str);
            donors.add(new Donor(name, amount));
        }

        for(Donor a:donors){
            System.out.println(a);
        }
        System.out.println("\n");


        return donors;
    }

    public static ArrayList<Donor> sortDonors(ArrayList<Donor> donors) {
        ArrayList<Donor> orderedDonors = new ArrayList<>();
        ///////////////////////////////////////////////
        // run through a loop and count the number of donations that current donation is bigger than, then place it at that index
        ///////////////////////////////////////////////

        for(int a = 0; a < donors.size(); a++){
            orderedDonors.add(a, new Donor( "Jim", 1.0));
        }

        for(int x = 0; x < donors.size(); x++){
            int count = 0;
            for(int y = 0; y < donors.size(); y++){
                if(donors.get(x).getAmount() > donors.get(y).getAmount()){
                    count++;
                }
            }
            orderedDonors.set((orderedDonors.size() - 1) - count, donors.get(x));

        }



        for(Donor z: orderedDonors){
            System.out.println(z);
        }

        return orderedDonors;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Donor> donors = readFile();
        sortDonors(donors);
    }

}