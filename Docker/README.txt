1. С помощью вспомогательного приложения Boot2Docker устанавливаем виртуальную машину и запускаем Docker.

2. Переходим в нужную деррикторию 
cd /directory_with_dockerfile/

3. Создаем образ 
docker build -t hello-docker .

4. Создаем и запускаем контейнер из данного образа 
docker run --rm hello-docker