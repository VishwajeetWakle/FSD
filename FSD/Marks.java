// Java program to assign grades to a student
// using nested if-else
 
class Marks {
    public static void main(String args[])
    {
 
        // Store marks of all the subjects in an array
        int marks[] = { 25, 65, 46, 98, 78, 65 };
 
        // Max marks will be 100 * number of subjects
        int max_marks = marks.length * 100;
 
        // Initialize student's total marks to 0
        int total = 0;
 
        // Initialize student's grade marks to F
        char grade = 'F';
 
        // Traverse though the marks array to find the sum.
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
 
        // Calculate the percentage.
        // Since all the marks are integer,
        // typecast the calculation to double.
        double percentage
            = ((double)(total) / max_marks) * 100;
	System.out.println(percentage);
 
  }
}