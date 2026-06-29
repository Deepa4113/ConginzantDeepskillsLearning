-- Hands-on 1: Spring Data JPA - Quick Example
-- Run this in MySQL client / Workbench against the ormlearn schema

CREATE SCHEMA IF NOT EXISTS ormlearn;
USE ormlearn;

CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');
