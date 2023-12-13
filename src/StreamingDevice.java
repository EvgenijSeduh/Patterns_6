public interface StreamingDevice {
    public void on();
    public void off();
    public boolean status();
    public void startStream();
    public void stopStream();
    public void connectedDevice(Projector projector);
}
