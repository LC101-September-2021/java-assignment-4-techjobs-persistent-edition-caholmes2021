-- Part 1: Test it with SQL

-- Response in Job Table
-- --Column 1: Employer, Data Type: varchar(255)
-- --Column 2: id, Data type: int
-- --Column 3: name, Data Type: varchar(255)
-- --Column 4: skills, Data Type: varchar(255)

-- Sample Query to see table
SELECT * FROM job;

-- Sample Query to see columns and data types
SELECT COLUMN_NAME, DATA_TYPE, CHARACTER_MAXIMUM_LENGTH
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME = 'job';

-- Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "St. Louis City";

-- Part 3: Test it with SQL
-- Delete job table 
DROP TABLE job;

-- Part 4: Test it with SQL
SELECT *
FROM skill
LEFT JOIN job_skills 
ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;
