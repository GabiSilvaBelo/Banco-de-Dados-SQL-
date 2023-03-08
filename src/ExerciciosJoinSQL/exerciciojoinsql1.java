package ExerciciosJoinSQL;

public class exerciciojoinsql1 {
	
	CREATE DATABASE db_generation_game_online;

	USE db_generation_game_online;

	CREATE TABLE tb_classes (
	    classe_id INT PRIMARY KEY,
	    nome_classe VARCHAR(255) NOT NULL,
	    classe_descricao VARCHAR(255)
	);

	CREATE TABLE tb_personagens (
	    personagem_id INT PRIMARY KEY,
	    nome_personagem VARCHAR(255) NOT NULL,
	    poder_ataque INT NOT NULL,
	    poder_defesa INT NOT NULL,
	    classe_id INT NOT NULL,
	    FOREIGN KEY (classe_id) REFERENCES tb_classes(classe_id)
	);

	INSERT INTO tb_classes (classe_id, nome_classe, classe_descricao) VALUES
	(1, 'Guerreiro', 'Um lutador forte e resistente'),
	(2, 'Arqueiro', 'Um habilidoso de longo alcance'),
	(3, 'Mago', 'Um poderoso mágico'),
	(4, 'Ladrão', 'Um patife sem vergonha'),
	(5, 'Paladino', 'Um cavaleiro sagrado');

	SELECT * FROM tb_classes;

	INSERT INTO tb_personagens (personagem_id, nome_personagem, poder_ataque, poder_defesa, classe_id) VALUES
	(1, 'Garen', 2500, 2000, 1),
	(2, 'Ashe', 1800, 1200, 2),
	(3, 'Katarina', 2200, 800, 4),
	(4, 'Sebastian', 2000, 1500, 3),
	(5, 'Varus', 1900, 1100, 2),
	(6, 'Ellie', 2800, 1800, 1),
	(7, 'LeBlanc', 1700, 900, 4),
	(8, 'Vayne', 2100, 1300, 2);

	SELECT * FROM tb_personagens;

	SELECT * FROM tb_personagens WHERE poder_ataque > 2000;

	SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 1000 AND 2000;

	SELECT * FROM tb_personagens WHERE nome_personagem LIKE '%C%';

	SELECT tb_personagens.*, tb_classes.nome_classe FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.classe_id;

	SELECT tb_personagens.*, tb_classes.nome_classe FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.classe_id WHERE tb_classes.nome_classe = 'Arqueiro';



}
