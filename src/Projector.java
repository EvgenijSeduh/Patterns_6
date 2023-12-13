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
        if(streamingDevice.status()){
            connection = true;
        }
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
        if (power)
            if (connection) {
                streaming = true;
                System.out.println("Projector " + name + " broadcasts video");
            }
            else System.out.println("No connection");
        else
            System.out.println("The projector " + name + " doesn't have enough power");

    }

    public void stopVideo() {
        if (power)
            if (connection) {
                streaming = false;
                System.out.println("The projector " + name + " has stopped streaming the video");
            }
            else System.out.println("No connection");
    }

    public void connectedNewDevice(){

    }
}
