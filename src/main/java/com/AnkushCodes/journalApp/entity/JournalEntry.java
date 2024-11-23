package com.AnkushCodes.journalApp.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "journal_entries")
public class JournalEntry {
    @Id
    private  String id;

    private  String title;

    private  String content;
}
