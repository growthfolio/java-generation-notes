CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

-- Criação da tabela tb_categorias
CREATE TABLE tb_categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    tipo_pizza VARCHAR(20) NOT NULL,
    tipo_tamanho VARCHAR(20) NOT NULL
);

-- Criação da tabela tb_pizzas
CREATE TABLE tb_pizzas (
    id_pizza INT AUTO_INCREMENT PRIMARY KEY,
    nome_pizza VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    id_categoria INT,
    promo BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

-- Inserção de registros na tabela tb_categorias
INSERT INTO tb_categorias (tipo_pizza, tipo_tamanho) VALUES
('Calabresa', 'Grande'),
('Margherita', 'Média'),
('Frango com Catupiry', 'Grande'),
('Portuguesa', 'Média'),
('Quatro Queijos', 'Grande');

-- inserção de registros na tabela tb_pizzas
INSERT INTO tb_pizzas (nome_pizza, preco, id_categoria, promo) VALUES
('Calabresa', 59.90, 1, FALSE),
('Margherita', 39.90, 2, TRUE),
('Frango com Catupiry', 59.90, 3, FALSE),
('Portuguesa', 39.90, 4, TRUE),
('Quatro Queijos', 59.90, 5, FALSE),
('Pizza Teste 1', 49.90, 1, FALSE),
('Pizza Teste 2', 69.90, 2, TRUE),
('Pizza Teste 3', 79.90, 3, FALSE),
('Pizza Teste 4', 89.90, 4, TRUE);

-- SELECT que retorna todas as pizzas cujo valor seja maior do que R$ 45,00
SELECT * FROM tb_pizzas WHERE preco > 45.00;

-- SELECT que retorna todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100.00;

-- SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome
SELECT * FROM tb_pizzas WHERE nome_pizza LIKE '%M%';

-- SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias
SELECT tb_pizzas.*, tb_categorias.tipo_pizza, tb_categorias.tipo_tamanho
FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria;

-- SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias, onde traga apenas as pizzas que pertençam a uma categoria específica
SELECT tb_pizzas.*, tb_categorias.tipo_pizza, tb_categorias.tipo_tamanho
FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.tipo_pizza = 'Doce';

