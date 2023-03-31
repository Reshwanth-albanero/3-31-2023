package com.example.demo.Repository;
import com.example.demo.Model.Notes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GoogleRepository extends MongoRepository<Notes,String> {
}
