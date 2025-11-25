package uebung6;

public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        if(title == null || title.isBlank()) {
            throw new IllegalArgumentException("Titel kann nicht leer sein!");
        }

        if(artist == null || artist.isBlank()) {
            throw new IllegalArgumentException("Artist kann nicht leer sein!");
        }

        if(duration < 0){
            throw new IllegalArgumentException("Duration muss positiv sein!");
        }

        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + "von " + artist + " (" + duration + "Sek.)";
    }
}
