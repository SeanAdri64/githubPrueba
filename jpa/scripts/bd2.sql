--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.2

-- Started on 2021-03-06 08:58:48

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE konrad_nuevas_tecnologias_20211;
--
-- TOC entry 2843 (class 1262 OID 17876)
-- Name: konrad_nuevas_tecnologias_20211; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE konrad_nuevas_tecnologias_20211 WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_United States.1252' LC_CTYPE = 'Spanish_United States.1252';


ALTER DATABASE konrad_nuevas_tecnologias_20211 OWNER TO postgres;

\connect konrad_nuevas_tecnologias_20211

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 17877)
-- Name: ciudad; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ciudad (
    id integer NOT NULL,
    nombre character varying(100) NOT NULL
);


ALTER TABLE public.ciudad OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 17906)
-- Name: ciudad_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.ciudad ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.ciudad_id_seq
    START WITH 4
    INCREMENT BY 1
    MINVALUE 4
    MAXVALUE 100000
    CACHE 1
);


--
-- TOC entry 203 (class 1259 OID 17882)
-- Name: persona; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.persona (
    id integer NOT NULL,
    nombres character varying(120) NOT NULL,
    apellidos character varying(120) NOT NULL,
    tipo_documento integer,
    documento character varying(9) NOT NULL,
    fecha_nacimiento date,
    ciudad_nacimiento integer
);


ALTER TABLE public.persona OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 17904)
-- Name: persona_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.persona ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.persona_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 1000000
    CACHE 1
);


--
-- TOC entry 204 (class 1259 OID 17887)
-- Name: tipo_documento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tipo_documento (
    id integer NOT NULL,
    nombre character varying(20) NOT NULL,
    sigla character varying(3)
);


ALTER TABLE public.tipo_documento OWNER TO postgres;

--
-- TOC entry 2833 (class 0 OID 17877)
-- Dependencies: 202
-- Data for Name: ciudad; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.ciudad (id, nombre) OVERRIDING SYSTEM VALUE VALUES (1, 'BOGOTA');
INSERT INTO public.ciudad (id, nombre) OVERRIDING SYSTEM VALUE VALUES (2, 'MEDELLIN');
INSERT INTO public.ciudad (id, nombre) OVERRIDING SYSTEM VALUE VALUES (3, 'CALI');
INSERT INTO public.ciudad (id, nombre) OVERRIDING SYSTEM VALUE VALUES (4, 'CUCUTA');


--
-- TOC entry 2834 (class 0 OID 17882)
-- Dependencies: 203
-- Data for Name: persona; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.persona (id, nombres, apellidos, tipo_documento, documento, fecha_nacimiento, ciudad_nacimiento) OVERRIDING SYSTEM VALUE VALUES (1, 'CARLOS', 'LOPEZ', 1, '987654321', NULL, NULL);
INSERT INTO public.persona (id, nombres, apellidos, tipo_documento, documento, fecha_nacimiento, ciudad_nacimiento) OVERRIDING SYSTEM VALUE VALUES (2, 'PEPITO', 'PEREZ', 2, '8456279', NULL, 1);


--
-- TOC entry 2835 (class 0 OID 17887)
-- Dependencies: 204
-- Data for Name: tipo_documento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tipo_documento (id, nombre, sigla) VALUES (1, 'CEDULA CIUDADANIA', 'CC');
INSERT INTO public.tipo_documento (id, nombre, sigla) VALUES (2, 'TARJETA DE IDENTIDAD', 'TI');
INSERT INTO public.tipo_documento (id, nombre, sigla) VALUES (3, 'CEDULA EXTRANJERIA', 'CE');


--
-- TOC entry 2844 (class 0 OID 0)
-- Dependencies: 206
-- Name: ciudad_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ciudad_id_seq', 4, true);


--
-- TOC entry 2845 (class 0 OID 0)
-- Dependencies: 205
-- Name: persona_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.persona_id_seq', 2, true);


--
-- TOC entry 2698 (class 2606 OID 17881)
-- Name: ciudad ciudad_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ciudad
    ADD CONSTRAINT ciudad_pkey PRIMARY KEY (id);


--
-- TOC entry 2702 (class 2606 OID 17886)
-- Name: persona persona_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.persona
    ADD CONSTRAINT persona_pkey PRIMARY KEY (id);


--
-- TOC entry 2704 (class 2606 OID 17891)
-- Name: tipo_documento tipo_documento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_documento
    ADD CONSTRAINT tipo_documento_pkey PRIMARY KEY (id);


--
-- TOC entry 2699 (class 1259 OID 17897)
-- Name: fki_fk_ciudad; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_ciudad ON public.persona USING btree (ciudad_nacimiento);


--
-- TOC entry 2700 (class 1259 OID 17903)
-- Name: fki_fk_tipo_documento; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_tipo_documento ON public.persona USING btree (tipo_documento);


--
-- TOC entry 2705 (class 2606 OID 17892)
-- Name: persona fk_ciudad; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.persona
    ADD CONSTRAINT fk_ciudad FOREIGN KEY (ciudad_nacimiento) REFERENCES public.ciudad(id) NOT VALID;


--
-- TOC entry 2706 (class 2606 OID 17898)
-- Name: persona fk_tipo_documento; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.persona
    ADD CONSTRAINT fk_tipo_documento FOREIGN KEY (tipo_documento) REFERENCES public.tipo_documento(id) NOT VALID;


-- Completed on 2021-03-06 08:58:48

--
-- PostgreSQL database dump complete
--

