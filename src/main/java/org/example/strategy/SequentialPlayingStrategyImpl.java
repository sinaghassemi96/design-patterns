package org.example.strategy;

import org.example.state.Music;

import java.util.List;

public class SequentialPlayingStrategyImpl implements SongPlayingStrategy {

    private int nextSong;
    @Override
    public Music selectNextSong(List<Music> musics, Integer currentSong) {
        if (currentSong == null) {
            currentSong = 0;
        }
        this.nextSong = (currentSong + 1) % musics.size();
        return musics.get(nextSong);
    }
}
