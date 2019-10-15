cd $(dirname $0)
#./build.sh
container="eve"
docker rm -f "$container"
docker run --link mongo:mongo -p 5005:5000 --name "$container" mike/eve:1.0
sleep 3
docker logs "$container"
docker ps