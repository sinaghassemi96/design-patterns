package org.example.strategy;

import org.example.state.Music;

import java.util.List;

public interface SongPlayingStrategy {

    Music selectNextSong(List<Music> musics, Integer currentSong);

}
