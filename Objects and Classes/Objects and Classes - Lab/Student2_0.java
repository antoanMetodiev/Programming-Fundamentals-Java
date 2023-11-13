import java.util.*;
public class Student2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentsCollector = new ArrayList<>();
        int counter = 0;
        while (!input.equals("end")){
            String[] data = input.split(" ");
            String fullName = data[0] + " " + data[1];
            int year = Integer.parseInt(data[2]);
            String town = data[3];

            Student student = new Student(fullName, year, town);
            counter++;
            boolean isEqual = false;
            if (counter > 1){

                for (Student currentStudent : studentsCollector) {
                    if (currentStudent.getFullName().equals(fullName)){

                        int index = studentsCollector.indexOf(currentStudent);
                        studentsCollector.get(index).setTown(town);
                        studentsCollector.get(index).setYear(year);
                        isEqual = true;
                    }
                }
                if (!isEqual){
                    studentsCollector.add(student);
                }
            }else if (counter == 1){
                studentsCollector.add(student);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student student : studentsCollector) {
            if (student.getTown().equals(city)){
                System.out.printf("%s is %d years old\n", student.getFullName(), student.getYear());
            }
        }
    }

    public static class Student{

        private String fullName;
        private int year;
        private String town;

        public Student(String fullName, int year, String town){
            this.fullName = fullName;
            this.year = year;
            this.town = town;
        }

        public String getFullName() {
            return fullName;
        }

        public int getYear() {
            return year;
        }

        public String getTown() {
            return town;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }
}
