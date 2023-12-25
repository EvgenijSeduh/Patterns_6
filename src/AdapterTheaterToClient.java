public class AdapterTheaterToClient extends HomeTheaterManager implements Client{
    @Override
    public void onTheater() {
        createHomeTheater();
        onAllDevice();
        createConnectionWithDevice();
    }

    @Override
    public void watchFilm() {
        playFilm();
    }

    @Override
    public void offTheater() {
        offAllDevice();
    }

    @Override
    public void offFilm() {
        offFilm();
    }
}
