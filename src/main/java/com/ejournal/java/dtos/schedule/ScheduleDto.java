package com.ejournal.java.dtos.schedule;

import java.util.List;

import com.ejournal.java.dtos.dayitem.DayItemDto;
import com.ejournal.java.dtos.group.GroupScheduleDto;
import com.ejournal.java.enums.Term;
import lombok.Data;

/**
 * Created by kristiyan.parvanov on 18.02.20 г.
 */
@Data
public class ScheduleDto {

    private String id;
    private Term term;
    private GroupScheduleDto group;
    private List<DayItemDto> days;
}
