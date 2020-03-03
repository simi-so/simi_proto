
/*
 * Skript fuer die initialisierung des Prototyps mit sinnvollen Testdaten fuer die Entitaeten 
 * - Productset
 * - Facadelayer
 * - DataSet
 * 
 * ACHTUNG: Loescht alle vorherig enthaltenen Daten
 * */


-- delete statements
DELETE FROM public.simi_dataset_list_properties;
DELETE FROM public.simi_single_actor_list_properties;
DELETE FROM public.simi_postgres_ds;
DELETE FROM public.simi_single_actor;
DELETE FROM public.simi_product_set;
DELETE FROM public.simi_data_product;

WITH 

-- Helper cte for the meta attributes
meta AS (
	SELECT 
		1 AS "version",
		'admin' AS created_by,
		now() AS  create_ts, 
		now() AS update_ts
	FROM 
		generate_series(1,1) 
),

-- dataset cte's
ds_stfv_1 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.afu.gefahrenhinweiskarte_stfv.betriebe' AS identifier,
		'Stoerfallverordnung - Betriebe' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'betriebe' AS tablename,
		FALSE AS in_data_services,
		30 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_stfv_2 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.afu.gefahrenhinweiskarte_stfv.eisenbahn' AS identifier,
		'Stoerfallverordnung - Eisenbahn' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'eisenbahn' AS tablename,
		FALSE AS in_data_services,
		0 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_stfv_3 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.afu.gefahrenhinweiskarte_stfv.durchgangsstrassen' AS identifier,
		'Stoerfallverordnung - Durchgangsstrassen' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'durchgangsstrassen' AS tablename,
		FALSE AS in_data_services,
		50 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_stfv_4 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.afu.gefahrenhinweiskarte_stfv.gasleitungen' AS identifier,
		'Stoerfallverordnung - Gasleitungen' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'gasleitungen' AS tablename,
		FALSE AS in_data_services,
		0 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_stfv_5 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.afu.gefahrenhinweiskarte_stfv.nationalstrassen' AS identifier,
		'Stoerfallverordnung - Nationalstrassen' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'nationalstrassen' AS tablename,
		TRUE AS in_data_services,
		0 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_agglo_1 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.arp.aggloprogramme.umsetzungsstand_punkt' AS identifier,
		'Umsetzungsstand Punkt (Aggloprogramme)' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'agglo_stand_punkt' AS tablename,
		FALSE AS in_data_services,
		0 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_agglo_2 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.arp.aggloprogramme.umsetzungsstand_linie' AS identifier,
		'Umsetzungsstand Linie (Aggloprogramme)' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'agglo_stand_linie' AS tablename,
		FALSE AS in_data_services,
		30 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_agglo_3 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.arp.aggloprogramme.umsetzungsstand_flaeche' AS identifier,
		'Umsetzungsstand Flaeche (Aggloprogramme)' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'agglo_stand_flaeche' AS tablename,
		TRUE AS in_data_services,
		20 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds_agglo_4 AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.arp.aggloprogramme.uebersicht' AS identifier,
		'Agglomerationsprogramme-Uebersicht' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_PostgresDS' as dtype,
		'agglo_uebersicht' AS tablename,
		TRUE AS in_data_services,
		20 AS def_transparency
	FROM 
		generate_series(1,1)
),

ds AS (
	SELECT ds_stfv_1.*, meta.* FROM ds_stfv_1, meta
	UNION ALL 
	SELECT ds_stfv_2.*, meta.* FROM ds_stfv_2, meta
	UNION ALL 
	SELECT ds_stfv_3.*, meta.* FROM ds_stfv_3, meta
	UNION ALL 
	SELECT ds_stfv_4.*, meta.* FROM ds_stfv_4, meta
	UNION ALL 
	SELECT ds_stfv_5.*, meta.* FROM ds_stfv_5, meta
	UNION ALL 
	SELECT ds_agglo_1.*, meta.* FROM ds_agglo_1, meta
	UNION ALL 
	SELECT ds_agglo_2.*, meta.* FROM ds_agglo_2, meta 
	UNION ALL 
	SELECT ds_agglo_3.*, meta.* FROM ds_agglo_3, meta
	UNION ALL 
	SELECT ds_agglo_4.*, meta.* FROM ds_agglo_4, meta
),

-- facadelayer cte's
fl_agglo AS (
	SELECT 
		uuid_generate_v4() AS id,
		'ch.so.arp.aggloprogramme.umsetzungsstand' AS identifier,
		'Umsetzungsstand (Agglomerationsprogramm)' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_FacadeLayer' as dtype
	FROM 
		generate_series(1,1)
),

fl_stfv AS (
	SELECT 	
		uuid_generate_v4() AS id,
		'ch.so.afu.gefahrenhinweiskarte_stfv' AS identifier,
		'Stoerfallverordnung' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_FacadeLayer' as dtype
	FROM 
		generate_series(1,1)
),


fl AS (
	SELECT fl_agglo.*, meta.* FROM fl_agglo, meta
	UNION ALL 
	SELECT fl_stfv.*, meta.* FROM fl_stfv, meta
),

-- productset cte's
ps_agglo AS (
	SELECT 
		uuid_generate_v4() AS id,
		'ch.so.arp.aggloprogramme' AS identifier,
		'Agglomerationsprogramm' AS title,
		TRUE as in_wgc,
		'lorem ipsum' as remarks,
		'simi_ProductSet' as dtype
	FROM 
		generate_series(1,1)
),

ps AS (
	SELECT ps_agglo.*, meta.* FROM ps_agglo, meta
),

