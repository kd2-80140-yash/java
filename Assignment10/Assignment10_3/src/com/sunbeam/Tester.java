package com.sunbeam;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Tester {

	
		

		

			static int menu(Scanner sc) {
				int choice;

				System.out.println("*****************");
				System.out.println("0. EXIT");
				System.out.println("1. ADD");
				System.out.println("2. DELETE");
				System.out.println("3. FIND");
				System.out.println("4. SORT");
				System.out.println("5. EDIT");
				System.out.println("*****************");
				System.out.print("Enter Your Choice...");
				choice = sc.nextInt();
				System.out.println("*****************");

				return choice;
			}
  
			public static void main(String[] args) {
				
			}
			

				class Compare implements Comparator<Employee> {
					@Override
					public int compare(Employee emp1, Employee emp2) {
						int diff = Integer.compare(emp1.getEmpid(), emp2.getEmpid());
						return diff;
					}
				}

				int choice;
				Scanner sc = new Scanner(System.in);
				List<Employee> list = new LinkedList<>();

				while ((choice = menu(sc)) != 0) {
					switch (choice) {

					case 1:// Add
						Employee emp = new Employee();
						emp.accept(sc);
						list.add(emp);
						break;

					case 2: // Delete
						System.out.print("Enter the Index of the Employee you want to remove : ");
						int index = sc.nextInt();
						list.remove(index);
						break;

					case 3: // Find
						System.out.print("Enter the Emp Id of the Emp you want to find : ");
						int empid = sc.nextInt();
						Employee key = new Employee();
						key.setEmpid(empid);
						if (list.contains(key)) {
							int idx = list.indexOf(key);
							Employee emp1 = list.get(idx);
							System.out.println(emp1);
						}
						break;

					case 4: // Sort
						Compare cmp = new Compare();
						list.sort(cmp);
						System.out.println(list);
						break;
					case 5: // Edit
						System.out.print("Enter the Emp Id of the Employee you want to edit : ");
						empid = sc.nextInt();
						Employee key2 = new Employee();
						key2.setEmpid(empid);
						if (list.contains(key2)) {
							index = list.indexOf(key2);
							if (index == -1)
								System.out.println("Employee Not Found");
							else {
								System.out.println("Enter the Information Again Correctly...");
								Employee emp2 = new Employee();
								emp2.accept(sc);
								list.set(index, emp2);
							}
						}
						break;
					case 6:
						System.out.println(list);
						break;
					default:
						System.out.println("Invalid Choice... Try Again!!");
						break;
					}
				}

			}

		}