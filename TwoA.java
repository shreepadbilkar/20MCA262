package com.shreepad;

import java.util.Scanner;

interface Student_Op //Staff_Op interface for Student class
{
    void calculateFee(); //by default all member function are in interface public and abstract
}
interface Staff_Op //Staff_Op interface for Staff class
{
    void calculateSalary(); //by default all member function are in interface public and abstract
}
class Person
{
    //Data Member
    private String name;
    private String email;
    private String address;
    private String phno;

    public Person() { // default constructor
    }

    public Person(String name, String email, String address, String phno)// Parameter constructor
    {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phno = phno;
    }

    //Member Function for display data
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Email="+email);
        System.out.println("Address="+address);
        System.out.println("Ph No="+phno);
    }
}

class Student extends Person implements Student_Op
{
    // data member
    private Double total_fee;
    private String usn;
    private String branch;
    private Double fee;


    public Student() { // default Constructor
    }

   // Parameter constructor
    public Student(String name, String email, String address, String phno, String usn,Double fee, String branch) {
        super(name, email, address, phno);
        this.usn = usn;
        this.branch = branch;
        this.fee=fee;
    }

    @Override
    public void calculateFee() {
        Double ad_fee = 3000.0;
        Double tution_fees = 5000.0;
        Double sports_fee = 10000.0;
        total_fee = ad_fee + tution_fees + sports_fee+fee;

    }
    @Override
    public void display() {
        super.display();
        System.out.println("USN="+usn);
        System.out.println("Branch="+branch);
        System.out.println("Fee="+fee);
        System.out.println("Total Fee="+total_fee);
    }
}
class Staff extends Person implements Staff_Op
{
    private String company;
    private String designation;
    private Double salary;
    private Double total_salary;

    public Staff() {
    }

    public Staff(String name, String email, String address, String phno, String company,Double salary,String designation) {
        super(name, email, address, phno);
        this.company = company;
        this.salary=salary;
        this.designation=designation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Company="+company);
        System.out.println("Designation="+designation);
        System.out.println("Salary="+salary);
        System.out.println("Total Salary="+total_salary);
    }

    @Override
    public void calculateSalary() {
        Double TA=500.0;
        Double DA=450.0;
        Double HRA=250.0;
        total_salary=salary+TA+DA+HRA;


    }
}

public class TwoA
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("1.Enter Student Details");
            System.out.println("2.Enter Staff Details");
            System.out.println("3.exit");

            System.out.println("Enter your choice=");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("_______________________Enter Student Details Operation_____________________________");
                    System.out.println("Enter Name=");sc.nextLine();
                    String s_name=sc.nextLine();
                    System.out.println("Enter USN=");
                    String s_usn=sc.nextLine();
                    System.out.println("Enter Email=");
                    String s_email=sc.nextLine();
                    System.out.println("Enter Address=");
                    String s_address=sc.nextLine();
                    System.out.println("Enter Phone Number=");
                    String s_ph_no=sc.nextLine();
                    System.out.println("Enter Branch=");
                    String s_branch=sc.nextLine();
                    System.out.println("Enter Fee=");
                    Double s_fee=sc.nextDouble();

                    Student student=new Student(s_name,s_email,s_address,s_ph_no,s_usn,s_fee,s_branch);

                    student.calculateFee();

                    System.out.println("________________________Display Student Details Operation______________________________________");
                    student.display();
                    break;
                case 2:
                    System.out.println("_______________________Enter Staff Details Operation_____________________________");

                    System.out.println("Enter Name=");sc.nextLine();
                    String e_name=sc.nextLine();
                    System.out.println("Enter Employee Id=");
                    String emid=sc.nextLine();
                    System.out.println("Enter Email=");
                    String e_email=sc.nextLine();
                    System.out.println("Enter Address=");
                    String e_address=sc.nextLine();
                    System.out.println("Enter Phone Number=");
                    String e_ph_no=sc.nextLine();
                    System.out.println("Enter Company Name=");
                    String e_company_name=sc.nextLine();
                    System.out.println("Enter Designation=");
                    String designation=sc.nextLine();
                    System.out.println("Enter Salary=");
                    Double e_salary=sc.nextDouble();
                    Staff staff=new Staff(e_name,e_email,e_address,e_ph_no,e_company_name,e_salary,designation);

                    staff.calculateSalary();

                    System.out.println("________________________Display Staff Details Operation______________________________________");
                    staff.display();

                    break;
                case 3:
                    System.exit(0);break;
                default:
                    System.out.println("Invalid input please try again !!");

            }
        }
    }
}
