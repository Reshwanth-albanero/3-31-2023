package com.example.demo.Service;

import com.example.demo.Model.Notes;
import com.example.demo.Repository.GoogleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoogleService {
    @Autowired
    GoogleRepository googleRepository;
    public void addNotes(Notes notes) {
        googleRepository.save(notes);
    }
}
