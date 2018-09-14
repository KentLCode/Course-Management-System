-- AC1
select *
from Student;

-- AC2
select *
from Lecturer;

-- AC3
select *
from course;

-- AC4
select *
from semester;

-- AC5
select  enrolled_result.CourseID,courseTitle,ResultScore
from enrolled_result ,course
where enrolled_result.CourseID=course.CourseID
   and enrolled_result.StudentID='1'
   and enrolled_result.SemesterID='1';
   
-- AC6
select distinct teaches.LecturerID, teaches.SemesterID, enrolled_result.StudentID,enrolled_result.CourseID
from teaches,enrolled_result,course
where teaches.LecturerID='2'
and teaches.SemesterID=enrolled_result.SemesterID
and teaches.SemesterID='3'and'4'
and teaches.CourseID=course.CourseID;
