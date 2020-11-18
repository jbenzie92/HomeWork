package com.johncodes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeWorkNov17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me 5 numbers 1-10");
        ArrayList<Integer> inputArray = new ArrayList();
        int userNums = 0;
        for (int i = 1; i < 6; i++) {
            userNums = Integer.parseInt(input.next());
            inputArray.add(userNums);
        }
            System.out.println(inputArray);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i) > max) {
                max = inputArray.get(i);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i) < min) {
                min = inputArray.get(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < inputArray.size(); i++) {
            sum += inputArray.get(i);
        }

        int product = 1;
        for (int i = 0; i < inputArray.size(); i++) {
            product *= inputArray.get(i);
        }

        HashMap<String, String> vehicles = new HashMap<>();
        vehicles.put("Fusion", "Ford");
        vehicles.put("CRV", "Honda");
        vehicles.put("Supra", "Toyota");
        vehicles.put("RSX", "Acura");
        System.out.println("What model of vehicle are you looking for? ");
        String modelChoice = input.next();
        for (Map.Entry<String, String> myCombo : vehicles.entrySet()) {
            if (myCombo.getKey().equals(modelChoice)){
                System.out.println("Great we have a " + modelChoice + " right this way!");
            } else {
                System.out.println("Sorry we're all out of that!");
            }

        }
    }
}