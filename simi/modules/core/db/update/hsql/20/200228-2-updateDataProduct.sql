alter table SIMI_DATA_PRODUCT add column IDENTIFIER varchar(255) ^
update SIMI_DATA_PRODUCT set IDENTIFIER = '' where IDENTIFIER is null ;
alter table SIMI_DATA_PRODUCT alter column IDENTIFIER set not null ;
