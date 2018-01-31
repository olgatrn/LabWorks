package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.Course;

import java.util.List;

public interface CourseDAO {
    boolean addCourse(Course course);

    Course getCourseById(int id);

    List<Course> getAll();
}
