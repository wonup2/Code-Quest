import java.util.*;
import java.io.*;
public class CodeQuest2016Number8 {
	
	static Scanner in;
	static int T, N;
	static music[] group;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("CodeQuest2016Number8.in"));
		init();
	}
	
	static void init() {
		T = Integer.parseInt(in.nextLine());
		for(int i = 0; i < T; i++) {
			N = Integer.parseInt(in.nextLine());
			group = new music[N];
			for(int j = 0; j < N; j++)
				group[j] = new music(in.nextLine());
			Arrays.sort(group);
			for(music temp: group)
				System.out.println(temp.toString());
		}
	}
	
	public static class music implements Comparable<music> {
		boolean hadThe = false;
		String[] start;
		String song, artist;
		
		music(String str) {
			start = str.split(" - ");
			song = start[0];
			artist = start[1];
			if(artist.substring(0, 3).equals("The") && artist.charAt(3) == ' ') {
				artist = artist.substring(4);
				hadThe = true;
			}
		}
		@Override
		public int compareTo(music next) {
			// TODO Auto-generated method stub
			if(artist.toLowerCase().compareTo(next.artist.toLowerCase()) > 0) {
				return 1;
			}else if(artist.toLowerCase().compareTo(next.artist.toLowerCase()) == 0) {
				if(song.toLowerCase().compareTo(next.song.toLowerCase()) > 0) {
					return 1;
				}
				return -1;
			}
			return -1;
		}
		
		public String toString() {
			if(hadThe)
				return song + " - The " + artist;
			return song + " - " + artist;
		}		
	}
}
