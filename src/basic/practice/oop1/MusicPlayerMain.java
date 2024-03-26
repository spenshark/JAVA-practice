package basic.practice.oop1;

public class MusicPlayerMain {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();

        player.volumeUp();
        player.volumeUp();

        player.showStatus();

        player.off();
    }
}
