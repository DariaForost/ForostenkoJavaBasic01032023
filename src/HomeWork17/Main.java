package HomeWork17;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] bands = new MusicStyles[]{new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}
