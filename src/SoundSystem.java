import java.util.ArrayList;

public class SoundSystem {
    private ArrayList<AudioOutputDevice>audioOutputDevices;
    private String name;

    public SoundSystem(String name){
        this.name = name;
        audioOutputDevices = new ArrayList<>();
    }

    public void addAudioDevice(AudioOutputDevice audioOutputDevice){
        audioOutputDevices.add(audioOutputDevice);
    };

    public void off(){
        if(!audioOutputDevices.isEmpty()){
            for(int i = 0; i<audioOutputDevices.size();i++){
                audioOutputDevices.get(i).off();
            }
            System.out.println("Sound system off");
        }else{
            System.out.println("There are no devices in the system");
        }
    }

    public void on(){
        if(!audioOutputDevices.isEmpty()){
            for(int i = 0; i<audioOutputDevices.size();i++){
                audioOutputDevices.get(i).on();
            }
            System.out.println("Sound system on");
        }else{
            System.out.println("There are no devices in the system");
        }
    }

    public void playSound(){
        if(!audioOutputDevices.isEmpty()){
            for(int i = 0; i<audioOutputDevices.size();i++){
                audioOutputDevices.get(i).playSound();
            }
        }else{
            System.out.println("There are no devices in the system");
        }
    }

    public void stopSound(){
        if(!audioOutputDevices.isEmpty()){
            for(int i = 0; i<audioOutputDevices.size();i++){
                audioOutputDevices.get(i).stopSound();
            }
        }else{
            System.out.println("There are no devices in the system");
        }
    }
}
