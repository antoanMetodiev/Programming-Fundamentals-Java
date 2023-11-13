import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songCollector = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");
            String typeList = data[0];
            String songName = data[1];
            String time = data[2];
            Song currentSong = new Song(typeList, songName, time);
            songCollector.add(currentSong);
        }

        String favouriteTypeList = scanner.nextLine();
        for (Song song : songCollector) {
            if (song.getTypeList().equals(favouriteTypeList) || favouriteTypeList.equals("all")){
                System.out.println(song.getSongName());
            }
        }
    }

    public static class Song{
        String typeList;
        String songName;
        String time;

        public Song(String typeList, String name, String time){
            this.typeList = typeList;
            this.songName = name;
            this.time = time;
        }

        public String getTypeList(){
            return this.typeList;
        }

        public String getSongName(){
            return this.songName;
        }

        public String getTime(){
            return this.time;
        }
    }
}
