package com.AnkushCodes.journalApp.service;

import com.AnkushCodes.journalApp.entity.JournalEntry;
import com.AnkushCodes.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){

        journalEntryRepository.save(journalEntry);

    }

    public List<JournalEntry> getALl(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);

    }

    public void deleteById(ObjectId id){

        journalEntryRepository.deleteById(id);

    }

}
