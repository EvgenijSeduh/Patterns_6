public class Projector {
    private String name;
    private boolean power = false;
    private boolean connection = false;
    private boolean streaming = false;
    private StreamingDevice streamingDevice;

    public Projector(String name) {
        this.name = name;
    }

    public void setConnection(StreamingDevice streamingDevice){
            connection = true;
            this.streamingDevice = streamingDevice;
    }

    public void on() {
        power = true;
        System.out.println("Projector " + name + " on");
    }

    public void off() {
        power = false;
        System.out.println("The projector " + name + " off");
    }

    public void playVideo() {
        if(streamingDevice == null){
            System.out.println(name + " not found connection device");
            return;
        }
        if (!streamingDevice.status()) {
            System.out.println(name + " no signal");
            return;
        }
        if (!power) {
            System.out.println(name + " doesn't have enough power");
            return;
        }
        if (connection) {
            streaming = true;
            System.out.println("Projector " + name + " broadcasts video");
        } else System.out.println(name + " no connection");
    }

    public void stopVideo() {
        if (power)
            if (connection) {
                streaming = false;
                System.out.println("The projector " + name + " has stopped streaming the video");
            }
            else System.out.println("No connection");
    }
}
