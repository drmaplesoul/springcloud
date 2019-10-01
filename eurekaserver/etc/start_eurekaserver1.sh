servername=eurekaserver1
echo "-Dspring.profiles.active="$servername
java -Dspring.profiles.active=$servername -jar ../target/eurekaserver-0.0.1-SNAPSHOT.jar>>../logs/$servername/app.log 2>&1 &
