CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classes (
    id INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

-- Inserção de Classes
INSERT INTO tb_classes (nome, tipo) VALUES
("Guerreiro", "Melee"),
("Mago", "Magico"),
("Arqueiro", "Ranged");

-- Criação da Tabela tb_personagens
CREATE TABLE tb_personagens (
    id INT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    nivel INT NOT NULL,
    poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    classe_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (classe_id) REFERENCES tb_classes(id)
);

-- Inserção de Personagens
INSERT INTO tb_personagens (nome, nivel, poder_ataque, poder_defesa, classe_id) VALUES
("Herói1", 10, 2500, 1200, 1),
("Mago1", 8, 1800, 800, 2),
("Arqueiro1", 12, 3000, 1500, 3),
("Herói2", 15, 3500, 2000, 1),
("Arqueiro2", 9, 2000, 1200, 3),
("Mago2", 11, 2200, 1000, 2),
("Herói3", 14, 3200, 1800, 1),
("Arqueiro3", 10, 2400, 1300, 3);

-- Seleção de Personagens com poder de ataque maior que 2000
SELECT * FROM tb_personagens WHERE poder_ataque > 2000;

-- Seleção de Personagens com poder de defesa entre 1000 e 2000
SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 1000 AND 2000;

-- Seleção de Personagens com a letra C no nome
SELECT * FROM tb_personagens WHERE nome LIKE "%C%";

-- INNER JOIN entre tb_personagens e tb_classes
SELECT tb_personagens.nome, tb_personagens.nivel, tb_personagens.poder_ataque, tb_personagens.poder_defesa, tb_classes.nome as classe
FROM tb_personagens 
INNER JOIN tb_classes
ON tb_personagens.classe_id = tb_classes.id;

-- INNER JOIN com filtro por classe específica
SELECT tb_personagens.nome, tb_personagens.nivel, tb_personagens.poder_ataque, tb_personagens.poder_defesa, tb_classes.nome as classe
FROM tb_personagens 
INNER JOIN tb_classes
ON tb_personagens.classe_id = tb_classes.id
WHERE tb_classes.nome = "Arqueiro";