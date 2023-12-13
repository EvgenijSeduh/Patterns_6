public class HomeTheaterManager {
    private StreamingDevice computer;
    private SoundSystem soundSystem;
    private Projector projector;
    private HomeTheater homeTheater;
    private int idSpeaker = 0;
    public void createHomeTheater() {
        computer = new Computer("computer1");
        soundSystem = new SoundSystem("speaker_system1");
        projector = new Projector("projector1");
        homeTheater = new HomeTheater(soundSystem, projector, computer);
    }

    public void newSpeaker(){
        AudioOutputDevice audioOutputDevice = new Speaker("speaker"+idSpeaker);
        idSpeaker++;
        soundSystem.addAudioDevice(audioOutputDevice);
        audioOutputDevice.on();
    }

    public void onAllDevice(){
        soundSystem.on();
        computer.on();
        projector.on();
    }

    public void createConnectionWithDevice(){
        homeTheater.setConnection(projector,computer);
    }

    public void playFilm(){
        soundSystem.playSound();
        computer.startStream();
        projector.playVideo();
    }
}
