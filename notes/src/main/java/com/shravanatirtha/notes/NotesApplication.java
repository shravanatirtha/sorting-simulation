package com.shravanatirtha.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class NotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "index.html";
	}

	@PostMapping("/api/notes")
	@ResponseBody
	public String receivedNote(@RequestBody NotePayload payload) {
		System.out.println("Received note from frontend: " + payload.getValue() +" from "+ payload.getId());
		createNote(payload);
		return payload.getValue();
	}

	public void createNote(NotePayload payload){

	}

	static class NotePayload {

		private String id;
		private String value;

		public String getId() {
			return this.id;
		}

		public String getValue() {
			return this.value;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

}
