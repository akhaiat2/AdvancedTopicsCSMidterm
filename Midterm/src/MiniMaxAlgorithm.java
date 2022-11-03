
import java.util.Scanner;

public class MiniMaxAlgorithm {
	MakeMove game = new NameMove();
	public static void main(String[] args) {
		game.toString();
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (int k = 0; k <= 6; k+=3) {
			for (int i = 1+k; i <= 3+k; i++) {
				if (game[i][0] == 'X') {
					s.append("\\ /");
				} else if (game[i][0] == 'O') {
					s.append("/^\\");
				} else {
					for (int j = 1; j <= 3; j++) {
						s.append(game[i][j]);
					}
				}
				if ( i!= k+3)
					s.append(" | ");
			}
			s.append('\n');
			for (int i = 1+k; i <= 3+k; i++) {
				if (game[i][0] == 'X') {
					s.append(" x ");
				} else if (game[i][0] == 'O') {
					s.append("| |");
				} else {
					for (int j = 4; j <= 6; j++) {
						s.append(game[i][j]);
					}
				}
				if ( i!= k+3)
					s.append(" | ");
			}
			s.append('\n');
			for (int i = 1+k; i <= 3+k; i++) {
				if (game[i][0] == 'X') {
					s.append("/ \\");
				} else if (game[i][0] == 'O') {
					s.append("\\_/");
				} else {
					for (int j = 7; j <= 9; j++) {
						s.append(game[i][j]);
					}
				}
				if ( i!= k+3)
					s.append(" | ");
			}
			s.append('\n');
			if (k != 6)
				s.append("---------------");
			s.append('\n');
		}

		return s.toString();

	}
  }

