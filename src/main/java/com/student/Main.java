package com.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Mobile: ");
                    String mobile = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    dao.addStudent(new Student(name, marks, mobile, address, branch));
                    break;

                case 2:
                    dao.getAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    dao.getStudentById(id);
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String searchName = sc.nextLine();
                    dao.getStudentByName(searchName);
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double umarks = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Mobile: ");
                    String umobile = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String uaddress = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String ubranch = sc.nextLine();

                    dao.updateStudent(uid, uname, umarks, umobile, uaddress, ubranch);
                    break;

                case 6:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    dao.deleteStudent(did);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}