package hw303.hw303.service;

import hw303.hw303.Faculty;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);
    Faculty findFaculty(Long id);
    Faculty editFaculty(Long id, Faculty faculty);
    void deleteFaculty(Long id);
}