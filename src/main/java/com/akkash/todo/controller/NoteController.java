package com.akkash.todo.controller;

import com.akkash.todo.entity.Diary;
import com.akkash.todo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping
    public List<Diary> getAllDiary(){
        return noteService.getAllNotes();
    }

    @PostMapping
    public Diary createDiary(@RequestBody Diary diary){

        return noteService.createDiary(diary);

    }

    @DeleteMapping("/{id}")
    public String deleteDiary(@PathVariable Integer id){
        noteService.deleteDiary(id);

        return "Diary Deleted Successfully";
    }

    @PutMapping("/{id}")
    public  String updateDiary(@PathVariable Integer id, @RequestBody Diary diary){

        noteService.updateDiary(id, diary);


        return "Updated Successfully";




//        return "Updated Successfully";
    }

    @DeleteMapping
    public String deleteAllDiary(){

        noteService.deleteAllDiary();

        return "All Diary Deleted Successfully";
    }
}
