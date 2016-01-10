FROM java:7
COPY . /opt/java-app
WORKDIR /opt/java-app
RUN mkdir bin
RUN javac -d bin src/HelloDocker.java
RUN echo "Redundant layer" > /tmp/whatevz
EXPOSE 80 
ENTRYPOINT ["java","-cp","bin","HelloDocker"] 
