import java.util.Scanner;
public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        ArcticlesC arcticlesC = new ArcticlesC(input[0], input[1], input[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(": ");
            if (data[0].equals("Edit")) {
                arcticlesC.editContent(data[1]);
            } else if (data[0].equals("ChangeAuthor")) {
                arcticlesC.changeAuthor(data[1]);
            } else if (data[0].equals("Rename")) {
                arcticlesC.renameTitle(data[1]);
            }
        }
        arcticlesC.ToString();
    }

    public static class ArcticlesC {
        private String title;
        private String content;
        private String author;

        public ArcticlesC(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author){
            this.author = author;
        }

        public void renameTitle(String title){
              this.title = title;
        }

        public void ToString(){
            System.out.printf("%s - %s: %s", title, content, author);
        }
    }
}
