package day11_string;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter service quality:");
        String serviceQuality = input.next();
        System.out.println("Enter if you split or no split:");
        boolean splitOrNot = input.nextBoolean();
        System.out.println("Enter number of people:");
        int numberPeople = input.nextInt();
        System.out.println("Enter check amount:");
        double checkAmount = input.nextDouble();

        if (serviceQuality.equalsIgnoreCase("Excellent") || serviceQuality.equalsIgnoreCase("Great") || serviceQuality.equalsIgnoreCase("Good") || serviceQuality.equalsIgnoreCase("Fair") || serviceQuality.equalsIgnoreCase("Poor")) {
            if (serviceQuality.equalsIgnoreCase("Excellent")) {
                double totalTip = checkAmount * 0.25;
                if (splitOrNot) {
                    double perPersonTotal = checkAmount / numberPeople;

                    double tipPerPerson = totalTip / numberPeople;
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                    System.out.println("Total per person: " + perPersonTotal);
                    System.out.println("Tip per person: " + tipPerPerson);
                } else {
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                }
            } else if (serviceQuality.equalsIgnoreCase("Great")) {
                double totalTip = checkAmount * 0.2;
                if (splitOrNot) {
                    double perPersonTotal = checkAmount / numberPeople;

                    double tipPerPerson = totalTip / numberPeople;
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                    System.out.println("Total per person: " + perPersonTotal);
                    System.out.println("Tip per person: " + tipPerPerson);
                } else {
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                }
            } else if (serviceQuality.equalsIgnoreCase("Good")) {
                double totalTip = checkAmount * 0.15;
                if (splitOrNot) {
                    double perPersonTotal = checkAmount / numberPeople;

                    double tipPerPerson = totalTip / numberPeople;
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                    System.out.println("Total per person: " + perPersonTotal);
                    System.out.println("Tip per person: " + tipPerPerson);
                } else {
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                }
            } else if (serviceQuality.equalsIgnoreCase("Fair")) {
                double totalTip = checkAmount * 0.10;
                if (splitOrNot) {
                    double perPersonTotal = checkAmount / numberPeople;

                    double tipPerPerson = totalTip / numberPeople;
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                    System.out.println("Total per person: " + perPersonTotal);
                    System.out.println("Tip per person: " + tipPerPerson);
                } else {
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                }
            } else if (serviceQuality.equalsIgnoreCase("Poor")) {
                double totalTip = checkAmount * 0.05;
                if (splitOrNot) {
                    double perPersonTotal = checkAmount / numberPeople;

                    double tipPerPerson = totalTip / numberPeople;
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                    System.out.println("Total per person: " + perPersonTotal);
                    System.out.println("Tip per person: " + tipPerPerson);
                } else {
                    System.out.println("Number of people: " + numberPeople);
                    System.out.println("Total pay: " + checkAmount);
                    System.out.println("Total tip: " + totalTip);
                }
            }

        } else {
            System.out.println("No tip");


        }

    }}
