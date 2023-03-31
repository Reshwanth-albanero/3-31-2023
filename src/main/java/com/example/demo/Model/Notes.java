package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Notes")
@NoArgsConstructor
@AllArgsConstructor
public class Notes {
    @Id
    private String id;
    private String title;
    private String text;
    private List<WishList> wishList;
    private String createdTime;
    private String colour;
}
