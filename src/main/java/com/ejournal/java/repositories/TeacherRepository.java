package com.ejournal.java.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ejournal.java.entities.Teacher;

/**
 * Created by kristiyan.parvanov on 30.12.19 г.
 */
public interface TeacherRepository extends PagingAndSortingRepository<Teacher, String > {

    boolean existsByEmail(String email);
}
