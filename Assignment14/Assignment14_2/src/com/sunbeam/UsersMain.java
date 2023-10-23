package com.sunbeam;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UsersMain {

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("1. ADD USER");
        System.out.println("2. SHOW ALL USERS");
        System.out.println("3. DELETE USER BY ID");
        System.out.println("4. CHANGE USER STATUS");
        System.out.println("5. UPDATE USER INFO");
        System.out.print("Enter Your Choice : ");
        choice = sc.nextInt();
        return choice; // Add this line to return the choice.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        List<Users> list;

        while ((choice = menu()) != 0) {
            switch (choice) {
                case 1:
                    Users u = new Users();
                    u.accept();
                    try (UsersDao userdb1 = new UsersDao()) {
                        int cnt = userdb1.addUser(u);
                        System.out.println("Rows Added" + cnt);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try (UsersDao userdb1 = new UsersDao()) {
                        list = userdb1.findAll();
                        list.forEach(ele -> System.out.println(ele));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Enter user id to delete");
                    int idToDelete = sc.nextInt();
                    try (UsersDao userdb1 = new UsersDao()) {
                        int cnt = userdb1.deleteById(idToDelete);
                        System.out.println("Rows updated" + cnt);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Enter user id to change status");
                    int idToChangeStatus = sc.nextInt();
                    try (UsersDao userdb1 = new UsersDao()) {
                        int cnt = userdb1.changeStatusById(idToChangeStatus);
                        System.out.println("Rows updated" + cnt);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    Users user = new Users();
                    user.accept();
                    try (UsersDao userdb1 = new UsersDao()) {
                        int cnt = userdb1.updateUser(user);
                        System.out.println("Rows updated" + cnt);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
