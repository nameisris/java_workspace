
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("abcdefg");
		
		// 크기 출력
		System.out.println(sb.capacity());
		// 실제 값의 길이 출력
		System.out.println(sb.length());
		
		// 특정 인덱스의 값을 변경
		sb.insert(1, 'p');
		System.out.println(sb);
		System.out.println(sb.length());
		
		// 2번째 인덱스부터 5번째 바로 이전의 인덱스까지 삭제
		sb.delete(2,  5);
		System.out.println(sb.length());
		System.out.println(sb);
		
		// 0번째부터 1번째(2번째 직전)까지 변경
		sb.replace(0, 2, "ta");
		System.out.println(sb);

		// 역 정렬
		sb.reverse();
		System.out.println(sb);

		// 특정 인덱스에 값 세팅
		sb.setCharAt(2, 'E');
		System.out.println(sb);
		System.out.println(sb.length());
		
		// 크기 지정
		sb.setLength(200);
		// sb 뒤의 200까지 공백으로 채워짐
		String sb2 = sb.toString().trim();
		System.out.println(sb2);
	}

}
