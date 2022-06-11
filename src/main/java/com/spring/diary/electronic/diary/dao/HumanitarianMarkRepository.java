package com.spring.diary.electronic.diary.dao;


import com.spring.diary.electronic.diary.entity.HumanitarianMark;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HumanitarianMarkRepository extends CrudRepository<HumanitarianMark, Integer> {

    List<HumanitarianMark> findBySubject_IdAndStudent_Id(int subject, int student);

    List<HumanitarianMark> findBySubject_Id(int subject);
}
