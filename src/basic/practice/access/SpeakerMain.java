package basic.practice.access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

//        speaker.volume = 200;
        speaker.showVolume();


    }
}
