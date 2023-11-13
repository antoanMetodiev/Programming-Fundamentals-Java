import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ThePianist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> songsSaver = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentSong = scanner.nextLine();
            transferEls(currentSong,songsSaver);
        }

        String action = scanner.nextLine();
        while (!action.equals("Stop")){

            String[] arr = action.split("\\|");
            String command = arr[0];
            if (command.equals("Add")){

                String song = arr[1];
                String compositor = arr[2];
                String key = arr[3];
                if (songsSaver.contains(song)){
                    System.out.printf("%s is already in the collection!\n",song);
                } else{
                    System.out.printf("%s by %s in %s added to the collection!\n",song,compositor,key);
                    songsSaver.add(song);
                    songsSaver.add(compositor);
                    songsSaver.add(key);
                    n++;
                }
            } else if (command.equals("Remove")){

                String song = arr[1];
                if (songsSaver.contains(song)){

                    int songIndex = songsSaver.indexOf(song);
                    int compositorIndex = songsSaver.indexOf(song) + 1;
                    int keyIndex = songsSaver.indexOf(song) + 2;

                    songsSaver.remove(keyIndex);
                    songsSaver.remove(compositorIndex);
                    songsSaver.remove(songIndex);
                    System.out.printf("Successfully removed %s!\n", song);
                    n--;
                } else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n",song);
                }
            } else if (command.equals("ChangeKey")){

                String song = arr[1];
                String key = arr[2];
                if (songsSaver.contains(song)){
                    int index = songsSaver.indexOf(song) + 2;
                    songsSaver.set(index,key);
                    System.out.printf("Changed the key of %s to %s!\n",song ,key);
                } else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n",song);
                }
            }
            action = scanner.nextLine();
        }
        printSongs(songsSaver,n);
    }

    private static void transferEls(String currentSong, List<String> songsSaver) {
        String[] arr = currentSong.split("\\|");
        for (int i = 0; i < arr.length; i++) {
            songsSaver.add(arr[i]);
        }
    }

    private static void printSongs(List<String> songsSaver, int n) {
        for (int i = 0; i < n; i++) {
            String song = songsSaver.get(0);
            String compositor = songsSaver.get(1);
            String key = songsSaver.get(2);
            System.out.printf("%s -> Composer: %s, Key: %s\n",song,compositor,key);

            songsSaver.remove(song);
            songsSaver.remove(compositor);
            songsSaver.remove(key);
        }
    }
}
