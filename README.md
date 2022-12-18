# scala-web-bloop-sbt-spring-thyme-single-node-elasticsearch-simple

## Description
A thyme springboot scala bloop-sbt build,
that connects to elasticsearch database single node cluster.

To create the `dog` collection we use a runner
to remotely issue `elasticsearch create_collection -c` to
node 1.

Zookeeper is used for replication across
the single node cluster.

Compiled and ran from build server `bloop`.

# Build note
Dependencies must be compatable with jdk8 or less.

## Tech stack
- bloop
- springboot
  - thymeleaf
- bloop-sbt
  - elasticsearch drivers
  - lombok
  - PostConstruct annotation
- bootstrap
- jquery
- dataTable
- zookeeper

## Docker stack
- elasticsearch:8.2
- zookeeper:3.5
- hseeberger/scala-bloop-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- [Available](http://localhost)
- [Node 1 elasticsearch webui](http://localhost:9200)

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- [Baeldung code](https://www.baeldung.com/spring-data-elasticsearch-tutorial)
- [Springboot Application Config](https://betterscalacode.com/programming/elasticsearch-spring-boot)
