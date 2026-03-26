package com.akkash.todo.service;

import com.akkash.todo.entity.Diary;
import com.akkash.todo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Diary> getAllNotes(){

        return noteRepository.findAll();
    }

    public Diary createDiary(Diary diary){
        return noteRepository.save(diary);
    }

    public void deleteDiary(Integer id){
        noteRepository.deleteById(id);
    }

    public Diary updateDiary(Integer id, Diary diary){
        diary.setId(id);
        diary.setTitle(diary.getTitle());
        diary.setContent(diary.getContent());

        return noteRepository.save(diary);

    }

    public void deleteAllDiary(){
        noteRepository.deleteAll();
    }

}
