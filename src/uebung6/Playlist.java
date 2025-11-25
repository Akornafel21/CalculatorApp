package uebung6;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name kann nicht leer sein!");
        }
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        if(song == null) {
            throw new IllegalArgumentException("Song kann nicht leer sein!");
        }
        songs.add(song);
    }

    public int getTotalDuration() {
        int sum = 0;
        for(Song song : songs) {
            sum += song.getDuration();
        }
        return sum;
    }

    public boolean containsSong(Song song) {
        return songs.contains(song);
    }

    public int getTotalSongs() {
        return songs.size();
    }

    @Override
    public String toString() {
        return "Playlist: " + name + " mit " + getTotalSongs() + " Songs";
    }
}
