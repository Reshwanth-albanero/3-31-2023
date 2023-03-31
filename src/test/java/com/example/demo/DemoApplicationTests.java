package com.example.demo;

import com.example.demo.Controler.GoogleController;
import com.example.demo.Model.Notes;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Notes notes = new Notes("1","title","text","createdTime","colour");
		var googleController = new GoogleController();
		assertEquals("Success",googleController.addNotes(notes));
	}

}