-- dataset list properties cte's
dslist_agglo_fs AS ( -- agglomerationsprogramme facadelayer. Also copying the meta attributes from the facadelayer
	SELECT
		id AS facadelayer_id,		
		
		version, 
		created_by, 
		create_ts, 
		update_ts
	FROM 
		fl 
	WHERE 
		identifier LIKE 'ch.so.arp.aggloprogramme%'
),

dslist_agglo AS (
	SELECT
		uuid_generate_v4() AS id,
		id AS dataset_id,
		TRUE AS visible,
		(ROW_NUMBER() OVER()) * 10 AS sort,
		30 AS transparency,		
		dslist_agglo_fs.*
	FROM
		ds
	CROSS JOIN dslist_agglo_fs
	WHERE 
		ds.identifier LIKE 'ch.so.arp.aggloprogramme%'
),

dslist_stfv_fs AS ( -- stoerfallverordnung facadelayer. Also copying the meta attributes from the facadelayer
	SELECT
		id AS facadelayer_id,		
		
		version, 
		created_by, 
		create_ts, 
		update_ts
	FROM 
		fl 
	WHERE 
		identifier LIKE 'ch.so.afu.gefahrenhinweiskarte_stfv%'
),

dslist_stfv AS (
	SELECT
		uuid_generate_v4() AS id,
		id AS dataset_id,
		TRUE AS visible,
		(ROW_NUMBER() OVER()) * 10 AS sort,
		30 AS transparency,
		dslist_stfv_fs.*
	FROM
		ds
	CROSS JOIN dslist_stfv_fs
	WHERE 
		ds.identifier LIKE 'ch.so.afu.gefahrenhinweiskarte_stfv%'
),

dslist AS (
	SELECT * FROM dslist_stfv
	UNION ALL 
	SELECT * FROM dslist_agglo
),

-- singleactor list properties
salist_agglo_ps AS (
	SELECT
		id AS productset_id,	
		version, 
		created_by, 
		create_ts, 
		update_ts
	FROM 
		ps 
	WHERE 
		identifier LIKE 'ch.so.arp.aggloprogramme%'
),

salist_agglo_sa_ids AS (
	SELECT id FROM ds WHERE identifier = 'ch.so.arp.aggloprogramme.uebersicht'
	UNION ALL 
	SELECT id FROM fl WHERE identifier = 'ch.so.arp.aggloprogramme.umsetzungsstand'
),

salist AS ( -- salist = salist_agglo, da es nur fuer as Aggloprogramm ein PS gibt
	SELECT
		uuid_generate_v4() AS id,
		id AS singleactor_id,
		TRUE AS visible,
		(ROW_NUMBER() OVER()) * 10 AS sort,
		30 AS transparency,
		salist_agglo_ps.*
	FROM
		salist_agglo_sa_ids
	CROSS JOIN salist_agglo_ps
),

-- Insert statements for the datasets into the tables of the inheritance tree  
i_ds_pds AS (
	INSERT INTO public.simi_postgres_ds(id, tablename, in_data_services, def_transparency)
		SELECT id, tablename, in_data_services, def_transparency FROM ds
),

i_ds_sa AS (
	INSERT INTO public.simi_single_actor(id, identifier) 
		SELECT id, identifier FROM ds
),

i_ds_dp AS (
	INSERT INTO public.simi_data_product(id, in_wgc, title, remarks, version, created_by, create_ts, update_ts) 
		SELECT id, in_wgc, title, remarks, version, created_by, create_ts, update_ts FROM ds
),

-- Insert statements for the facadelayers into the tables of the inheritance tree 
i_fl_fl AS (
	INSERT INTO public.simi_facade_layer(id)
		SELECT id FROM fl
),

i_fl_sa AS (
	INSERT INTO public.simi_single_actor(id, identifier) 
		SELECT id, identifier FROM fl
),

i_fl_dp AS (
	INSERT INTO public.simi_data_product(id, in_wgc, title, remarks, version, created_by, create_ts, update_ts) 
		SELECT id, in_wgc, title, remarks, version, created_by, create_ts, update_ts FROM fl
),

-- Insert statements for the productsets into the tables of the inheritance tree 
i_ps_ps AS (
	INSERT INTO public.simi_product_set(id, identifier) 
		SELECT id, identifier FROM ps
),

i_ps_dp AS (
	INSERT INTO public.simi_data_product(id, in_wgc, title, remarks, version, created_by, create_ts, update_ts) 
		SELECT id, in_wgc, title, remarks, version, created_by, create_ts, update_ts FROM ps
),

-- Insert statements for the dataset properties list
i_dslist AS (
	INSERT INTO public.simi_dataset_list_properties(id, facadelayer_id, dataset_id, visible, sort, transparency,
			version, created_by, create_ts, update_ts)
		SELECT id, facadelayer_id, dataset_id, visible, sort, transparency,
			version, created_by, create_ts, update_ts
		FROM dslist
),

-- Insert statements for the singleactor properties list
i_salist AS (
	INSERT INTO public.simi_single_actor_list_properties(id, productset_id, singleactor_id, visible, sort, transparency,
			version, created_by, create_ts, update_ts)
		SELECT id, productset_id, singleactor_id, visible, sort, transparency,
			version, created_by, create_ts, update_ts
		FROM salist
)


SELECT count(*) AS insert_count, 'PostgresDS' as entity FROM ds
UNION ALL 
SELECT count(*) AS insert_count, 'Facadelayer' as entity FROM fl
UNION ALL 
SELECT count(*) AS insert_count, 'ProductSet' as entity FROM ps
UNION ALL 
SELECT count(*) AS insert_count, 'DatasetListProperties' as entity FROM dslist
UNION ALL 
SELECT count(*) AS insert_count, 'SingleActorListProperties' as entity FROM salist
;
