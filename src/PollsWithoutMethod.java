import java.util.Scanner;

public class PollsWithoutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("> 이름을 입력하세요");
        System.out.print("이름) ");
        String name = scanner.nextLine();
        System.out.println();

        // 질문을 담은 문자열 배열 저장
        String[] questions = {
            "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
            "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?",
            "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?",
            "4. 강의 진행 속도는 적절하였는가?"
        };

        // 질문에 갯수에 해당하는 만큼 답변의 길이 배열
        int[] answers = new int[questions.length];

        // 
        for (int first = 0; first < questions.length; first++) {
            System.out.println(questions[first]);
            System.out.println("(1) 전혀 아니다. (2) 아니다. (3) 그렇다. (4) 매우 그렇다.");
            System.out.println();

            while (true) {
                System.out.print("답) ");
                int answer = scanner.nextInt();

                if (answer >= 1 && answer <= 4) {
                    answers[first] = answer;
                    System.out.println();
                    break;
                }
            }
        }

        System.out.println("---------------설문 종료---------------");
        System.out.println();
        System.out.println("---------------설문 결과---------------");
        

        for (int first = 0; first < answers.length; first++) {
            if (first != 0) {
                System.out.print(", ");
            }
            System.out.printf("%d. (%s)", first + 1, answers[first]);
        }
    }
}