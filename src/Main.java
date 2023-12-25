public class Main {
    public static void main(String[] args) {
        Client client = new AdapterTheaterToClient();
//------------------------------1
        client.onTheater();
        client.watchFilm();
        client.offFilm();
        System.out.println("====================================");
        client.onTheater();
        client.offTheater();
        System.out.println("====================================");
        client.watchFilm();
    }
}