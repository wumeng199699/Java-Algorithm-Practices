package Song;

import java.util.HashSet;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public Song getNextSong(){
        return nextSong;
    }

    public boolean isRepeatingPlaylist() {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        HashSet<Song> set = new HashSet<Song>();
        Song song = this;
        while (song != null){
            if (set.contains(song)) return true;
            set.add(song);
            song = song.getNextSong();
        }
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
