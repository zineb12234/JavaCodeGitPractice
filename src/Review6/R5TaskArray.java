package Review6;

public class R5TaskArray {
    public static void main(String[] args) {
        String[][] countries ={
                {"Canada","USA"},
                {"Ecuador","Brazil","Chile","Argentina"},
                {"France","Romania","Italy"},
        };
        System.out.println(countries.length);// number of 1d arrays
        for (String[] countryArray:countries) { // outer loop iterate over 1D array
            for (String country:countryArray) { // inner loop iterates over 1D arrays
            System.out.println(country); // inner loop iterates over each element inside that 1D arrays
        }
    }
}}