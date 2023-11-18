package Proxy_Pattern_Task_Exam;
import java.util.Map;
/**
 *
 * @author Irfan Khan
 */

// Subject interface
interface Exam {
    void loadExam(); // Virtual Proxy method
    void displayResults(String studentName); // Protected Proxy method
    void addAnswers(String studentName, Map<String, String> answers); // Prototype Proxy method
}