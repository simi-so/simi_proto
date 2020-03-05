alter table SIMI_PRODUCT_SET add column FOREGROUND boolean ^
update SIMI_PRODUCT_SET set FOREGROUND = false where FOREGROUND is null ;
alter table SIMI_PRODUCT_SET alter column FOREGROUND set not null ;
