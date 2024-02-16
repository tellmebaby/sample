package Hw01;

public class Ct {

	public static void main(String[] args) {
		
		//int level;					// 정수형 변수 level을 선
		//level = 10;					// level 변수에 값 10을 대입
		//System.out.println(level);	// level 값 출력
		
		int level = 10; // 변수 선언과 동시에 값을 대입(초기화)
		System.out.println(level);	// level 값 출력
		
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		
		//char ch1 = 'A';
		//System.out.println(ch1);			//문자 출력
		//System.out.println((int)ch1);		//문자에 해당하는 정수 값(아스키 코드 값) 출력
		
		//char ch2 = 66;						//정수 값 대
		//System.out.println(ch2);			//정수 값에 해당하는 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3);			//문자 정수 값 출력
		System.out.println((char)ch3);   	//정수 값에 해당하는 문자 출력
		
		char ch1 = '한';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66; // 문자형 변수에 음수를 넣으면 오류가 발생하므로 주석 처리함
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		
		//double dnum = 3.14;
		float fnum = 3.14F; // F : 식별자
		
		//System.out.println(dnum);
		System.out.println(fnum);
		
		double dnum = 1;
		
		for (int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
			// for문은 지정한 문장을 정해진 횟수만큼 반복해서 수행하는 반복문입니다.
			// 여기에서는 더하기를 10,000번 반복하라는 의미
			// 04장에서 자세히 배웁니다.
		}
		
		System.out.println(dnum);
		
		boolean isMarried = true ; 	//boolean 변수를 선언하고 초기화
		System.out.println(isMarried);
		
		//var i = 10;				//int i = 10으로 컴파일됨
		//var j = 10.0;			// double j = 10.0으로 컴파일됨
		//var str = "hello";		//String str = "hello"로 컴파일됨
		
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(str);
		
		// 상수 사용하기
		
		final int MAX_NUM = 100;	//선언과 동시에 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0; // 사용하기전에 초기화. 초기화하지 않으면 오류발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; // 오류발생. 상수는 값을 변겨할 수 없음
		
		// * 묵시적 형 변환
		
		byte bNum = 10;
		int iNum = bNum;		//byte형 값이 int형 변수로 대입됨
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;		//int형 값이 float형 변수로 대입됨
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		
		// p67 1분복습
		ch1 = 'A';
		System.out.println((int)ch1);		// 문자에 해당하는 정수 값 출력
		
		ch2 = 67;
		System.out.println((char)ch2);		// 정수 값에 해당하는 문자 출력
		
		// *명시적 형변환
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;	//두 실수가 각각 형 변환되어 더해
		int iNum4 = (int)(dNum1 + fNum2);		//두 실수의 합이 먼저 계산되고 형 변환됨
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		// *연산자
		// 산술 연산자를 사용하여 총점과 평균 구하기
		
		int mathScore = 90;
		int engScore = 70;
		int korScore = 85;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		
		// 증가.감소 연산자를 사용하여 값 연산하기
		
		int gameScore = 150;			// 게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore;	// gameScore에 1만큼 더한 값을 lastScore1에 대
		System.out.println(lastScore1);	// 151
		
		int lastScore2 = --gameScore;	//gameScore에서 1만큼 뺀 값을 lastScore2dp eodlq
		System.out.println(lastScore2);	//150
		
		// 단락 회로 평가 실습하기
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리 곱에서 앞 항의 결과 값이 거짓이므로 뒷 항의 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) > 10) || ((i = i + 2 ) < 10); // 논리 합에서 앞 항의 결과 값이 참이므로 뒷 항의 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// 조건 연산자를 사용하여 부모님의 나이 비교하기
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge ) ? 'T' : 'F';
		
		System.out.println(ch);
		
		// 비트 이동 연산자를 사용하여 연산하기
		
		int num = 0B00000101; //5를 8비트 2진수로 나타냄
		
		System.out.println(num << 2);	//왼쪽으로 2비트 이동 00010100 (20)
		System.out.println(num >> 2);	//오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num >>> 2);	//오른쪽으로 2비트 이동 00000001 (1)
		
		System.out.println(num); 	//num에 값을 대입하지 않았으므 비트 이동과 관계없이 기존 값 그대로 출력
		
		num = num << 2;
		System.out.println(num);
		
		// 나이에 따라 다른 문장 출력하기
		
		int age = 7;
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		age = 34;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age < 20) {
			charge = 3000;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는"+charge+"원입니다.");

		// switch-case문 예제
		
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
				break;
			case 2 : medalColor = 'S';
			break;
			case 3 : medalColor = 'B';
			break;
			default : 
						medalColor = 'A';
			break;
		}
		
		System.out.println(ranking + "등 매달의 색깔은" + medalColor + "입니다.");
		
		// switch-case문 예제 (2)
		
		String medal = "Gold";
		
		switch (medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		// 1부터 10까지 더하기
		
		num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;
		
		System.out.println("1부터 10까지의 합은" + num + "입니다.");
		
		// while문 활용하여 1부터 10까지 더하기
		
		num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		
		// do-while문 예제
		
		num = 1;
		sum =0;
		
		do {
			sum += num;
			num ++;
		} while (num <= 10);
				
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		
		// for문 예제
		
		for (int j = 0; j < args.length; j++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		
		// 중첩된 반복문
		
		int dan;
		int times;
		for (dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
		
		// continue문 예제
		
		int total = 0;
		
		for (num = 1; num <= 100; num ++) {
			if(num %2 == 0)
				continue;
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은:" + total + "입니다.");
		
		// break문
		
		sum = 0;
		num = 0;
		
		for (num = 0;  ; num++) { // 합한 값이 100보다 작을 때 종료 // 조건식을 생략하는 대신 break문을 사용합니다.
			sum += num;
			if(sum >= 100)			//sum이 100보다 크거나 같을 때 (종료 조
				break;				//반복문 중단
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}


}











