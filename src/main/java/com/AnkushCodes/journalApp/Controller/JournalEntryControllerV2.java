package com.AnkushCodes.journalApp.Controller;

import com.AnkushCodes.journalApp.entity.JournalEntry;
import com.AnkushCodes.journalApp.service.JournalEntryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/_journal")
class JournalEntryControllerV2 {

    private JournalEntryService journalEntryService;

    @GetMapping
    List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {

        return journalEntryService.saveEntry(myEntry);



    }

    @GetMapping("id/{myId}")
    public JournalEntry GetById(@PathVariable Long myId) {
        return null;

    }

    @DeleteMapping("id/{myId}")
    public JournalEntry DeleteEntry(@PathVariable Long myId) {

        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry UpdateData(@PathVariable Long id, @RequestBody JournalEntry entry) {
        return null;
    }


}
