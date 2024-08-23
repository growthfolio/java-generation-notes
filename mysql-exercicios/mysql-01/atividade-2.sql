CREATE DATABASE eCommerce;
USE eCommerce;

CREATE TABLE Produtos (
	id BIGINT AUTO_INCREMENT,
	nome VARCHAR(255)NOT NULL,
	descricao VARCHAR(255)NOT NULL,
	preco DECIMAL (10,2)NOT NULL,
	sku BIGINT NOT NULL,
	PRIMARY KEY (id)
);
-- Inserção de dados na tabela PRODUTOS
INSERT INTO Produtos (nome, descricao, preco, sku) VALUES
    ('Camiseta Básica', 'Camiseta de algodão em cores variadas', 29.99, 2021001),
    ('Tênis Esportivo', 'Tênis leve e confortável para atividades físicas', 89.99, 2021002),
    ('Smartphone Android', 'Modelo mais recente com câmera de alta resolução', 799.99, 2021003),
    ('Notebook Ultrabook', 'Notebook fino e leve com SSD de alta velocidade', 1299.99, 2021004),
    ('Fones de Ouvido Bluetooth', 'Fones sem fio com cancelamento de ruído', 149.99, 2021005),
    ('Panela Elétrica Multifuncional', 'Panela com diversas funções para cozinha prática', 79.99, 2021006),
    ('Livro: "O Poder do Hábito"', 'Best-seller sobre formação de hábitos', 19.99, 2021007),
    ('Cadeira de Escritório Ergonômica', 'Cadeira ajustável para máximo conforto', 199.99, 2021008),
    ('Máquina de Café Expresso', 'Prepara café de alta qualidade em poucos segundos', 299.99, 2021009),
    ('Mochila para Laptop', 'Mochila resistente com compartimento acolchoado para laptop', 49.99, 2021010),
    ('Relógio Inteligente', 'Monitora atividades físicas e notificações de smartphone', 129.99, 2021011),
    ('Câmera DSLR Profissional', 'Câmera para fotografia de alta resolução', 899.99, 2021012),
    ('Console de Videogame', 'Última geração com gráficos de alta qualidade', 399.99, 2021013),
    ('Ferro de Passar a Vapor', 'Ferro com tecnologia de vapor para roupas sem rugas', 39.99, 2021014);
-- Consultas por valor    
SELECT * FROM Produtos WHERE preco >500;
SELECT * FROM Produtos WHERE preco <500;
-- Atualização de preço do produto por ID
UPDATE Produtos
SET preco = 39.99
WHERE id = 1;
-- Atualização de preço e descrição do produto por ID
UPDATE Produtos
SET preco = 19.99, descricao = 'Promoção imperdivel, Camiseta de algodão'
WHERE id = 1;