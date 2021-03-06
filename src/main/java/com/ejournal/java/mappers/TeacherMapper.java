package com.ejournal.java.mappers;

import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.ejournal.java.dtos.teacher.SimpleTeacherDto;
import com.ejournal.java.dtos.teacher.TeacherInfoDto;
import com.ejournal.java.dtos.teacher.TeacherRegisterDto;
import com.ejournal.java.dtos.teacher.TeacherStudentDto;
import com.ejournal.java.dtos.teacher.UpdateTeacherDto;
import com.ejournal.java.entities.Teacher;

/**
 * Created by kristiyan.parvanov on 26.12.19 г.
 */
@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = SchoolMapper.class
)
public abstract class TeacherMapper {

    @Autowired
    protected PasswordEncoder passwordEncoder;

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "subjects", ignore = true)
    @Mapping(target = "school", ignore = true)
    @Mapping(target = "groups", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "days", ignore = true)
    @Mapping(target = "password", expression = "java(passwordEncoder.encode(teacherRegisterDto.getEgn()))")
    public abstract Teacher teacherRegisterDtoToTeacher(TeacherRegisterDto teacherRegisterDto);

    public abstract SimpleTeacherDto teacherToSimpleTeacherDto(Teacher teacher);

    public abstract TeacherInfoDto teacherToTeacherInfoDto(Teacher teacher);

    public abstract TeacherStudentDto teacherToTeacherStudentDto(Teacher teacher);

    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    public abstract Teacher updateTeacher(UpdateTeacherDto updateTeacherDto, @MappingTarget Teacher teacher);
}
