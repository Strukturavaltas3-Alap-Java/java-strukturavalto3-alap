package week16.day01.exam.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SongService {

    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return new ArrayList<>(songs);
    }

    public Optional<Song> shortestSong() {
        return songs.stream()
                .min(Comparator.comparingInt(Song::getLength));
    }

    public List<Song> findSongByTitle(String title) {
        return songs.stream()
                .filter(song -> song.getTitle().equals(title))
                .toList();
    }

    public boolean isPerformerInSong(Song song, String performer) {
        return songs.stream()
                .filter(s -> s.equals(song))
                .anyMatch(s -> s.getPerformers().contains(performer));
    }

    public List<String> titlesBeforeDate(LocalDate date) {
        return songs.stream()
                .filter(song -> song.getRelease().isBefore(date)) // Stream<Song>
                .map(Song::getTitle) // Stream<String>
                .collect(Collectors.toList());
//                .toList();
    }

    /*
    Add vissza a legrövidebb dalt, `Optional`-ként!
*  Add vissza dalok listáját cím alapján! (Két dalnak lehet ugyanaz a címe)
*  Lehessen lekérdezni, hogy egy előadó szerepel-e egy konkrét dal előadóinak listájában!
* Gyűjtsd ki az összes dal címét, ami egy paraméterül átadott dátum előtt jelent meg!
     */
}
