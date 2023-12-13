public class Computer implements StreamingDevice{
    private boolean power = false;
    private String name;
    private boolean stream = false;
    private Projector projector;

    public Computer(String name){
        this.name = name;
    }

    @Override
    public void on() {
        power = true;
        System.out.println("Computer " + name + " on");
    }

    @Override
    public void off() {
        power = false;
        System.out.println("The computer " + name + " the computer is turned off");
    }

    @Override
    public boolean status() {
        return stream;
    }

    @Override
    public void startStream() {
        if(power) {
            stream = true;
            System.out.println("The computer " + name + " started streaming");
        }
    }

    @Override
    public void stopStream() {
        if(power) {
            stream = false;
            System.out.println("The computer " +name+ " finish streaming");
        }
    }

    @Override
    public void connectedDevice(Projector projector) {
        this.projector = projector;
    }
}
