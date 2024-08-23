CREATE DATABASE escola;
USE escola;

CREATE TABLE Estudantes (
	id BIGINT AUTO_INCREMENT,
	nome VARCHAR(255)NOT NULL,
    nota DECIMAL (2,1)NOT NULL,
	serie VARCHAR(25)NOT NULL,
    turma VARCHAR(255)NOT NULL,
	PRIMARY KEY (id)
);
-- Inserção de dados na tabela ESTUDANTES
INSERT INTO Estudantes (nome, nota, serie, turma) VALUES
	('Maria Silva', 8.5, '9º ano', 'A'),
    ('João Oliveira', 7.2, '8º ano', 'B'),
    ('Ana Souza', 9.0, '10º ano', 'C'),
    ('Carlos Santos', 6.8, '7º ano', 'A'),
    ('Juliana Pereira', 9.5, '11º ano', 'B'),
    ('Pedro Costa', 8.0, '9º ano', 'C'),
    ('Luciana Lima', 7.7, '8º ano', 'A'),
    ('Fernando Rocha', 8.9, '10º ano', 'B');

SELECT * FROM estudantes WHERE nota > 7.0;
SELECT * FROM estudantes WHERE nota < 7.0;

UPDATE estudantes
set nota = 7
WHERE nome = "Carlos Santos";
