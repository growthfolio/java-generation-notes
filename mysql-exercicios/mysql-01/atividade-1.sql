-- Criação do banco de dados db_rh_empresa
CREATE DATABASE db_rh_empresa;
USE db_rh_empresa;

-- Criação da tabela Funcionarios
CREATE TABLE  Funcionarios(
	id_cracha BIGINT AUTO_INCREMENT,
    nome VARCHAR(125) NOT NULL,
    cargo VARCHAR(40) NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    data_contratacao DATE NOT NULL,
    PRIMARY KEY (id_cracha)
);

-- Inserção de dados na tabela Funcionarios
INSERT INTO funcionarios(nome, cargo, salario, data_contratacao) VALUES
("Bryan","Motorista de corrida","1700.74", "2000-11-11"),
("Felipe Macedo","Gerente de TI","10000.74", "2023-01-29"),
("Gabriel Lima","Gerente de Sistemas","15000.74", "2022-11-21"),
("Brenão M","Gerente Geral","20000.74", "2021-11-30"),
("Igor R","Gerente de RHs","15000.74", "2022-11-21"),
("Carlos D","Gerente de Redes","17000.74", "2023-11-11");

-- Seleção de todos os registros da tabela Funcionarios
SELECT * FROM Funcionarios;

-- Seleção de registros da tabela Funcionarios onde o salário é menor que 2000
SELECT * FROM Funcionarios WHERE salario < 2000;

-- Seleção de registros da tabela Funcionarios onde o salário é maior que 2000
SELECT * FROM Funcionarios WHERE salario > 2000;

-- Atualização do salário na tabela Funcionarios onde o id_cracha é igual a 7
UPDATE funcionarios SET salario = 1850.99 WHERE id_cracha = 7;

-- Seleção de registros da tabela Funcionarios onde o id_cracha é igual a 7 após a atualização
SELECT * FROM funcionarios WHERE id_cracha = 7;
