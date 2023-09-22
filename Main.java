package twenty;

public class Main {

    //Question 1
    public static int getLastIndex(String[] names) {
        return  names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
       return names[names.length -2];
    }

    // Question 6.
    public static int getSum(int[] ints) {

        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum =  sum + ints[i];
        }
        return sum;
    }

    //Question 7.
    public static int getAverage(int[] ints) {
    int summ = 0;
    for (int i = 0; i < ints.length; i++) {
        summ = summ + ints[i];
    }
    int average;
        average = summ/ ints.length;
        return average;
    }

    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {

        String stringBuilder = " ";
        for (int i = 0; i < numbers.length; i++) {
        if ( numbers[i] % 2==1){
            stringBuilder += numbers[i];
        }
        }
        return stringBuilder;
   }

   //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String stringBuilderr = " ";
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                stringBuilderr += numbers[i];
            }
        }
      return stringBuilderr;
    }

    // Question 10
    public static boolean contains(String[] names, String element) {
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        for (int i=0; i < names.length; i++){
            if (names[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //Question 12
    public static void printOddNumbersInRange(int start, int end){
        for (int i = start; i < end; i++) {
            if (i % 2!=0) {
                System.out.println(i);
            }
        }
    }

    //Question 13.
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String string = " ";
        for (int i = 0; i < n; i++){
            string += str + ", ";
        }
        return string;
    }

    //Question 14.
    public static String repeatFirstThreeLetters(String str, int n) {
        String subString = " ";
        for ( int i = 0; i < n; i++) {
            subString += str.substring(0, 3)+ ", ";
        }
        return subString;
    }

    //Question 15.
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str){
        String string = "Y e s";
        string.split(" ");
        return  0;

        //YES
        // Y E S

    }






    public static void main(String[] args) {
        String[] name = {"Freya", "Elijah", "KOL", "Klaus", "Finn", "Andy", "Richard"};
        //Question 1.
        System.out.println(getLastIndex(name));

        //Question 2.
        System.out.println(getSecondToLastIndex(name));

        //Question 3.
        System.out.println(getFirstElement(name));

        //Question 4.
            System.out.println(getLastElement(name));

            //Question 5.
        System.out.println(getSecondToLastElement(name));

       int [] numbers = {1, 2, 3, 4, 5, 6};

//        //Question 6.
        System.out.println(getSum(numbers));
//
//        //Question 7.
        System.out.println(getAverage(numbers));

       // Questions 8.
        System.out.println(extractAllOddNumbers(numbers));

        //Question 9.
        System.out.println(extractAllEvenNumbers(numbers));

        //Question 10.
        System.out.println(contains(name, "Naiya"));

        //Question 11.
        System.out.println(getIndexByElement(name, "KOL"));

        //Question 12.
        printOddNumbersInRange(1, 9);

        //Question 13.
        System.out.println(printGivenStringTimesNumberGiven("dog", 2));

        //Question 14.
        System.out.println(repeatFirstThreeLetters("Hybrid", 4));


        //Question 15.
        String string = "Y e s";
        String[] newstring =string.split(" ");
        System.out.println(string.length());
        System.out.println(newstring.length);



        

    }
}
