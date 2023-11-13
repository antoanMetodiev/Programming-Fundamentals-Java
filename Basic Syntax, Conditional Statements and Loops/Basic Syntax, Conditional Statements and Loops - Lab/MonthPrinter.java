import java.util.Scanner;
public class MonthPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        String currentMonth = "";

        if (month == 1){
            currentMonth = "January";
        }
        else if (month == 2){
            currentMonth = "February";
        }
        else if (month == 3){
            currentMonth = "March";
        }
        else if (month == 4){
            currentMonth = "April";
        }
        else if (month == 5){
            currentMonth = "May";
        }
        else if (month == 6){
            currentMonth = "June";
        }
        else if (month == 7){
            currentMonth = "Jule";
        }
        else if (month == 8){
            currentMonth = "August";
        }
        else if (month == 9){
            currentMonth = "September";
        }
        else if (month == 10){
            currentMonth = "October";
        }
        else if (month == 11){
            currentMonth = "November";
        }
        else if (month == 12){
            currentMonth = "December";
        }
        else{
            currentMonth = "Error!";
        }
        System.out.println(currentMonth);
    }
}
