/* this is a temporary table to be used as part of SUC101
this was written by Michael Little  Wednesday, 12 September 2018
 */
/*create the Password table */

This table has been commented out as I am not able to sort out the foreign
key link back to the Password table... 

CREATE TABLE Password(
PersonID int(255)unsigned auto_increment Not Null Primary Key,
UserName char(9), 
Password char(9) not null,
/* these foreign key references have been commented out as there
   are problems with them.
   
Foreign Key (UserName) REFERENCES  Student(UserName),
Foreign Key (UserName) REFERENCES  Lecturer(UserName),
*/
index(UserName)
);


/* insert data into Password table */
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

