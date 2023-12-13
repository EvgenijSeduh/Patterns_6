public class Speaker implements AudioOutputDevice {
    private String name;
    private boolean power = false;
    private boolean sound = false;

    public Speaker(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        power = true;
        System.out.println("Speaker " + name + " on");
    }

    @Override
    public void off() {
        power = false;
        System.out.println("Speaker " + name + " off");
    }

    @Override
    public void playSound() {
        if(power){
            System.out.println("Speaker " + name + " makes sounds");
            sound = true;
        }else{
            System.out.println("The speaker " + name + " doesn't have enough power");
        }
    }

    @Override
    public void stopSound() {
        if(sound) {
            sound = false;
            System.out.println("Speaker " + name + " doesn't makes sounds");
        }
    }
}
