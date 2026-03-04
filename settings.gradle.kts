rootProject.name = "flowerinsnowlib"
include(
    "bom",
    "string",
    "array",
    "exception",
    "protocol",
    "jackson-databind-core",
    "jackson-databind-java8",
    "jackson-databind-java11",
    "objects-mutable-objects",
)
project(":objects-mutable-objects").projectDir = file("objects/mutable-objects")