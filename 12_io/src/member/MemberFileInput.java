package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class MemberFileInput implements Member {

	@Override
	public void execute(List<MemberDTO> list) throws IOException, ClassNotFoundException{
	    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"));
	    list.clear();	//리스트의값 제거 
	    try {
	        while (true) {
	            MemberDTO dto = (MemberDTO) ois.readObject();
	            list.add(dto);
	        }
	    } catch (EOFException e) {
	        // End of file reached, do nothing
	    	
	    	// 연쇄반응으로 다른 class 의 override 함수를 수정 하지 않기 위해서 try catch 사용을 하는 것이 좋다.
//	    } catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
	    	
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



