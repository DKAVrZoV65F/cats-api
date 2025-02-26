./gradlew clean build
docker build . -t xixajzlelshii76bhcr0zztas1k4ja/cats-api:1.0.0
docker push xixajzlelshii76bhcr0zztas1k4ja/cats-api:1.0.0

# docker run -it --rm -e DATASOURCE_HOST=192.168.55.104 -p 8081:8080 xixajzlelshii76bhcr0zztas1k4ja/cats-api:1.0.0