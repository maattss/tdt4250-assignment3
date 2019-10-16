# TDT4250 - Advanced Software Engineering - Assignment 1

## Content

Study plan (program) with semesters, courses and specializations.
A program includes multiple semesters with optional specializations (single or multiple).
Every courses included in a semester can be mandatory or elective.

## Constraints

- Each semester can contain courses summarizing in a total of 30 credits (validated using OCL).
- Each course need to be at least 5 credits (manually written validation).

## Model structure
![plant UML model](https://i.imgur.com/q3alEsn.png)

## Sample
The Samle.xmi describes two studyprograms from the Department of Computer Science, 
Msc - 2 year - Computer Science (MIDT) and Msc - 2 year - Informatics (MSIT).
Each program include some specializations with semesters and courses associated with these.

## Model impovements for assignment 3

- Add a top level object i.e. Institute where courses are contained
- Add a datatype for spring/fall in semesters
- Remove numbers from courses
- Rename "code" attributes
