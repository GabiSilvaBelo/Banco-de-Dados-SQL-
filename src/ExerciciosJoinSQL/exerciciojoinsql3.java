package ExerciciosJoinSQL;

public class exerciciojoinsql3 {
	
	CREATE DATABASE db_farmacia_bem_estar;

	USE db_farmacia_bem_estar;

	CREATE TABLE tb_categorias (
	  id INT PRIMARY KEY AUTO_INCREMENT,
	  nome VARCHAR(255) NOT NULL,
	  descricao VARCHAR(255) NOT NULL
	);

	SELECT * FROM tb_categorias;

	CREATE TABLE tb_produtos (
	  id INT PRIMARY KEY AUTO_INCREMENT,
	  nome VARCHAR(255) NOT NULL,
	  preco DECIMAL(10,2) NOT NULL,
	  quantidade INT NOT NULL,
	  descricao VARCHAR(255) NOT NULL,
	  categoria_id INT NOT NULL,
	  FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
	);

	SELECT * FROM tb_produtos;

	INSERT INTO tb_categorias (nome, descricao) VALUES
	('Remédios', 'Produtos para fins médicos'),
	('Cosméticos', 'Produtos para cuidados pessoais e beleza'),
	('Vitaminas e Suplementos', 'Produtos para suporte nutricional'),
	('Infantil', 'Produtos para bebês e crianças'),
	('Dispositivos médicos', 'Produtos para diagnóstico, monitoramento e tratamento médico');

	SELECT * FROM tb_categorias;

	INSERT INTO tb_produtos (nome, preco, quantidade, descricao, categoria_id) VALUES
	('Advil', 10.99, 50, 'Analgésico e antitérmico', 1),
	('Hidratante Neutrogena', 29.99, 20, 'Hidratante sem óleo com FPS 35', 2),
	('Multivitaminico Centrum', 15.49, 30, 'Multivitamínico diário completo para adultos', 3),
	('Shampoo Johnson\'s Baby', 7.99, 40, 'Fórmula No More Tears para uma limpeza suave', 4),
	('Monitor de Glicemia', 59.99, 10, 'Para monitorar os níveis de glicose no sangue', 5),
	('Eno Antiácido', 6.99, 50, 'Antiácido para azia e indigestão', 1),
	('Vaselina Lip Therapy', 2.49, 100, 'Hidrata e protege os lábios secos e desidratados', 2),
	('Fórmula Infantil Nanlac', 26.99, 12, 'Fórmula alimentícia infantil', 4);

	SELECT * FROM tb_produtos;

	SELECT * FROM tb_produtos WHERE preco > 50.00;

	SELECT * FROM tb_produtos WHERE preco BETWEEN 5.00 AND 60.00;

	SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

	SELECT tb_produtos.*, tb_categorias.nome AS categoria_nome 
	FROM tb_produtos 
	INNER JOIN tb_categorias ON tb_produtos.categoria_id = tb_categorias.id;

	SELECT tb_produtos.*, tb_categorias.nome AS categoria_nome 
	FROM tb_produtos 
	INNER JOIN tb_categorias ON tb_produtos.categoria_id = tb_categorias.id
	WHERE tb_categorias.nome = 'Cosméticos';




}
