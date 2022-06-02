mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
	-Dmaven.test.skip=true \
  -Dsonar.projectKey=ufba-poo-2022-1_equipe1 \
	-Dsonar.organization=ufba-poo-2022-1 \
	-Dsonar.host.url=https://sonarcloud.io
