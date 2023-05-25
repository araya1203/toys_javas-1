import java.util.Scanner;

public class PollsWithoutMethod_s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 터미널 창에 "> 이름을 입력하세요" 띄우기
        System.out.println("> 이름을 입력하세요");
        // 터미널 창에 "이름)" 띄우기
        System.out.print("이름)");
        // 유저가 터미널 창에 각자 이름 입력
        String name = scanner.nextLine();
        // 건너뛰기 
        System.out.println();

        // 질문과 답변을 배열에 저장한다.
        String[][] qna = {
            {"1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
            "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?",
            "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?", 
            "4. 강의 진행 속도는 적절하였는가?"},
            {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다"}
        }; 

        for (int first = 0; first < qna.length; first = first + 1) {
            for (int second = 0; second < qna[second].length; second = second + 1) {
                System.out.print(qna[first][second] + ",");
            }
            System.out.println();
        }


    



           






















    }
}
