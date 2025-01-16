//  Jocelin Martinez-Reyes
//  1/16/25 Exercise01
//  Q1: When computing the average high temperature, was the value stored as an integer value or a floating-point value?
// ANSWER: I stored it as an integer
//  Q2: What happens to the computed average with either data type?
// ANSWER: Using either integer or double value it will work just fine

public class Main {
    public static void main(String[] args) {
        // 'sout' then hit tab

        String city = "City: Columbus";

        int zip = 43215;

        int[] temps = {32, 25, 27, 40, 45};
        float avg, sum = 0;
        int length = temps.length;
        for (int temp : temps) {
            sum += temp;
        }
        avg = sum / length;

        System.out.println("City: Columbus " + "Zip Code: " + zip + " Average High Temperature " + avg);
    }
}