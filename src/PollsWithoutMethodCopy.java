import java.util.Scanner;

public class PollsWithoutMethodCopy {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        // 터미널 창에 "> 이름을 입력하세요" 띄우기
        System.out.println("> 이름을 입력하세요");
        // 터미널 창에 "이름)" 띄우기
        System.out.print("이름)");
        // 유저가 터미널 창에 각자 이름 입력
        String name = myObj.nextLine();
        // 건너뛰기
        System.out.println();

        String[] answers = new String[4];
        String[][] polls = {
                { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." },
                { "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." },
                { "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." },
                { "4. 강의 진행 속도는 적절하였는가?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." }
        };

        int count = 0;
        for (int second = 0; second < polls.length; second = second + 2) {
            System.out.println(polls[second][0]);
             for (int third = 0; third < answers.length; third = third + 1) {
             System.out.print(polls[second+1][third]);
            }

            System.out.println();
            System.out.print("답)");

            answers[count] = myObj.nextLine();
            count = count + 1;
            System.out.println();
        }

        for (int first = 0; first < answers.length; first = first + 1) {
            if (first != 0) {
                System.out.print(", ");
            }
            System.out.print(answers[first]);
        }
        // return 0;
      }
    }

