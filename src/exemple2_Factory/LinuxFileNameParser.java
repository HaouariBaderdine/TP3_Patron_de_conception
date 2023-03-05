package exemple2_Factory;

public class LinuxFileNameParser implements FileNameParser {

	@Override
	public void parse(String path) {
		// TODO Auto-generated method stub
		int index = path.lastIndexOf("/");
		String ch = path.substring(index + 1);
		System.out.println("Linux path, pour : " + path + " --> " + ch);
	}

}
