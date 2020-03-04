alter table SIMI_SINGLE_ACTOR add column IDENTIFIER text ^
update SIMI_SINGLE_ACTOR set IDENTIFIER = '' where IDENTIFIER is null ;
alter table SIMI_SINGLE_ACTOR alter column IDENTIFIER set not null ;
