package com.ejournal.java.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.ejournal.java.dtos.school.CreateSchoolDto;
import com.ejournal.java.dtos.school.SchoolDto;
import com.ejournal.java.entities.School;

/**
 * Created by kristiyan.parvanov on 27.12.19 г.
 */
public interface SchoolService {

    SchoolDto createSchool(CreateSchoolDto createSchoolDto);

    Page<SchoolDto> getAllSchools(Pageable pageable);

    Page<SchoolDto> getSchools(String name, Pageable pageable);

    SchoolDto getSchool(String id);

    School getById(String id);

    SchoolDto updateSchool(SchoolDto schoolDto);

    void deleteSchool(String id);
}
