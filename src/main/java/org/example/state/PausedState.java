package org.example.state;

import lombok.Data;

@Data
public class PausedState implements PlayerState {

    private PlayerState state;
    @Override
    public void play(Player player) {
        setState(new PlayingState());
        System.out.println(player.getName() + ": Now playing...");
    }

    @Override
    public void pause(Player player) {
        setState(new PausedState());
        System.out.println(player.getName() + ": Already paused!");
    }

    @Override
    public void stop(Player player) {
        setState(new StoppedState());
        System.out.println(player.getName() + ": Stopped playing.");
    }
}
