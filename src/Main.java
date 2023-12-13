public class Main {
    public static void main(String[] args) {
        StreamingDevice computer = new Computer("computer1");
        SoundSystem soundSystem = new SoundSystem("speaker_system1");
        AudioOutputDevice audioOutputDevice1 = new Speaker("speaker1");
        AudioOutputDevice audioOutputDevice2 = new Speaker("speaker2");
        soundSystem.addAudioDevice(audioOutputDevice1);
        soundSystem.addAudioDevice(audioOutputDevice2);
        Projector projector = new Projector("projector1");
        HomeTheater homeTheater = new HomeTheater(soundSystem, projector, computer);

        soundSystem.on();
        computer.on();
        projector.on();

        computer.startStream();
        homeTheater.setConnection(projector,computer);
        projector.playVideo();
        soundSystem.playSound();
    }
}