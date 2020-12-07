# SauseLabs

## set nup environment : Maven + JUnit Jupiter + Cucumber 
1. setup JUnit Jupiter
2. brew install maven
3. implement log4j
4. pugIn Cucumber

=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-
1. [Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/)
run by terminal:
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=6.8.1"               \
   "-DgroupId=hellocucumber"                  \
   "-DartifactId=hellocucumber"               \
   "-Dpackage=hellocucumber"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"
