public class MediaPlayerController {

    private static MediaPlayerController instance;

    // Internal state for demo
    private boolean isPlaying = false;
    private String currentTrack = null;

    //Private constructor so it can't be instantiated externally
    private MediaPlayerController() {}

    // Public method to access the instance
    public static synchronized MediaPlayerController getInstance() {
        if (instance == null) {
            instance = new MediaPlayerController();
        }
        return instance;
    }

    // Playback actions
    public void play(String track) {
        this.currentTrack = track;
        this.isPlaying = true;
        System.out.println("Playing: " + track);
    }

    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Paused: " + currentTrack);
        }
    }

    public void resume() {
        if (!isPlaying && currentTrack != null) {
            isPlaying = true;
            System.out.println("Resumed: " + currentTrack);
        }
    }

    public void stop() {
        if (currentTrack != null) {
            System.out.println("Stopped: " + currentTrack);
            currentTrack = null;
            isPlaying = false;
        }
    }
}
