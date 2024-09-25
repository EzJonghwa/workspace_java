package ch08_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Class Name	: CollectionMap
 * Author		: 202-2
 * Created Date : 2024. 8. 12.
 * Version		: 1.0
 * Purpose		: Collection
 * Description	: Map
 */
public class CollectionMap {
	public static void main(String[] args) {
	// key 와 value 한쌍인 데이터를 저장
		HashMap<String, String> stuMap = new HashMap<>();
		// 제네릭의 첫번째는 key 의 타입 두번째는 value 의 타입
		stuMap.put("첫째", "길동");
		stuMap.put("둘째", "동길");
		stuMap.put("셋째", "길순");
		stuMap.put("넷째", "길길");

		System.out.println(stuMap.get("둘째"));  //key로 value 가져오기
		stuMap.put("둘째", "동수");				// 동일 key면 수정이됨 key 는 유니크함
		System.out.println(stuMap.size());		// 순서는 보정되지 않지만 사이즈는 가져올 수았음.
		System.out.println(stuMap.containsKey("첫째"));	//key 에서 같은게 있으면 true 아니면 false
		System.out.println(stuMap.containsValue("길동"));	// value  에서 같은게 있으면 true 아니면 false
		stuMap.remove("둘째"); //key 로 삭제
		
		// map 은 Keyset으로 for 문 사용
		Set<String> keys = stuMap.keySet();	// key 정보를 반환
		for (String key : keys) {
			 
			System.out.println(key+":"+stuMap.get(key));	// 둘째는 remove 했기에 출력 x
		}	
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 79805524);
		coinMap.put("이더리움", 368439);
		for(String coin : coinMap.keySet()) {
			System.out.println(coin + ":"+ coinMap.get(coin));
		}
		
		// set은 중복을 허용하지 않음 
		HashSet<String> singer = new HashSet<>();
		singer.add("임영웅");
		singer.add("임영웅");
		singer.add("아이유");
		System.out.println(singer); // 중복 제거 후 [임영웅, 아이유]
		
		//for문
		for (String nm : singer) {
			System.out.println(nm);
		}
		
	}
}
