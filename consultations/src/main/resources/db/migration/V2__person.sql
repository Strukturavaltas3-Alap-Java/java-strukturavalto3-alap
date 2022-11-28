CREATE TABLE person (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name_of_person VARCHAR(255),
	date_of_birth DATE,
	height INT,
	weight DOUBLE,
	gender VARCHAR(6),
	PRIMARY KEY(id)
);