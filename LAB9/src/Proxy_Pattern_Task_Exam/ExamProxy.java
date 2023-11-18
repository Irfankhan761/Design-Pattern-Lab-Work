
package Proxy_Pattern_Task_Exam;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TECHNIFI 1
 */

// Proxy class
class ExamProxy implements Exam {
    private RealExam realExam;
    private Map<String, String> cachedAnswers;

    public ExamProxy() {
        // Smart Proxy: Create the RealExam object only when required
        System.out.println("Smart Proxy created");
    }

    @Override
    public void loadExam() {
        // Virtual Proxy: Load the exam on demand
        if (realExam == null) {
            realExam = new RealExam();
            cachedAnswers = new HashMap<>(realExam.getStudentAnswers("Teacher"));
        }
        System.out.println("Virtual Proxy: Exam loaded");
    }

    @Override
    public void displayResults(String studentName) {
        // Protected Proxy: Display results based on the user
        if (studentName.equals("Teacher")) {
            // Teacher sees all results
            System.out.println("Protected Proxy: Displaying all results to the teacher");
            realExam.displayResults(studentName);
        } else {
            // Students see only their results
            System.out.println("Protected Proxy: Displaying results to the student");
            Map<String, String> studentAnswers = cachedAnswers;
            System.out.println("Results: " + studentAnswers.get("Q1") + ", " +
                    studentAnswers.get("Q2") + ", " + studentAnswers.get("Q3") + ", ...");
        }
    }

    @Override
    public void addAnswers(String studentName, Map<String, String> answers) {
        if (realExam != null) {
            realExam.addAnswers(studentName, answers);
        }
    }
}