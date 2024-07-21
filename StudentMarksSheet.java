import java.util.Scanner;

class RangeException extends Exception{
    public RangeException(String msg){
            super(msg);
    }
}

public class StudentMarksSheet {
    private String stdName;
    private int [] marks;
    private int totalmarks;
    private double percentage;

    public StudentMarksSheet(String stdName,int [] marks)throws RangeException{
        this.stdName=stdName;
        this.marks=new int[6];
        for(int i=0;i<6;i++){
            if(marks[i]<0||marks[i]>50){
                throw new RangeException("enter in between 50 and 0");
            } 
            this.marks[i]=marks[i];       
        }
        calculatetotalper(marks);
    }
    private void calculatetotalper(int []marks){
        for(int mark:marks){
            totalmarks+=mark;
        }
        percentage=(totalmarks/300.0)*100;
    }
    public void printMarkSheet() {
        System.out.println("Student Name: " + stdName);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage: " + percentage + "%");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        try {
            StudentMarksSheet markSheet = new StudentMarksSheet(name, marks);
            markSheet.printMarkSheet();
        } catch (RangeException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

}
