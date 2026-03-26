package com.akkash.todo.repository;

import com.akkash.todo.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Diary, Integer>{
}
