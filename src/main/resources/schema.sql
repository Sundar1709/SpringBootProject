create table if not exists Run(
id INT Not NULL,
title varchar(250) not null,
started_on timestamp not null,
completed_on timestamp not null,
miles INT not null,
primary key(id));