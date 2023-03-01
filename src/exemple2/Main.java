package exemple2;

public class Main {

	public static void parse_filename(String path) {
		// index est l'endroit où se situe, dans la String path, ladernière
		// apparition du caractère \
		int index = path.lastIndexOf("\\");
		// On construit une String qui ne contient que la partie situéeà droite
		// du dernier caractère \
		String r = path.substring(index + 1);
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1)
		parse_filename("C:\\\\Windows\\\\hello.dll");
		// on obtient comme resultat : hello.dll

	}

}
