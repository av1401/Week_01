import java.util.*;
public class PenDivision{
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        int remainingPens = totalPens % students;
        int pensPerStudent = totalPens / students;
        System.out.printf("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
