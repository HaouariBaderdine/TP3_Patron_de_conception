package exemple2_Factory;

public class WindowsCountFolders implements CountFolders {

	@Override
	public void countFolders(String path) {
		// TODO Auto-generated method stub
		int index = path.indexOf("'\'");
		int count = 0;
		while (index != -1) {
			count++;
			index = path.indexOf("'\'", index + 1);
		}
		System.out.println("Le nombre de dossier (Windows) : " + count);
	}

}
