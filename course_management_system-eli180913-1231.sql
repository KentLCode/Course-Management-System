/*
Course_management_system_db_create-mjl20180911-1225.sql
This version is as of 2018-09-14 17:28

This script creates the Course Management System Database

Developed by Eli
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
StudentID  int(255) ,
UserName   char(9)  Not Null Primary Key,
FirstName  varchar (40) not null,
LastName   varchar (40) not null
);

/* insert data into Student table */
insert into Student (StudentID, UserName, FirstName,LastName ) values
('1', 'STU123456' ,'Andrew' ,'James'),
('2', 'STU123457' ,'Janet' ,'James'),
('3', 'STU123458' ,'Peter' ,'James'),
('4', 'STU123459' ,'Erin' ,'James'),
('5', 'STU123460' ,'Francis' ,'James'),
('6', 'STU123461' ,'Idrees' ,'Needham'),
('7', 'STU123462' ,'Pearl' ,'Sharpe'),
('8', 'STU123463' ,'George' ,'Sharpe'),
('9', 'STU123464' ,'John' ,'Singleton'),
('10', 'STU123465' ,'Paul' ,'Singleton'),
('11', 'STU123466' ,'George' ,'Singleton'),
('12', 'STU123467' ,'Ringo' ,'Singleton'),
('13', 'STU123468' ,'Annie' ,'Oakley'),
('14', 'STU123469' ,'Margaret' ,'Oakley'),
('15', 'STU123470' ,'Mary' ,'Oakley'),
('16', 'STU123471' ,'Paula' ,'Oakley');

/*=================================================================== */
/*create the Lecturer table */
CREATE TABLE Lecturer(
LecturerID  int(255) ,
UserName   char(9)  Not Null Primary Key,
FirstName  varchar (40) not null,
LastName   varchar (40) not null
);


/* insert data into Lecturer table */
insert into Lecturer (LecturerID, UserName, FirstName,LastName ) values
('1', 'LTF124574' ,'Idrees' ,'Needham'),
('2', 'LTF124575' ,'Pearl ' ,'Sharpe'),
('3', 'LTF124576' ,'Sami ' ,'Singleton'),
('4', 'LTF124577' ,'Yasir ' ,'Lim'),
('5', 'LTF124578' ,'Taliyah' ,'Oakjohn');

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
Create table StuPassword(
PersonID int(225),
UserName char(9) not null primary key,
Password char(9) not null,
Foreign Key(UserName) References Student(UserName)
);
-- insert data into Password table 
insert into StuPassword (PersonID, UserName, Password) values
('1', 'STU123456' ,'ABD234567'),
('2', 'STU123457' ,'ABD234568'),
('3', 'STU123458' ,'ABD234569'),
('4', 'STU123459' ,'ABD234570'),
('5', 'STU123460' ,'ABD234571'),
('6', 'STU123461' ,'ABD234572'),
('7', 'STU123462' ,'ABD234573'),
('8', 'STU123463' ,'ABD234574'),
('9', 'STU123464' ,'ABD234575'),
('10', 'STU123465' ,'ABD234576'),
('11', 'STU123466' ,'ABD234577'),
('12', 'STU123467' ,'ABD234578'),
('13', 'STU123468' ,'ABD234579'),
('14', 'STU123469' ,'ABD234580'),
('15', 'STU123470' ,'ABD234581'),
('16', 'STU123471' ,'ABD234582');

Create table LecPassword(
PersonID int(225),
UserName char(9) not null primary key,
Password char(9) not null,
Foreign Key(UserName) References Lecturer(UserName)
);
/*(NULL, 'STF124572' ,'ABD234583'),
(NULL, 'STF124573' ,'ABD234584'),

(NULL, 'STF124574' ,'ABD234585'),
(NULL, 'STF124575' ,'ABD234586'),
(NULL, 'STF124576' ,'ABD234587'),
(NULL, 'STF124577' ,'ABD234588'),
(NULL, 'STF124578' ,'ABD234589');

*/

