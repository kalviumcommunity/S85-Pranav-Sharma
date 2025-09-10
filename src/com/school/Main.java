package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        Student student1 = new Student("Alice Wonderland", "10th Grade");
        Student student2 = new Student("Bob The Builder", "9th Grade");
        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        Staff staff1 = new Staff("Mrs. Johnson", "Administrator");

        Course course1 = new Course("Intro to Programming");

        System.out.println("\nRegistered People:");
        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        staff1.displayDetails();

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();

        // --- Attendance Recording ---
        System.out.println("\n--- Attendance Recording ---");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Record valid attendance using student.getId()
        AttendanceRecord record1 = new AttendanceRecord(student1.getId(), course1.getCourseId(), "Present");
        attendanceLog.add(record1);

        // Invalid attendance status
        AttendanceRecord record2 = new AttendanceRecord(student2.getId(), course1.getCourseId(), "Late");
        attendanceLog.add(record2);

        // Another valid attendance
        AttendanceRecord record3 = new AttendanceRecord(student2.getId(), course1.getCourseId(), "Absent");
        attendanceLog.add(record3);

        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        System.out.println("\nSession 4: Data Encapsulation & Attendance Recording Complete.");
    }
}
