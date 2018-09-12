/*
Course_management_system_db_create-mjl20180911-1225.sql
This version is as of 2018-09-12 15:10

This script creates the Course Management System Database

Developed by Michael John Little
ISYS1117 Software Eng Fund: Assignment
September 2018


*/

/*drop the database and table to remove previous instances */
Drop database course_management_system ;



/*create the new database course_management_system*/
create database course_management_system;

/*choose course_management_system*/
use course_management_system;





/*=================================================================== */
/*create the Student table */
CREATE TABLE Student(
StudentID  int(255) unsigned auto_increment Not Null Primary Key,
UserName   char(9) not null,
FirstName  varchar (40) not null,
LastName   varchar (40) not null
);

/* insert data into Student table */
insert into Student (StudentID, UserName, FirstName,LastName ) values
(NULL, 'STU123456' ,'Andrew' ,'James'),
(NULL, 'STU123457' ,'Janet' ,'James'),
(NULL, 'STU123458' ,'Peter' ,'James'),
(NULL, 'STU123459' ,'Erin' ,'James'),
(NULL, 'STU123460' ,'Francis' ,'James'),
(NULL, 'STU123461' ,'Idrees' ,'Needham'),
(NULL, 'STU123462' ,'Pearl' ,'Sharpe'),
(NULL, 'STU123463' ,'George' ,'Sharpe'),
(NULL, 'STU123464' ,'John' ,'Singleton'),
(NULL, 'STU123465' ,'Paul' ,'Singleton'),
(NULL, 'STU123466' ,'George' ,'Singleton'),
(NULL, 'STU123467' ,'Ringo' ,'Singleton'),
(NULL, 'STU123468' ,'Annie' ,'Oakley'),
(NULL, 'STU123469' ,'Margaret' ,'Oakley'),
(NULL, 'STU123470' ,'Mary' ,'Oakley'),
(NULL, 'STU123471' ,'Paula' ,'Oakley');

/*=================================================================== */
/*create the Lecturer table */
CREATE TABLE Lecturer(
LecturerID  int(255) unsigned auto_increment Not Null Primary Key,
UserName   char(9) not null,
FirstName  varchar (40) not null,
LastName   varchar (40) not null
);


/* insert data into Lecturer table */
insert into Lecturer (LecturerID, UserName, FirstName,LastName ) values
(NULL, 'STF124574' ,'Idrees' ,'Needham'),
(NULL, 'STF124575' ,'Pearl ' ,'Sharpe'),
(NULL, 'STF124576' ,'Sami ' ,'Singleton'),
(NULL, 'STF124577' ,'Yasir ' ,'Lim'),
(NULL, 'STF124578' ,'Taliyah' ,'Oakjohn');

/*=================================================================== */
/*create the administrator table */
CREATE TABLE administrator(
adminID  int(255) unsigned auto_increment Not Null Primary Key,
UserName   char(9) not null,
FirstName  varchar (40) not null,
LastName   varchar (40) not null
);


/* insert data into administrator table */
insert into administrator (adminID, UserName, FirstName,LastName ) values
(NULL, 'ABD234583' ,'Keegan' ,'Keeling');

/*=================================================================== */
/*create the coordinator table */
CREATE TABLE coordinator(
coordID  int(255) unsigned auto_increment Not Null Primary Key,
UserName   char(9) not null,
FirstName  varchar (40) not null,
LastName   varchar (40) not null
);


/* insert data into coordinator table */
insert into coordinator (coordID, UserName, FirstName,LastName ) values
(NULL, 'STF124573' ,'Macauly' ,'Esquivel'),		
(NULL, 'STF124574' ,'Annette ' ,'Brown'),		
(NULL, 'STF124575' ,'Robert ' ,'Browning');

/*=================================================================== */
/*create the Password table 

This table has been commented out as I am not able to sort out the foreign
key link back to the Password table... 

CREATE TABLE Password(
PersonID int(255)unsigned auto_increment Not Null Primary Key,
UserName char(9), 
Password char(9) not null,
Foreign Key (UserName) REFERENCES  Student(UserName),
Foreign Key (UserName) REFERENCES  Lecturer(UserName),
index(UserName)
);
*/

/* insert data into Password table 
insert into Password (PersonID, UserName, Password) values
(NULL, 'STU123456' ,'ABD234567'),
(NULL, 'STU123457' ,'ABD234568'),
(NULL, 'STU123458' ,'ABD234569'),
(NULL, 'STU123459' ,'ABD234570'),
(NULL, 'STU123460' ,'ABD234571'),
(NULL, 'STU123461' ,'ABD234572'),
(NULL, 'STU123462' ,'ABD234573'),
(NULL, 'STU123463' ,'ABD234574'),
(NULL, 'STU123464' ,'ABD234575'),
(NULL, 'STU123465' ,'ABD234576'),
(NULL, 'STU123466' ,'ABD234577'),
(NULL, 'STU123467' ,'ABD234578'),
(NULL, 'STU123468' ,'ABD234579'),
(NULL, 'STU123469' ,'ABD234580'),
(NULL, 'STU123470' ,'ABD234581'),
(NULL, 'STU123471' ,'ABD234582'),
(NULL, 'STF124572' ,'ABD234583'),
(NULL, 'STF124573' ,'ABD234584'),
(NULL, 'STF124574' ,'ABD234585'),
(NULL, 'STF124575' ,'ABD234586'),
(NULL, 'STF124576' ,'ABD234587'),
(NULL, 'STF124577' ,'ABD234588'),
(NULL, 'STF124578' ,'ABD234589');

*/


