package com.bsoft.beginnersbook;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double Area = (base * height)/2;
        System.out.println("The Area of the Triangle is: " + Area);

    }
}
