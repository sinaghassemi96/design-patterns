package org.example.state;

import lombok.Data;

@Data
public class PlayingState implements PlayerState {

    private PlayerState state;
    @Override
    public void play(Player player) {
        setState(new PlayingState());
        System.out.println(player.getName() + ": Already playing!");
    }

    @Override
    public void pause(Player player) {
        setState(new PausedState());
        System.out.println(player.getName() + ": Paused playing.");
    }

    @Override
    public void stop(Player player) {
        setState(new StoppedState());
        System.out.println(player.getName() + ": Stopped playing!");
    }
}
