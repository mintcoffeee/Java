package member;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MemberFileOutput implements Member {

	@Override
	public void execute(List<MemberDTO> list) throws IOException {
		//throws 하면 연쇄반응으로 인해 많은 클래스를수정해주어야 한다.
		//try catch 사용!!
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"));
			for(MemberDTO memberDTO : list) {
				oos.writeObject(memberDTO);
			}
			oos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
