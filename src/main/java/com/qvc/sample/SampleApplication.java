package com.qvc.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/welcome")
	public ResponseEntity<Welcome> welcomeObject() {
		return ResponseEntity.ok(new Welcome("Hi!"));
	}

	class Welcome {
		private String message;

		Welcome(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((message == null) ? 0 : message.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Welcome other = (Welcome) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (message == null) {
				if (other.message != null)
					return false;
			} else if (!message.equals(other.message))
				return false;
			return true;
		}

		private SampleApplication getEnclosingInstance() {
			return SampleApplication.this;
		}
		

	}

}
