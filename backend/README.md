# AlVin


Kjør database lokalt 
docker run --name alvin-db \
-e POSTGRES_USER=alvin \
-e POSTGRES_PASSWORD=alvin \
-e POSTGRES_DB=alvin \
-p 5432:5432 \
-d postgres:16