insert into LecPassword(PersonId, UserName, Password) values
('1', 'LTF124574' ,'ABD234585'),
('2', 'LTF124575' ,'ABD234586'),
('3', 'LTF124576' ,'ABD234587'),
('4', 'LTF124577' ,'ABD234588'),
('5', 'LTF124578' ,'ABD234589');

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
('1', 'ARCH001' ,'3DS Max for Architects and Designers' ,'HSC Maths, HSC Science, HSC Arts'),
('2', 'ARCH002' ,'Architectural Drawing Techniques - Introduction' ,'HSC Maths, HSC Science, HSC Arts'),
('3', 'ARCH003' ,'Architectural Visualisation with Photoshop' ,'HSC Maths, HSC Science, HSC Arts'),
('4', 'ARCH004' ,'AutoCAD - Level 1' ,'HSC Maths, HSC Science, HSC Arts'),
('5', 'ARCH005' ,'AutoCAD - Level 2' ,'HSC Maths, HSC Science, HSC Arts'),
('6', 'ARCH006' ,'Design Portfolio Preparation' ,'HSC Maths, HSC Science, HSC Arts'),
('7', 'ARCH007' ,'Drawing Techniques for Design' ,'HSC Maths, HSC Science, HSC Arts'),
('8', 'ARCH008' ,'Introduction To The Building Design Process' ,'HSC Maths, HSC Science, HSC Arts'),
('9', 'ARCH009' ,'Revit Architecture - Level 1' ,'HSC Maths, HSC Science, HSC Arts'),
('10', 'PHOTO001' ,'Adobe Photoshop - Level 1' ,'HSC Maths, HSC Science, HSC Arts'),
('11', 'PHOTO002' ,'Architectural Visualisation with Photoshop' ,'HSC Maths, HSC Science, HSC Arts'),
('12', 'PHOTO003' ,'Contemporary Travel Photography with Cam Cope' ,'HSC Maths, HSC Science, HSC Arts'),
('13', 'PHOTO004' ,'Introduction to Photography - Level 1: Technical and Aesthetic' ,'HSC Maths, HSC Science, HSC Arts'),
('14', 'PHOTO005' ,'Photojournalism' ,'HSC Maths, HSC Science, HSC Arts'),
('15', 'FINEART001' ,'Brush Lettering with the Pointed Brush Workshop' ,'HSC Arts'),
('16', 'FINEART002' ,'Illustrating and Writing Childrens Picture Books' ,'HSC Arts'),
('17', 'FINEART003' ,'Illustration: Styles and Techniques' ,'HSC Arts'),
('18', 'FINEART004' ,'Refine painting techniques (VART6231C-CUVPAI501A)' ,'HSC Arts'),
('19', 'FINEART005' ,'Stop Motion Animation' ,'HSC Maths, HSC Science, HSC Arts'),
('20', 'FINEART006' ,'Foundation Colour' ,'HSC Maths, HSC Science, HSC Arts');

/*=================================================================== */

/*create the semester table */
CREATE TABLE semester(
semesterID  int(255) unsigned auto_increment Not Null Primary Key,
year        char(4) not null,
Semester    char (10) not null
);

/* insert data into semester table */
insert into semester(semesterID , year, Semester ) values
('1', '2012' ,'Semester 1'),
('2', '2012' ,'Semester 2'),
('3', '2013' ,'Semester 1'),
('4', '2013' ,'Semester 2'),
('5', '2014' ,'Semester 1'),
('6', '2014' ,'Semester 2'),
('7', '2015' ,'Semester 1'),
('8', '2015' ,'Semester 2'),
('9', '2016' ,'Semester 1'),
('10', '2016' ,'Semester 2'),
('11', '2017' ,'Semester 1'),
('12', '2017' ,'Semester 2'),
('13', '2018' ,'Semester 1'),
('14', '2018' ,'Semester 2'),
('15', '2019' ,'Semester 1'),
('16', '2019' ,'Semester 2'),
('17', '2020' ,'Semester 1'),
('18', '2020' ,'Semester 2'),
('19', '2021' ,'Semester 1'),
('20', '2021' ,'Semester 2'),
('21', '2022' ,'Semester 1'),
('22', '2022' ,'Semester 2'),
('23', '2023' ,'Semester 1'),
('24', '2023' ,'Semester 2'),
('25', '2024' ,'Semester 1'),
('26', '2024' ,'Semester 2'),
('27', '2025' ,'Semester 1'),
('28', '2025' ,'Semester 2'),
('29', '2026' ,'Semester 3'),
('30', '2026' ,'Semester 4');

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
TBA!!!*/

