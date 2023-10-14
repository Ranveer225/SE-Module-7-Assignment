/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {                
// Fix constructor for Student class

		Student std1= new Student("James", 20, 12); // name, age, credits

                Student std2 = new Student("John", 27, 86);
// Verify that senior class has minimum of 85 credits
		System.out.println("gpa of student 1:");
		// Set gpa of student 1
		System.out.println(std1.toString());

		System.out.println("gpa of student 2:");
			// Set gpa of student 2


				// add toString method for Freshman Senior and Student class
				System.out.println(std2.toString());
// Output of gpa using scanner and user input
	}

}

// ToDo 5: Fix the error

// ToDo 6: Fix the constructor of the Student class

// Todo 7: Create two classes for Freshman and Senior

// ToDo 8: The senior class should have a minimum of 85 credits

// ToDo 9: Add a toString method for the Student class
// ToDo 10: Add a toString method for the Freshman class
// ToDo 11: Add a toString method for the Senior class
// ToDo 12: Set the gpa of the student using the scanner and user
// 			input and then print the output.
// ToDo 13: add comments and explain your code
// ToDo 14: submit using a pull request.