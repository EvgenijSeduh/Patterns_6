public class HomeTheater {
    private SoundSystem soundSystem;
    private Projector projector;
    private StreamingDevice streamingDevice;

    public HomeTheater(SoundSystem soundSystem, Projector projector, StreamingDevice streamingDevice) {
        this.soundSystem = soundSystem;
        this.projector = projector;
        this.streamingDevice = streamingDevice;
    }

    public SoundSystem getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public Projector getProjector() {
        return projector;
    }

    public void setProjector(Projector projector) {
        this.projector = projector;
    }

    public StreamingDevice getStreamingDevice() {
        return streamingDevice;
    }

    public void setStreamingDevice(StreamingDevice streamingDevice) {
        this.streamingDevice = streamingDevice;
    }

    public void setConnection(Projector projector, StreamingDevice streamingDevice){
        projector.setConnection(streamingDevice);
        streamingDevice.connectedDevice(projector);
    }
}
