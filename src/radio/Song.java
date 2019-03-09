package radio;

public class Song {
	public void playMusic(int a) {
		System.out.print("Play!");
		
		}
		private static int playMusic() {
		System.out.print("Music!");
		return 2;
		}
		public static void main(String[] tracks) {
		new Song().playMusic();
		
		System.out.println(new Song().playMusic());
		}

}
