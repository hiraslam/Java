package hello;

public class Gradeclass {
	    private String studentName;
	    private double[] marks;
	    private char[] grades;
	    private int subjectCount;
	    private final int MAX_SUBJECTS = 5;
	    
	    public Gradeclass(String studentName) {
	        this.studentName = studentName;
	        this.marks = new double[MAX_SUBJECTS];
	        this.grades = new char[MAX_SUBJECTS];
	        this.subjectCount = 0;
	    }
	    
	    // Method to add marks and calculate grade
	    public void addMarks(double mark) {
	        if (subjectCount < MAX_SUBJECTS) {
	            marks[subjectCount] = mark;
	            grades[subjectCount] = calculateGrade(mark);
	            subjectCount++;
	        } else {
	            System.out.println("Cannot add more marks. Maximum subjects reached.");
	        }
	    }
	    
	    // method to calculate grade based on marks
	    private char calculateGrade(double mark) {
	        if (mark >= 80) return 'A';
	        else if (mark >= 70) return 'B';
	        else if (mark >= 60) return 'C';
	        else if (mark >= 50) return 'D';
	        else return 'F';
	    }
	    
	    // Method to calculate average grade
	    public double calculateAverageMarks() {
	        if (subjectCount == 0) return 0.0;
	        
	        double sum = 0;
	        for (int i = 0; i < subjectCount; i++) {
	            sum += marks[i];
	        }
	        return sum / subjectCount;
	    }
	    
	    // Method to find highest grade
	    public char findHighestGrade() {
	        if (subjectCount == 0) return '-';
	        
	        char highest = 'F';
	        for (int i = 0; i < subjectCount; i++) {
	            if (grades[i] < highest) { // 'A' is less than 'F' in ASCII
	                highest = grades[i];
	            }
	        }
	        return highest;
	    }
	    
	    // Method to find lowest grade
	    public char findLowestGrade() {
	        if (subjectCount == 0) return '-';
	        
	        char lowest = 'A';
	        for (int i = 0; i < subjectCount; i++) {
	            if (grades[i] > lowest) { // 'F' is greater than 'A' in ASCII
	                lowest = grades[i];
	            }
	        }
	        return lowest;
	    }
	    
	    // Method to display grades
	    public void displayGrades() {
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Subject\tMarks\tGrade");
	        for (int i = 0; i < subjectCount; i++) {
	            System.out.println("Subject " + (i+1) + "\t" + marks[i] + "\t" + grades[i]);
	        }
	        System.out.println("Average Marks: " + calculateAverageMarks());
	        System.out.println("Highest Grade: " + findHighestGrade());
	        System.out.println("Lowest Grade: " + findLowestGrade());
	    }
	    
	    // Main method for testing
	    public static void main(String[] args) {
	        // Create an object for a student
	        Gradeclass student1 = new Gradeclass("Hira Aslam");
	        Gradeclass student2 = new Gradeclass("");
	        
	        // Add marks for 5 subjects
	        student1.addMarks(85.5);
	        student1.addMarks(92.0);
	        student1.addMarks(78.5);
	        student1.addMarks(65.0);
	        student1.addMarks(88.0);
	        
	        // Display all grades
	        student1.displayGrades();
	        
	        student2.displayGrades();
	    }
	}