insert into enrolled_result(StudentID , CourseID, SemesterID, ResultScore ) values
('1', '1', '1', "pass"),
('1', '2', '1', "Pass"),
('1', '3', '1', "pass"),
('1', '4', '1', "pass"),
('1', '5', '2', "pass"),
('1', '6', '2', "pass"),
('1', '7', '2', "fail"),
('1', '8', '2', "pass"),
('1', '9', '3', "pass"),
('1', '10', '3', "pass"),
('1', '11', '3', "pass"),
('1', '12', '3', "fail"),
('1', '13', '4', "pass"),
('1', '14', '4', "pass"),
('1', '15', '4', "pass"),
('1', '16', '4', "pass"),
('2', '1', '2', "pass"),
('2', '2', '2', "pass"),
('2', '3', '2', "pass"),
('2', '4', '2', "pass"),
('2', '6', '3', "pass"),
('2', '7', '3', "pass"),
('2', '8', '3', "fail"),
('2', '9', '3', "pass"),
('2', '20', '4', "fail"),
('2', '19', '4', "fail"),
('2', '17', '4', "pass"),
('2', '18', '4', "pass"),
('2', '11', '5', "pass"),
('2', '13', '5', "pass"),
('2', '14', '5', "fail"),
('2', '15', '5', "fail"),
('3', '2', '11', "pass"),
('3', '3', '11', "fail"),
('3', '4', '11', "pass"),
('3', '5', '11', "pass"),
('3', '1', '12', "pass"),
('3', '6', '12', "pass"),
('3', '7', '12', "pass"),
('3', '8', '12', "pass"),
('4', '15', '10', "pass"),
('4', '16', '10', "pass"),
('4', '17', '10', "fail"),
('4', '18', '10', "pass"),
('4', '13', '11', "pass"),
('4', '14', '11', "pass"),
('4', '19', '11', "fail"),
('4', '20', '11', "pass"),
('4', '8', '12', "pass"),
('4', '9', '12', "pass"),
('4', '10', '12', "pass"),
('4', '11', '12', "pass"),
('5', '2', '9', "pass"),
('5', '4', '9', "pass"),
('5', '5', '9', "pass"),
('5', '7', '9', "pass"),
('5', '1', '10', "pass"),
('5', '3', '10', "pass"),
('5', '6', '10', "pass"),
('5', '8', '10', "pass"),
('5', '11', '11', "pass"),
('5', '12', '11', "pass"),
('5', '14', '11', "pass"),
('5', '15', '11', "pass"),
('5', '13', '12', "pass"),
('5', '16', '12', "pass"),
('5', '17', '12', "pass"),
('5', '18', '12', "pass"),
('6', '10', '6', "pass"),
('6', '11', '6', "pass"),
('6', '12', '6', "pass"),
('6', '13', '6', "fail"),
('6', '14', '7', "pass"),
('6', '1', '7', "pass"),
('6', '2', '7', "pass"),
('6', '3', '7', "pass"),
('6', '4', '8', "pass"),
('6', '5', '8', "fail"),
('6', '6', '8', "pass"),
('6', '7', '8', "pass"),
('6', '8', '9', "pass"),
('6', '9', '9', "fail"),
('6', '19', '9', "pass"),
('6', '20', '9', "pass"),
('7', '3', '8', "pass"),
('7', '4', '8', "pass"),
('7', '6', '8', "fail"),
('7', '7', '8', "pass"),
('7', '2', '9', "pass"),
('7', '8', '9', "pass"),
('7', '10', '9', "pass"),
('7', '11', '9', "pass"),
('7', '9', '10', "pass"),
('7', '13', '10', "pass"),
('7', '14', '10', "pass"),
('7', '15', '10', "pass"),
('7', '16', '11', "pass"),
('7', '17', '11', "pass"),
('7', '18', '11', "pass"),
('7', '20', '11', "pass");


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
insert into teaches(LecturerID , CourseID, SemesterID) values
('1','1','1'),
('1','2','1'),
('1','3','1'),
('1','4','1'),
('2','5','1'),
('2','6','1'),
('2','7','1'),
('2','8','1'),
('3','9','1'),
('3','10','1'),
('3','11','1'),
('3','12','1'),
('4','13','1'),
('4','14','1'),
('4','15','1'),
('4','16','1'),
('5','17','1'),
('5','18','1'),
('5','19','1'),
('5','20','1'),
('1','1','2'),
('1','2','2'),
('1','3','2'),
('1','4','2'),
('2','5','2'),
('2','6','2'),
('2','7','2'),
('2','8','2'),
('3','9','2'),
('3','10','2'),
('3','11','2'),
('3','12','2'),
('4','13','2'),
('4','14','2'),
('4','15','2'),
('4','16','2'),
('5','17','2'),
('5','18','2'),
('5','19','2'),
('5','20','2'),
('1','1','3'),
('1','2','3'),
('1','3','3'),
('1','4','3'),
('2','5','3'),
('2','6','3'),
('2','7','3'),
('2','8','3'),
('3','9','3'),
('3','10','3'),
('3','11','3'),
('3','12','3'),
('4','13','3'),
('4','14','3'),
('4','15','3'),
('4','16','3'),
('5','17','3'),
('5','18','3'),
('5','19','3'),
('5','20','3'),
('1','1','4'),
('1','2','4'),
('1','3','4'),
('1','4','4'),
('2','5','4'),
('2','6','4'),
('2','7','4'),
('2','8','4'),
('3','9','4'),
('3','10','4'),
('3','11','4'),
('3','12','4'),
('4','13','4'),
('4','14','4'),
('4','15','4'),
('4','16','4'),
('5','17','4'),
('5','18','4'),
('5','19','4'),
('5','20','4'),
('1','1','5'),
('1','2','5'),
('1','3','5'),
('1','4','5'),
('2','5','5'),
('2','6','5'),
('2','7','5'),
('2','8','5'),
('3','9','5'),
('3','10','5'),
('3','11','5'),
('3','12','5'),
('4','13','5'),
('4','14','5'),
('4','15','5'),
('4','16','5'),
('5','17','5'),
('5','18','5'),
('5','19','5'),
('5','20','5'),
('1','1','6'),
('1','2','6'),
('1','3','6'),
('1','4','6'),
('2','5','6'),
('2','6','6'),
('2','7','6'),
('2','8','6'),
('3','9','6'),
('3','10','6'),
('3','11','6'),
('3','12','6'),
('4','13','6'),
('4','14','6'),
('4','15','6'),
('4','16','6'),
('5','17','6'),
('5','18','6'),
('5','19','6'),
('5','20','6'),
('1','1','7'),
('1','2','7'),
('1','3','7'),
('1','4','7'),
('2','5','7'),
('2','6','7'),
('2','7','7'),
('2','8','7'),
('3','9','7'),
('3','10','7'),
('3','11','7'),
('3','12','7'),
('4','13','7'),
('4','14','7'),
('4','15','7'),
('4','16','7'),
('5','17','7'),
('5','18','7'),
('5','19','7'),
('5','20','7'),
('1','1','8'),
('1','2','8'),
('1','3','8'),
('1','4','8'),
('2','5','8'),
('2','6','8'),
('2','7','8'),
('2','8','8'),
('3','9','8'),
('3','10','8'),
('3','11','8'),
('3','12','8'),
('4','13','8'),
('4','14','8'),
('4','15','8'),
('4','16','8'),
('5','17','8'),
('5','18','8'),
('5','19','8'),
('5','20','8'),
('1','1','9'),
('1','2','9'),
('1','3','9'),
('1','4','9'),
('2','5','9'),
('2','6','9'),
('2','7','9'),
('2','8','9'),
('3','9','9'),
('3','10','9'),
('3','11','9'),
('3','12','9'),
('4','13','9'),
('4','14','9'),
('4','15','9'),
('4','16','9'),
('5','17','9'),
('5','18','9'),
('5','19','9'),
('5','20','9'),
('1','1','10'),
('1','2','10'),
('1','3','10'),
('1','4','10'),
('2','5','10'),
('2','6','10'),
('2','7','10'),
('2','8','10'),
('3','9','10'),
('3','10','10'),
('3','11','10'),
('3','12','10'),
('4','13','10'),
('4','14','10'),
('4','15','10'),
('4','16','10'),
('5','17','10'),
('5','18','10'),
('5','19','10'),
('5','20','10'),
('1','1','11'),
('1','2','11'),
('1','3','11'),
('1','4','11'),
('2','5','11'),
('2','6','11'),
('2','7','11'),
('2','8','11'),
('3','9','11'),
('3','10','11'),
('3','11','11'),
('3','12','11'),
('4','13','11'),
('4','14','11'),
('4','15','11'),
('4','16','11'),
('5','17','11'),
('5','18','11'),
('5','19','11'),
('5','20','11'),
('1','1','12'),
('1','2','12'),
('1','3','12'),
('1','4','12'),
('2','5','12'),
('2','6','12'),
('2','7','12'),
('2','8','12'),
('3','9','12'),
('3','10','12'),
('3','11','12'),
('3','12','12'),
('4','13','12'),
('4','14','12'),
('4','15','12'),
('4','16','12'),
('5','17','12'),
('5','18','12'),
('5','19','12'),
('5','20','12');

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







