DROP TABLE IF EXISTS etalp;
CREATE TABLE etalp(
	nump INT PRIMARY KEY,
    surfp FLOAT,
    numzone INT  
);
DROP TABLE IF EXISTS etals;
CREATE TABLE etals(
    nums INT PRIMARY KEY,
    surfs FLOAT,
    nbjours INT
);