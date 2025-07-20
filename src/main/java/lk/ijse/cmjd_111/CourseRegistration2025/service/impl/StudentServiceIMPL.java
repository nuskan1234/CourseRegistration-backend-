package lk.ijse.cmjd_111.CourseRegistration2025.service.impl;

import lk.ijse.cmjd_111.CourseRegistration2025.dto.Role;
import lk.ijse.cmjd_111.CourseRegistration2025.dto.UserDTO;
import lk.ijse.cmjd_111.CourseRegistration2025.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class StudentServiceIMPL implements StudentService {
    @Override
    public UserDTO saveStudent(UserDTO student) {
        return null;
    }

    @Override
    public void deleteStudent(String studentId) {

    }

    @Override
    public void updateStudent(String studentId, UserDTO student) {

    }

    @Override
    public UserDTO getSelectedStudent(String studentId) throws Exception {
        var selectedStudent = new UserDTO(
                "STU01", "Kamal",
                "Perera", "kamal@mail.com",
                "First Street", "Panadura South",
                "Panadura", "Panadura",
                "123", Role.STUDENT);
        if(studentId.equals(selectedStudent.getUserId())){
            return selectedStudent;
        }
        throw new Exception("Student Not Found");
    }

    @Override
    public List<UserDTO> getAllStudents() {
        return Arrays.asList(
                new UserDTO("STU02", "Nimal",
                        "Fernando", "nimalf@mail.com",
                        "Lake Road", "Colombo 7",
                        "Colombo", "Colombo",
                        "abc123", Role.STUDENT),

                new UserDTO("STU03", "Sithara",
                        "Jayasinghe", "sithara.j@mail.com",
                        "Temple Lane", "Galle Fort",
                        "Galle", "Galle",
                        "pass456", Role.STUDENT),

                new UserDTO("STU04", "Ruwan",
                        "Silva", "ruwan.s@mail.com",
                        "Hill Street", "Kandy Central",
                        "Kandy", "Kandy",
                        "kandy321", Role.STUDENT),

                new UserDTO("STU05", "Dilani",
                        "Hettiarachchi", "dilani.h@mail.com",
                        "Marine Drive", "Negombo North",
                        "Negombo", "Negombo",
                        "negombo789", Role.STUDENT),

                new UserDTO("STU06", "Suresh",
                        "Wickramasinghe", "suresh.w@mail.com",
                        "Green Avenue", "Matara West",
                        "Matara", "Matara",
                        "matara123", Role.STUDENT)
        );
    }
}