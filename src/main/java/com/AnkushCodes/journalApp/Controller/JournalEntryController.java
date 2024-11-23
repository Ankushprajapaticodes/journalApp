//package com.AnkushCodes.journalApp.Controller;
//
//import com.AnkushCodes.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//@RestController
//@RequestMapping("/_journal")
//class JournalEntryController {
//
//    private HashMap<Long, JournalEntry> journalEntryHashMap = new HashMap<>();
//
//    @GetMapping
//    List<JournalEntry> getAll(){
//        return  new ArrayList<>(journalEntryHashMap.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//
//        journalEntryHashMap.put(myEntry.getId(),myEntry);
//
//        return  true;
//
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry GetById(@PathVariable Long myId){
//        return  journalEntryHashMap.get(myId);
//
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry DeleteEntry(@PathVariable Long myId){
//        return  journalEntryHashMap.remove(myId);
//    }
//
//    @PutMapping("id/{id}")
//    public JournalEntry UpdateData(@PathVariable Long id,@RequestBody JournalEntry entry){
//        return  journalEntryHashMap.put(id,entry);
//    }
//
//
//
//}
