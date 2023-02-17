package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class MemberFileInput implements Member {

	@Override
	public void execute(List<MemberDTO> list) throws IOException, ClassNotFoundException {
	    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"));
	    list.clear();	//리스트의값 제거 
	    try {
	        while (true) {
	            MemberDTO dto = (MemberDTO) ois.readObject();
	            list.add(dto);
	        }
	    } catch (EOFException e) {
	        // End of file reached, do nothing
	    } finally {
	        ois.close();
	        System.out.println("파일 읽기 완료");
	    }
	    
	    //출력 
	    for (MemberDTO memberDTO : list) {
	    	System.out.println(memberDTO);
	    }
	}

}



