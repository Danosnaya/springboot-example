
mvn  clean install -Dmaven.test.skip=true
cp target/example-1.0.jar ./Docker/example/example-1.0.jar
cd ./Docker/

docker-compose  up -d
