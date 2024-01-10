package org.example.state;

public class Main {

    public static void main(String[] args) {
        Music music1 = new Music("با من صنما", "همایون شجریان", "03:28", "2010");
        Player myPlayer = new PlayerImpl("myPlayer");
        PlayerState player = new StoppedState();

        myPlayer.addMusic(music1);
        player.play(myPlayer);
        player.pause(myPlayer);
        player.stop(myPlayer);
        player.stop(myPlayer);
        player.play(myPlayer);
    }

}