/*=================================================================== */
/*create the course table */
CREATE TABLE course(
CourseID  int(255) unsigned auto_increment Not Null Primary Key,
CourseCode varchar(10) not null,
courseTitle  varchar (80) not null,
prerequisite  varchar (50) not null
);

/* insert data into coordinator table */
insert into course (CourseID , CourseCode, courseTitle, prerequisite ) values
(NULL, 'ARCH001' ,'3DS Max for Architects and Designers' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH002' ,'Architectural Drawing Techniques - Introduction' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH003' ,'Architectural Visualisation with Photoshop' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH004' ,'AutoCAD - Level 1' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH005' ,'AutoCAD - Level 2' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH006' ,'Design Portfolio Preparation' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH007' ,'Drawing Techniques for Design' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH008' ,'Introduction To The Building Design Process' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'ARCH009' ,'Revit Architecture - Level 1' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'PHOTO001' ,'Adobe Photoshop - Level 1' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'PHOTO002' ,'Architectural Visualisation with Photoshop' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'PHOTO003' ,'Contemporary Travel Photography with Cam Cope' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'PHOTO004' ,'Introduction to Photography - Level 1: Technical and Aesthetic' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'PHOTO005' ,'Photojournalism' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'FINEART001' ,'Brush Lettering with the Pointed Brush Workshop' ,'HSC Arts'),
(NULL, 'FINEART002' ,'Illustrating and Writing Childrens Picture Books' ,'HSC Arts'),
(NULL, 'FINEART003' ,'Illustration: Styles and Techniques' ,'HSC Arts'),
(NULL, 'FINEART004' ,'Refine painting techniques (VART6231C-CUVPAI501A)' ,'HSC Arts'),
(NULL, 'FINEART005' ,'Stop Motion Animation' ,'HSC Maths, HSC Science, HSC Arts'),
(NULL, 'FINEART006' ,'Foundation Colour' ,'HSC Maths, HSC Science, HSC Arts');

/*=================================================================== */

/*create the semester table */
CREATE TABLE semester(
semesterID  int(255) unsigned auto_increment Not Null Primary Key,
year        char(4) not null,
Semester    char (10) not null
);

/* insert data into semester table */
insert into semester(semesterID , year, Semester ) values
(NULL, '2012' ,'Semester 1'),
(NULL, '2012' ,'Semester 2'),
(NULL, '2013' ,'Semester 1'),
(NULL, '2013' ,'Semester 2'),
(NULL, '2014' ,'Semester 1'),
(NULL, '2014' ,'Semester 2'),
(NULL, '2015' ,'Semester 1'),
(NULL, '2015' ,'Semester 2'),
(NULL, '2016' ,'Semester 1'),
(NULL, '2016' ,'Semester 2'),
(NULL, '2017' ,'Semester 1'),
(NULL, '2017' ,'Semester 2'),
(NULL, '2018' ,'Semester 1'),
(NULL, '2018' ,'Semester 2'),
(NULL, '2019' ,'Semester 1'),
(NULL, '2019' ,'Semester 2'),
(NULL, '2020' ,'Semester 1'),
(NULL, '2020' ,'Semester 2'),
(NULL, '2021' ,'Semester 1'),
(NULL, '2021' ,'Semester 2'),
(NULL, '2022' ,'Semester 1'),
(NULL, '2022' ,'Semester 2'),
(NULL, '2023' ,'Semester 1'),
(NULL, '2023' ,'Semester 2'),
(NULL, '2024' ,'Semester 1'),
(NULL, '2024' ,'Semester 2'),
(NULL, '2025' ,'Semester 1'),
(NULL, '2025' ,'Semester 2'),
(NULL, '2026' ,'Semester 3'),
(NULL, '2026' ,'Semester 4');

/*=================================================================== */
/*Now to create the association tables */
/*=================================================================== */

/*
create the enrolled_result table 

THis is an association table that associates the student with the course
and their semester, and the results they have attained. 


*/
CREATE TABLE enrolled_result (
StudentID  int(255) REFERENCES Student(StudentID),
CourseID   int(255) REFERENCES Course(CourseID),
SemesterID int(255) REFERENCES Semester(SemesterID),
ResultScore enum ('Enrolled', 'PASS', 'Fail', 'RNF'),
Primary Key (StudentID,CourseID,SemesterID)
);

/* insert data into semester table 
insert into enrolled_result(StudentID , CourseID, SemesterID, ResultScore ) values
TBA!!!


*/

/*=================================================================== */

/*
create the teaches table 

THis is an association table that associates the lecturer with the courses
they teach, and the semester it runs. 

*/

CREATE TABLE teaches (
LecturerID  int(255) REFERENCES Lecturer(LecturerID),
CourseID   int(255) REFERENCES Course(CourseID),
SemesterID int(255) REFERENCES Semester(SemesterID),
Primary Key (LecturerID,CourseID,SemesterID)
);

/* insert data into teaches table 
insert into teaches(SLecturerID , CourseID, SemesterID) values
TBA!!!


*/

/*=================================================================== */

/*
create the coordinates_course table 

THis is an association table that associates the program coordiantor
with the courses the coordinate, and the semester they run. 

*/

CREATE TABLE coordinates_course (
coordID  int(255) REFERENCES Lecturer(LecturerID),
CourseID   int(255) REFERENCES Course(CourseID),
SemesterID int(255) REFERENCES Semester(SemesterID),
Primary Key (coordID,CourseID,SemesterID)
);

/* insert data into teaches table 
insert into coordinates_course(coordID , CourseID, SemesterID) values
TBA!!!


*/

/*=================================================================== */








