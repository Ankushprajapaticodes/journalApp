package com.AnkushCodes.journalApp.service;

import com.AnkushCodes.journalApp.entity.JournalEntry;
import com.AnkushCodes.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public boolean saveEntry(JournalEntry journalEntry){

        journalEntryRepository.save(journalEntry);

        return true;

    }

}
