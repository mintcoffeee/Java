package member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Member {
	public void execute(List<MemberDTO> list) throws IOException, ClassNotFoundException;
}
