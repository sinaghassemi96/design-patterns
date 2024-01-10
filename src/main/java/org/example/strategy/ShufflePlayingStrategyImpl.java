package org.example.strategy;

import org.example.state.Music;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ShufflePlayingStrategyImpl implements SongPlayingStrategy {

    private Set<Music> played = new HashSet<>();
    private int nextSong;

    @Override
    public Music selectNextSong(List<Music> musics, Integer currentSong) {
        if (musics.size() == played.size()) {
            played.clear();
        }
        this.nextSong = currentSong;
        while (played.contains(musics.get(nextSong)) || nextSong == currentSong) {
            Random rand = new Random();
            nextSong = rand.nextInt(nextSong - currentSong) + currentSong;
        }
        played.add(musics.get(nextSong));
        return musics.get(nextSong);
    }
}
