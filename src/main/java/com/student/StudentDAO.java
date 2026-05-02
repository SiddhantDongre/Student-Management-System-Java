package com.student;

import java.sql.*;

public class StudentDAO {

    // CREATE
    public void addStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO students(name, marks, mobile, address, branch) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, s.getName());
            ps.setDouble(2, s.getMarks());
            ps.setString(3, s.getMobile());
            ps.setString(4, s.getAddress());
            ps.setString(5, s.getBranch());

            ps.executeUpdate();
            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ ALL
    public void getAllStudents() {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getDouble("marks") + " | " +
                    rs.getString("mobile") + " | " +
                    rs.getString("address") + " | " +
                    rs.getString("branch")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SEARCH BY ID
    public void getStudentById(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getDouble("marks") + " | " +
                    rs.getString("mobile") + " | " +
                    rs.getString("address") + " | " +
                    rs.getString("branch")
                );
            } else {
                System.out.println("Student Not Found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SEARCH BY NAME
    public void getStudentByName(String name) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM students WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getDouble("marks") + " | " +
                    rs.getString("mobile") + " | " +
                    rs.getString("address") + " | " +
                    rs.getString("branch")
                );
            }

            if (!found) {
                System.out.println("No matching students found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateStudent(int id, String name, double marks, String mobile, String address, String branch) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "UPDATE students SET name=?, marks=?, mobile=?, address=?, branch=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setDouble(2, marks);
            ps.setString(3, mobile);
            ps.setString(4, address);
            ps.setString(5, branch);
            ps.setInt(6, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Updated!");
            else
                System.out.println("Student Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Deleted!");
            else
                System.out.println("Student Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}