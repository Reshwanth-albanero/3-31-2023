package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "WishList")
@NoArgsConstructor
@AllArgsConstructor
public class WishList {
    @Id
    private String id;
    private String items;
}
