CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

-- Criação da Tabela de Categorias
CREATE TABLE tb_categorias(
    id bigint AUTO_INCREMENT,
    tipo varchar(200) not null,
    descricao varchar(200) not null,
    primary key (id)
);

-- Criação da Tabela de Produtos
CREATE TABLE tb_produtos(
    id bigint AUTO_INCREMENT,
    nome varchar(200) not null,
    dataValidade date not null,
    preco decimal(5,2) not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categorias(id)
);

-- Inserção de Categorias
INSERT INTO tb_categorias (tipo, descricao) VALUES ("Carnes", "Deliciosas Carnes");

-- Inserção de Produtos
INSERT INTO tb_produtos (nome, dataValidade, preco, categoria_id)
VALUES ("Carne de Boi", "2022-03-07", 49.99, 1);

INSERT INTO tb_produtos (nome, dataValidade, preco, categoria_id)
VALUES ("Frango", "2022-03-08", 5.00, 1);

INSERT INTO tb_produtos (nome, dataValidade, preco, categoria_id)
VALUES ("Costela de Porco", "2022-03-09", 60.00, 1);

-- Seleção de Categorias
SELECT * FROM tb_categorias;

-- Seleção de Produtos
SELECT * FROM tb_produtos;

-- Produtos com valor maior que R$ 50,00
SELECT * FROM tb_produtos WHERE preco > 50.00;

-- Produtos com valor entre R$ 50,00 e R$ 150,00
SELECT * FROM tb_produtos WHERE preco BETWEEN 50.00 AND 150.00;

-- Produtos com a letra D no nome
SELECT * FROM tb_produtos WHERE nome LIKE "%D%";

-- INNER JOIN entre tb_produtos e tb_categorias
SELECT nome, dataValidade, preco, tb_categorias.tipo as categoria
FROM tb_produtos 
INNER JOIN tb_categorias
ON tb_produtos.categoria_id = tb_categorias.id;

-- INNER JOIN com filtro por categoria específica
SELECT nome, tb_categorias.tipo as categoria
FROM tb_produtos 
INNER JOIN tb_categorias
ON tb_produtos.categoria_id = tb_categorias.id
WHERE tb_categorias.tipo = "Carnes";