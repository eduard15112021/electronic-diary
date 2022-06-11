package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.TimeTable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TimeTableRepository extends CrudRepository<TimeTable, Integer> {

    List<TimeTable> findByGrade_IdAndSubject_Id(int grade, int subject);

    List<TimeTable> findByGrade_IdOrderByDayOfWeek(int grade);
}
