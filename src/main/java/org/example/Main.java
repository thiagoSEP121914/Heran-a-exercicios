package org.example;

import entities.Employee;
import entities.OutsourcedEmployee;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employes: ");
        int qtd = sc.nextInt();
        ArrayList<Employee> employe = new ArrayList<>(qtd);


        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + "data:");
            System.out.print("Outsorced (y/n) ?");
            String outsourced = sc.nextLine();


            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            Double valuPeHour = sc.nextDouble();

            if (outsourced.equalsIgnoreCase("y")) {
                System.out.println("Additional change: ");
                Double addChange = sc.nextDouble();

                employe.add(new OutsourcedEmployee(name, hours, valuPeHour, addChange));
            } else {
                Employee employee = new Employee(name, hours, valuPeHour);
                employe.add(employee);
            }
            sc.nextLine();
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee employee: employe) {
            System.out.println(employee + "");
        }

        sc.close();
    }
}