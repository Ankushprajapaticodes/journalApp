package com.AnkushCodes.journalApp.entity;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Data
@Document(collection = "journal_entries")
public class JournalEntry {
    @Id
    private ObjectId id;

    private  String title;

    private  String content;

    private LocalDateTime date;
}
