package response;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pojo.StudentPojo;

@ResponseBody
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
	
	private String msg;
	private HttpStatus status;
	private StudentPojo student;
	private List<StudentPojo> students;
}
