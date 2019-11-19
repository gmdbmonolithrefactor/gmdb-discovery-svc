# gmdb-discovery-svc

## Build and Run in Docker

````
$ docker build -t gmdb/discovery .
$ docker run -d -p 8761:8761 --name gmdb-discovery --network gmdb-bridge gmdb/discovery
````






