package member;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MemberNameAsc implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
//		Collections.sort(list, new NameComparator());
//		new MemberPrint().execute(list);
		
		// 수업시간에 한 풀이
		Collections.sort(list);
		new MemberPrint().execute(list);
	}
}

//내 풀
class NameComparator implements Comparator<MemberDTO>{

	@Override
	public int compare(MemberDTO dto1, MemberDTO dto2) {
		return dto1.getName().compareTo(dto2.getName());
	}

}