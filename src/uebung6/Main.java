package uebung6;

public class Main {
    public static void main(String[] args) {

        // Playlist erstellen
        Playlist playlist = new Playlist("Anna's Playlist");

        // Song erstellen
        Song s1 = new Song("Halo", "Beyoncé", 250);
        Song s2 = new Song("Shape of You", "Ed Sheeran", 240);
        Song s3 = new Song("Numb", "Linkin Park", 185);

        // Songs zu Playlist hinzufügen
        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);

        // Gesamtdauer
        System.out.println("Gesamtdauer: " + playlist.getTotalDuration() + " Sek");

        // Anzahl von Songs
        System.out.println("Anzahl von Songs: " + playlist.getTotalSongs());

        // Prüfen, ob ein bestimmter Song in der Playlist enthalten ist
        if(playlist.containsSong(s1)){
            System.out.println("Song: " + s1.getTitle() + " ist in der Playlist");
        }else{
            System.out.println("Song: " + s2.getTitle() + " ist nicht in der Playlist");
        }

        // Playlist anzeigen
        System.out.println(playlist);

    }
}
