package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.NativeMark;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NativeMarkRepository extends CrudRepository<NativeMark, Integer> {

    List<NativeMark> findBySubject_IdAndStudent_Id(int subject, int student);

    List<NativeMark> findBySubject_Id(int subject);
}
