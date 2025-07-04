public class main {
    public static void main(String[] args) {
        // Multiple references to the same instance
        MediaPlayerController player1 = MediaPlayerController.getInstance();
        MediaPlayerController player2 = MediaPlayerController.getInstance();

        // Should show that they are the same object
        System.out.println(player1 == player2);  

        player1.play("Your Favorite Song");
        player2.pause(); 
        player1.resume();
        player2.stop();
    }
}
