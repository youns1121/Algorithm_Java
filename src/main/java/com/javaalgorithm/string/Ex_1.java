package com.javaalgorithm.string;

import java.util.Scanner;

/**
 * 1. 문자 찾기
 * 설명
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 */
public class Ex_1 {
    public int solution(String str, char t){
        int answer=0;
        str=str.toUpperCase();//문자열 대문자 변환
        t=Character.toUpperCase(t); //문자 대문자 변환
//        System.out.println(str+" "+t);
        /*for(int i=0; i<str.length();i++){
            if(str.charAt(i)==t) answer++; 문자열의 인덱스 값이 t와 같다면 answer값을 1씩 증가
        }*/

        for (char x: str.toCharArray()){ // 문자 배열을 생성
            if(x==t) answer++; // x가 t 배열과 같으면 answer값을 1씩 추가
        }
        return answer;
    }

    public static void main(String[] args) {

        Ex_1 ex1 =new Ex_1();
        Scanner sc = new Scanner(System.in);
        String str=sc.next(); // 문자열 입력
        char c=sc.next().charAt(0); // 문자하나 입력 받기
        System.out.println(ex1.solution(str, c)); // 메서드 호출

    }
}
