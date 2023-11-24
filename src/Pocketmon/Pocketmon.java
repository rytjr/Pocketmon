package Pocketmon;

import java.util.*;
import java.io.*;

/*첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N이랑 내가 맞춰야 하는 문제의 개수 M이 주어져. N과 M은 1보다 크거나 같고, 
 * 100,000보다 작거나 같은 자연수인데, 자연수가 뭔지는 알지? 모르면 물어봐도 괜찮아. 나는 언제든지 질문에 답해줄 준비가 되어있어.
둘째 줄부터 N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는 포켓몬까지 한 줄에 하나씩 입력으로 들어와. 
포켓몬의 이름은 모두 영어로만 이루어져있고, 또, 음... 첫 글자만 대문자이고, 나머지 문자는 소문자로만 이루어져 있어. 
아참! 일부 포켓몬은 마지막 문자만 대문자일 수도 있어. 포켓몬 이름의 최대 길이는 20, 최소 길이는 2야. 그 다음 줄부터 총 
M개의 줄에 내가 맞춰야하는 문제가 입력으로 들어와. 문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 숫자로만 들어오면, 
포켓몬 번호에 해당하는 문자를 출력해야해. 입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, 
N보다 작거나 같고, 입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어져. 그럼 화이팅!!!*/

public class Pocketmon {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		//이번에 사용한 함수는 HashMap으로 값을 쌍으로 저장해야 하기 떄문에 사용하였다.
		HashMap<String, String> hash = new HashMap<>();
		
		//배열 생성 1번부터 시작하기 떄문에 배열의 0번을 먼저 초기화
		String[] arr = new String[num1 + 1];
		arr[0] = "";

		//Hash함수에 Put을 이용해 값을 넣어줌과 동시에 배열에도 값을 넣어준다
		//배열을 사용하는 이유는 Key값뿐만 아니라 Value값을 이용해서도 값을 찾기 때문으로 Hash 함수는 Key값을
		//로는 찾기 쉽지만 Value값을 이용해 Key값을 찾을 떄 시간이 오래걸리기 때문에 Value가 번호인 점을 이용해 KEy값을 배열을 이용해 찾는다
		for(int i = 1; i < num1 + 1; i++) {
			String s = bf.readLine();
			hash.put(s, String.valueOf(i));
			arr[i] = s;
			
		}
		
		//먼저 Key값을 비교해 존재하면 get을 이용해 Value값을 출력하고 없으면 배열의 번호를 통해 Key값을 찾음
		for(int i =0; i < num2; i++) {
			String s = bf.readLine();
			if(hash.containsKey(s)) {
				bw.write(hash.get(s) + "\n");
			} else {
				bw.write(arr[Integer.parseInt(s)] + "\n");
				
			}
			
	    }
		bw.flush();
		bw.close();
			
		
	}

}
