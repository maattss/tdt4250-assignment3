# TDT4250 - Advanced Software Engineering - Assignment 1

## Content

Study plan (program) with semesters, courses and specializations.
A program includes multiple semesters with optional specializations (single or multiple).
Every courses included in a semester can be mandatory or elective.

## Constraints

- Each semester can contain courses summarizing in a total of 30 credits (validated using OCL).
- Each course need to be at least 5 credits (manually written validation).

## Model structure

![plant UML model](https://i.imgur.com/2qp510p.png)

## Sample
**Sample.xmi updated for assignment 3** 
The Sample.xmi file includes an example of a studyprogram with a specialization, 2 semesters and 7 courses. Some of the courses are mandatory and some are elective.

- Program: 2 year Msc Computer Science
  - Specialization: Software Development
    - Semester: Semester 1
      - SemesterCourse: _ELECTIVE_
        - Course: Advanced Software Design
      - SemesterCourse: _ELECTIVE_
        - Course: Graphical User Interface
      - SemesterCourse: _MANDATORY_
        - Course: Introduction to Artificial Intelligence
      - SemesterCourse: _MANDATORY_
        - Course: Information Systems
    - Semester: Semester 2
      - SemesterCourse: _ELECTIVE_
        - Course: Information Security
      - SemesterCourse: _ELECTIVE_
        - Course: Advanced Software Enginering
      - SemesterCourse: _ELECTIVE_
        - Course: Software Architecture

## Model impovements for assignment 3

- Add a top level object i.e. Institute where courses are contained
- Add a datatype for spring/fall in semesters
- Remove numbers from courses
- Rename "code" attributes
