package org.example.state;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PlayerImpl implements Player {

    private String name;
    private List<Music> musics = new ArrayList<>();


    @Override
    public void addMusic(Music music) {
        musics.add(music);
    }

    @Override
    public void deleteMusic(Music music) {
        musics.remove(music);
    }

    public PlayerImpl(String name) {
        this.name = name;
    }
}
