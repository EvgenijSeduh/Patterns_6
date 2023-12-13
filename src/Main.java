public class Main {
    public static void main(String[] args) {
        HomeTheaterManager homeTheaterManager = new HomeTheaterManager();

        homeTheaterManager.createHomeTheater();
        homeTheaterManager.newSpeaker();
        homeTheaterManager.onAllDevice();
        homeTheaterManager.createConnectionWithDevice();
        homeTheaterManager.playFilm();
    }
}