package exemple2_Factory;

public class WindowsFileNameParser implements FileNameParser {

	@Override
	public void parse(String path) {
		// TODO Auto-generated method stub
		int index = path.lastIndexOf("'\'");
		String ch = path.substring(index + 1);
		System.out.println("Windows path, pour : " + path + " --> " + ch);
	}

}
