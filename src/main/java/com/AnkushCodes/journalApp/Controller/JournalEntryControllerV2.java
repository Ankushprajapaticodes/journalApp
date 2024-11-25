package com.AnkushCodes.journalApp.Controller;

import com.AnkushCodes.journalApp.entity.JournalEntry;
import com.AnkushCodes.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/_journal")
class JournalEntryControllerV2 {

    @Autowired
    private  JournalEntryService journalEntryService;

    @GetMapping
    List<JournalEntry> getAll() {
        return journalEntryService.getALl();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
         journalEntryService.saveEntry(myEntry);
         return  myEntry;

    }

    @GetMapping("id/{myId}")
    public JournalEntry GetById(@PathVariable ObjectId myId) {
        return journalEntryService.findById(myId).orElse(null);

    }

    @DeleteMapping("id/{myId}")
    public boolean DeleteEntry(@PathVariable ObjectId myId) {

        journalEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("id/{id}")
    public JournalEntry UpdateData(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry) {
        JournalEntry old = journalEntryService.findById(id).orElse(null);

        if(old != null){
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return  old;
    }


}
