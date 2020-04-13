import java.io.IOException;
import java.util.Scanner;

public class game {
	
	private int Mapa[][];
	private  int Jogador;
	private int i;
	private int j;
	private static String movimento;
	public game() {
		Mapa = new int [5][5];
		Jogador=1;
		this.Mapa[0][0]= Jogador;
		i=0;
		j=0;
	}
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	public void getMapa1() {
		for ( int i =0; i<Mapa.length; i++) {
			for (int j=0; j<Mapa.length; j++) {
				System.out.print(Mapa[i][j]+" ");
				Mapa[getI()][getJ()]= 1;
			}
			System.out.println();
		}
	}
	
	public void getMapa() {
		for ( int i =0; i<Mapa.length; i++) {
			for (int j=0; j<Mapa.length; j++) {
				System.out.print(Mapa[i][j]+" ");
			}
			System.out.println();
		}
	 
}
	public void andar(String Andar) {
		Mapa[getI()][getJ()] = 0;
		if (Andar.equals("s")) {
			if (i!=4) {
				setI(i+1);
			}
		}
		else
		if (Andar.equals("w")) {
			if(i!=0) {
				setI(i-1);
			}
		}
		else
		if (Andar.equals("d")) {
			if (j!=4) {
				setJ(j+1);
			}
		}
		else
		if (Andar.equals("a")) {
			if (j!=0) {
				setJ(j-1);
			}
		}
		else {
			System.out.println("Comando inválido!!");
		}
		Mapa[getI()][getJ()]= 1;
		getMapa();
	}	
	public static void main(String...arg) throws IOException, InterruptedException  {
		boolean x = true;
		Scanner in = new Scanner(System.in);
		game g = new game();
		//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		g.getMapa1();
		
		while(x==true) {
			movimento= in.next();
			//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			g.andar(movimento);
		}
	}
}