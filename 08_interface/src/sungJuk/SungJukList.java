package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
		/*
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getNo() + "\t"
							+ arrayList.get(i).getName() + "\t"
							+ arrayList.get(i).getKor() + "\t"
							+ arrayList.get(i).getEng() + "\t"
							+ arrayList.get(i).getMath() + "\t"
							+ arrayList.get(i).getTot() + "\t"
							+ arrayList.get(i).getAvg() + "\t");
		}//for 
		*/
		
		/*2.확장형 for 문 
		for(SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO.getNo() + "\t"
							+ sungJukDTO.getName() + "\t"
							+ sungJukDTO.getKor() + "\t"
							+ sungJukDTO.getEng() + "\t"
							+ sungJukDTO.getMath() + "\t"
							+ sungJukDTO.getTot() + "\t"
							+ sungJukDTO.getAvg() + "\t");
		}//for
		*/
		
		// 3. 선호 
		for(SungJukDTO sungJukDTO : arrayList) {
//			System.out.println(sungJukDTO.toString());	//클@16진수 toString() 생략 가능 
			System.out.println(sungJukDTO); 
		}
	}

}
