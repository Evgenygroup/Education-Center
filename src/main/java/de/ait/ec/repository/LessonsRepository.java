package de.ait.ec.repository;

import de.ait.ec.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonsRepository extends JpaRepository<Lesson,Long> {
}
