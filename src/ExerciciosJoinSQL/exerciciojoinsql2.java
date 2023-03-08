package ExerciciosJoinSQL;

public class exerciciojoinsql2 {
	
	CREATE DATABASE db_pizzaria_legal;

	USE db_pizzaria_legal;

	CREATE TABLE tb_categorias (
	  categoria_id INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(50) NOT NULL,
	  descricao VARCHAR(100),
	  PRIMARY KEY (categoria_id)
	);

	SELECT * FROM tb_categorias;

	CREATE TABLE tb_pizzas (
	  pizza_id INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(255) NOT NULL,
	  descricao VARCHAR(255),
	  valor DECIMAL(6,2) NOT NULL,
	  categoria_id INT NOT NULL,
	  PRIMARY KEY (pizza_id),
	  FOREIGN KEY (categoria_id) REFERENCES tb_categorias(categoria_id)
	);

	SELECT * FROM tb_pizzas;

	INSERT INTO tb_categorias (nome, descricao) VALUES
	  ('Salgadas', 'Pizzas com sabores salgados'),
	  ('Doces', 'Pizzas com sabores doces'),
	  ('Vegetarianas', 'Pizzas sem carne'),
	  ('Queijos', 'Pizzas com muitos tipos de queijos'),
	  ('Frutos do Mar', 'Pizzas com frutos do mar');

	SELECT * FROM tb_categorias;

	INSERT INTO tb_pizzas (nome, descricao, valor, categoria_id) VALUES
	  ('Calabresa', 'Mussarela, calabresa, cebola e azeitonas', 35.50, 1),
	  ('Portuguesa', 'Mussarela, presunto, ovos, cebola e azeitonas', 42.00, 1),
	  ('Mussarela', 'Mussarela e tomate', 30.00, 1),
	  ('Chocolate', 'Chocolate ao leite e granulado', 50.00, 2),
	  ('Banana', 'Banana, açúcar e canela', 35.00, 2),
	  ('Margherita', 'Mussarela, tomate e manjericão', 45.00, 1),
	  ('Quatro Queijos', 'Mussarela, provolone, gorgonzola e parmesão', 55.00, 4),
	  ('Frutos do Mar', 'Mussarela, camarão, lula, polvo e molho de tomate', 75.00, 5);
	  
	  SELECT * FROM tb_pizzas;

	SELECT * FROM tb_pizzas WHERE valor > 45.00;

	SELECT * FROM tb_pizzas WHERE valor BETWEEN 50.00 AND 100.00;

	SELECT * FROM tb_pizzas WHERE nome LIKE '%M%';

	SELECT tb_pizzas.nome, tb_pizzas.descricao, tb_pizzas.valor, tb_categorias.nome AS categoria
	FROM tb_pizzas
	INNER JOIN tb_categorias ON tb_pizzas.categoria_id = tb_categorias.categoria_id;

	SELECT tb_pizzas.nome, tb_pizzas.descricao, tb_pizzas.valor, tb_categorias.nome AS categoria
	FROM tb_pizzas
	INNER JOIN tb_categorias ON tb_pizzas.categoria_id = tb_categorias.categoria_id
	WHERE tb_categorias.nome = 'Doces';



}
