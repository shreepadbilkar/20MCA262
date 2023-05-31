package com.shreepad;

import java.util.Scanner;
public class OneB
{
    //Data member for Student details
    String name;
    String usn;
    String email;
    //Data member for College details
    String branch;
    Double total_fee;
    Double tfees;
    Double ad_fee;
    Double tution_fees;
    Double fee1;

    static String college_name;
    static String college_address;
    static String phone_no;

    static {
        college_name = "RVCE";
        college_address = "Mysore Road";
        phone_no = "7784534532";
    }

    //default constructor
    OneB(){
    }

    //parameter constructor
    OneB(String name)
    {
        this.name=name;
    }
    //parameter constructor
    OneB(String name,String usn,String email,String branch)//Constructor overloading
    {
        this(name);
        this.usn=usn;
        this.total_fee=check_Branch(branch);
        this.email=email;
        this.branch=branch;
    }

    // Member function for set data data
    public void set_Data(String name,String usn)
    {
        this.name=name;
        this.usn=usn;
    }

    // Member function for set data
    public void set_Data(String name,String usn,String email,String branch)//method overloading
    {
        this.set_Data(name,usn);
        this.usn=usn;
        this.total_fee=check_Branch(branch);
        this.email=email;
        this.branch=branch;
    }
    //Display method
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("USN:"+usn);
        System.out.println("Email:"+email);
        System.out.println("Branch:"+branch);
        System.out.println("College Name:"+college_name);
        System.out.println("College Address:"+college_address);
        System.out.println("Total Fee:"+total_fee);
    }

    public double check_Branch(String b)
    {
        ad_fee = 3000.0;
        tution_fees = 5000.0;
        fee1 = 10000.0;
        tfees = ad_fee + tution_fees + fee1;
        if (b.equalsIgnoreCase("civil")){
            return tfees += 50000;
        }
        else if(b.equalsIgnoreCase("bio_tech"))
        {
            return tfees += 80000;
        }
        else if(b.equalsIgnoreCase("EC"))
        {
            return tfees += 150000;
        }
        else {
            System.out.println("Sorry Branch are not there ");
            return 0;
        }
    }
    public static void main(String[] args) {
        String name;
        String usn;
        String email;
        String branch;

        Scanner sc=new Scanner(System.in);
        OneB obj=new OneB();

        while (true) {
            System.out.println("1.Enter Student Details");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            System.out.println("Enter Choice=");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("Enter Name:");sc.nextLine();
                    name=sc.nextLine();
                    System.out.println("Enter USN:");
                    usn=sc.nextLine();
                    System.out.println("Enter Email");
                    email=sc.nextLine();
                    System.out.println("Enter branch:");
                    branch=sc.nextLine();
                    //new Student2(name,usn,email,branch); //Parameter constructor calling
                    obj.set_Data(name,usn,email,branch);
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