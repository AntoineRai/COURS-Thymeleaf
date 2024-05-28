CREATE TABLE Absence (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         date_Of_Absence DATE NOT NULL
);

CREATE TABLE Candidate (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           identification VARCHAR(255) NOT NULL,
                           address VARCHAR(255) NOT NULL,
                           date_Of_Birth DATE NOT NULL,
                           mail VARCHAR(255) NOT NULL,
                           phone VARCHAR(255) NOT NULL,
                           domain VARCHAR(255) NOT NULL,
                           evaluation INT NOT NULL,
                           date_Of_Interview DATE NOT NULL,
                           observation VARCHAR(255) NOT NULL
);

CREATE TABLE Vacation (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          start_Date DATE NOT NULL,
                          end_Date DATE NOT NULL
);

CREATE TABLE Employee (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          identification VARCHAR(255) NOT NULL,
                          address VARCHAR(255) NOT NULL,
                          date_Of_Birth DATE NOT NULL,
                          mail VARCHAR(255) NOT NULL,
                          phone VARCHAR(255) NOT NULL,
                          start_Of_Contract DATE NOT NULL,
                          end_Of_Contract DATE NOT NULL,
                          job_Title VARCHAR(255) NOT NULL,
                          wage DOUBLE NOT NULL,
                          observation VARCHAR(255) NOT NULL,
                          id_vacation BIGINT,
                          id_absence BIGINT,
                          FOREIGN KEY (id_vacation) REFERENCES Vacation(id),
                          FOREIGN KEY (id_absence) REFERENCES Absence(id)
);

INSERT INTO Absence (date_Of_Absence) VALUES ('2024-05-01');
INSERT INTO Absence (date_Of_Absence) VALUES ('2024-05-15');

INSERT INTO Vacation (start_Date, end_Date) VALUES ('2024-07-01', '2024-07-15');
INSERT INTO Vacation (start_Date, end_Date) VALUES ('2024-08-10', '2024-08-20');

INSERT INTO Employee (name, identification, address, date_Of_Birth, mail, phone, start_Of_Contract, end_Of_Contract, job_Title, wage, observation, id_vacation, id_absence)
VALUES ('John Doe', '123456', '123 Main St', '1985-10-15', 'john.doe@example.com', '555-1234', '2024-05-01', '2024-12-31', 'Software Developer', 60000, 'No observations', NULL, 1);
INSERT INTO Employee (name, identification, address, date_Of_Birth, mail, phone, start_Of_Contract, end_Of_Contract, job_Title, wage, observation, id_vacation, id_absence)
VALUES ('Jane Smith', '987654', '456 Elm St', '1990-08-20', 'jane.smith@example.com', '555-5678', '2024-03-15', '2024-09-30', 'Project Manager', 80000, 'Good performance', 1, NULL);

INSERT INTO Candidate (name, identification, address, date_Of_Birth, mail, phone, domain, evaluation, date_Of_Interview, observation)
VALUES ('Alice Johnson', 'A123456', '789 Oak St', '1992-04-10', 'alice.johnson@example.com', '555-7890', 'Software Engineering', 85, '2024-05-10', 'Impressive technical skills');
INSERT INTO Candidate (name, identification, address, date_Of_Birth, mail, phone, domain, evaluation, date_Of_Interview, observation)
VALUES ('Bob Smith', 'B987654', '321 Maple St', '1995-11-25', 'bob.smith@example.com', '555-4321', 'Data Science', 78, '2024-05-15', 'Strong analytical abilities');

