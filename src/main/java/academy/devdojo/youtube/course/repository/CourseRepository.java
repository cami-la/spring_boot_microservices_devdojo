package academy.devdojo.youtube.course.repository;

import academy.devdojo.youtube.course.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
