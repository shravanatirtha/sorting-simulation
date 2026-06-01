package com.shravanatirtha.notes;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@SpringBootApplication
@Controller
public class NotesApplication {

	private final ObjectMapper objectMapper = new ObjectMapper();

	public static void main(String[] args) {
		SpringApplication.run(NotesApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "index.html";
	}

	@GetMapping("/api/notes")
	@ResponseBody
	public List<NotePayload> getNote() {
		try {
			InputStream inputStream = new ClassPathResource("notes.json").getInputStream();
			if (inputStream.available() == 0) {
				return new ArrayList<>();
			}
			return objectMapper.readValue(inputStream, new TypeReference<List<NotePayload>>() {
			});
		} catch (IOException e) {
			System.err.println(e.getMessage());
			return new ArrayList<>();
		}
	}

	@PostMapping("/api/notes")
	@ResponseBody
	public String receivedNote(@RequestBody NotePayload payload) {
		System.out.println("Received note from frontend: " + payload.getValue() + " from " + payload.getId());
		createNote(payload);
		return payload.getValue();
	}

	public void createNote(NotePayload payload) {

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
