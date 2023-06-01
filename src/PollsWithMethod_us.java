import pollsus.PollInitialArrays_us;
import pollsus.PollScanners_us;
import pollsus.PollStatistics_us;

// PollsWithMethod_us //
public class PollsWithMethod_us {
    public static void main(String[] args) { // main은 하나여야 한다.
        try {
            String[] answers;
            String[][] polls;
            PollInitialArrays_us pollInitialArrays_us = new PollInitialArrays_us();
            polls = pollInitialArrays_us.init(); // 설문 내용 초기화
            PollScanners_us pollScanners_us = new PollScanners_us();
            answers = pollScanners_us.pollWithAnswers(polls);
            PollStatistics_us pollStatistics_us= new PollStatistics_us();
            pollStatistics_us.printAnswers(answers);

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}