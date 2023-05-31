package com.shreepad;

import java.util.Scanner;

public class OneA
{
    Scanner sc = new Scanner(System.in);

    //Define instance variable name
    private String name;
    private String address;
    private String email_id;

    private double total_fee;

    public static String branch;
    public static double B_tech=60000;
    public static double mca=70000;
    private static double me=80000;


    //Default constructor
    public OneA(){
    }

    //parameter constructor
    public OneA(String name, String address, String email_id, String branch)
    {
        this.name = name;
        this.address = address;
        this.email_id = email_id;
        this.branch=branch;
        double fee=branch(branch);
        this.total_fee = fee;


    }
    //define member function for enter student details
    public void student_details()
    {
        System.out.println("Enter Student Name:");
        name=sc.nextLine();
        System.out.println("Enter Adrress:");
        address = sc.nextLine();
        System.out.println("Enter Email Address:");
        email_id = sc.nextLine();
        System.out.println("Enter Branch:");
        branch=sc.nextLine();
        double fee=branch(branch);
        total_fee = fee;

    }

    //define member function for display student details
    public void display(){
        System.out.println("Name="+this.name);
        System.out.println("Address:"+this.address);
        System.out.println("Email:"+this.email_id);
        System.out.println("Branch:"+this.branch);
        System.out.println("Total_Fee:"+this.total_fee);
    }
    public static double branch(String b)
    {
        if (b.equalsIgnoreCase("mca")){
            return mca;
        }
        else if(b.equalsIgnoreCase("B.tech"))
        {
            return B_tech;
        }
        else if(b.equalsIgnoreCase("me"))
        {
            return me;
        }
        else {
            System.out.println("Sorry Branch are not there ");
            return 0;
        }
    }
    //Main Method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        OneA obj = new OneA();

//        Student obj2=new Student("Prince","Patna","prince@gmail.com","me");
//        obj2.display();

        while (true) {
            System.out.println("1.Enter Student Details");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            System.out.println("Enter Choice=");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.student_details();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid input Please try again!");
            }

        }
    }
}