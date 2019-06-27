package songsSelection;

public class SongsSelection {

	int songs[] = {10, 20, 30, 40, 20, 40};
	int total_count = 0;
	
	public int selectSongs() {
		
		for (int i = 0; i < songs.length; i++) {
			for (int j = i+1; j < songs.length; j++) {
				if(songs[i]+songs[j] == 60) {
//					System.out.printf("i and j are %s %s \n", songs[i], songs[j]);
					total_count += 1;
				}
			}
			
		}
//		System.out.println(total_count);
		return total_count;
	}
	
	public static void main(String[] args) {
		SongsSelection s = new SongsSelection();
		System.out.println("total count is " + s.selectSongs());
	}
}
