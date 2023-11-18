package Proxy_Pattern_Task_Exam;

import java.util.List;

/**
 *
 * @author TECHNIFI 1
 */
public interface Exam {
    void loadQuestions();
    void answerQuestion(int questionNumber, String answer);
    void submitAnswers();
    List<ExamResult> getExamResults();
}