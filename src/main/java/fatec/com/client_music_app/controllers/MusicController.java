package fatec.com.client_music_app.controllers;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fatec.com.client_music_app.models.Music;

@RestController
@RequestMapping("/musics")
public class MusicController {

    private ArrayList<Music> musics = new ArrayList<>();

    public MusicController() {
        Music m1 = new Music(1L, "Shape of You", "Ed Sheeran", "Pop", 2017);
        Music m2 = new Music();
        m2.setId(2L);
        m2.setTitle("Bohemian Rhapsody");
        m2.setArtist("Queen");
        m2.setGenre("Rock");
        m2.setReleaseYear(1975);
        Music m3 = new Music(3L, "Blinding Lights", "The Weeknd", "Synth-pop", 2019);

        musics.add(m1);
        musics.add(m2);
        musics.add(m3);
    }

    @GetMapping("/{id}")
    public Music getMusicById(@PathVariable long id) {
        return musics
                .stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @GetMapping
    public ArrayList<Music> getMusics() {
        return musics;
    }
}