package Proxy_Pattern_Task_Exam;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Irfan Khan
 */
// ExamResults class as a prototype
class ExamResults implements Clonable {
    private Map<String, String> answers;

    public ExamResults() {
        answers = new HashMap<>();
    }

    public void addAnswer(String question, String answer) {
        answers.put(question, answer);
    }

    public Map<String, String> getAnswers() {
        return new HashMap<>(answers);
    }

    @Override
    public Clonable clone() {
        ExamResults clone = new ExamResults();
        clone.answers.putAll(this.answers);
        return clone;
    }
}
