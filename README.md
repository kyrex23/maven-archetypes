<h1 align=center>⚙️ CUSTOM MAVEN ARCHETYPES ⚙️</h1>

You can use `maven` to create new projects based on an existing `archetype` (template).

## ❓ How to create new archetypes

To create a new `archetype`, you need a project with the following directory structure:
```
archetype_project/
|__ src/main/resources/
|   |__ META-INF/
|   |   |__ maven/
|   |       |__ archetype-metadata.xml
|   |__ archetype-resources/
|       |__...
|__ pom.xml
```

Then, you can create and store the new archetype within your local repository to generate projects based on it.
```sh
mvn install                  # Create archetype within your local maven repository
mvn archetype:generate [...] # Create a new project using the archetype
```

---


## 📑 Collection of arquetypes

### ➡️ [Arquetype]: vertx-lombok

The `vertx-lombok` archetype allows you to create projects with the following dependencies:
- `vertx`
- `rxjava3`
- `lombok`
- `slf4j-logback`

<details>
<summary>Archetype usage:</summary>

```bash
mvn archetype:generate \
-DarchetypeGroupId=org.kyrex.archetypes \
-DarchetypeArtifactId=vertx-lombok \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=my.group.id \
-DartifactId=my-new-artifact \
-Dversion=my-version \
-Dpackage=my.package
# -Dversion is optional (default value: 0.0.1-SNAPSHOT)
# -Dpackage is optional (default value: my.group.id)
```

</details>

<details>
<summary>Archetype result:</summary>

```
my-new-artifact/
|__ src/main/
|   |__ java/my/package/
|   |   |__ handlers/
|   |   |   |__ DemoHandler.java
|   |   |__ verticles/
|   |   |   |__ MainVerticle.java
|   |   |__ VertxTest.java
|   |__ resources/
|       |__ logback.xml
|__ .gitignore
|__ .editorconfig
|__ pom.xml
```

</details>

---

### ➡️ [Arquetype]: spark-simple

The `spark-simple` archetype allows you to create projects with the following dependencies:
- `sparkjava`
- `slf4j-simple`

<details>
<summary>Archetype usage:</summary>

```bash
mvn archetype:generate \
-DarchetypeGroupId=org.kyrex.archetypes \
-DarchetypeArtifactId=spark-simple \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=my.group.id \
-DartifactId=my-new-artifact \
-Dversion=my-version \
-Dpackage=my.package
# -Dversion is optional (default value: 0.0.1-SNAPSHOT)
# -Dpackage is optional (default value: my.group.id)
```

</details>

<details>
<summary>Archetype result:</summary>

```
my-new-artifact/
|__ src/main/
|   |__ java/my/package/
|   |   |__ SparkTest.java
|   |__ resources/
|       |__ simplelogger.properties
|__ .gitignore
|__ .editorconfig
|__ pom.xml
```

</details>

---

### ➡️ [Arquetype]: lombok-simple

The `lombok-simple` archetype allows you to create projects with the following dependencies:
- `lombok`
- `slf4j-simple`

<details>
<summary>Archetype usage:</summary>

```bash
mvn archetype:generate \
-DarchetypeGroupId=org.kyrex.archetypes \
-DarchetypeArtifactId=lombok-simple \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=my.group.id \
-DartifactId=my-new-artifact \
-Dversion=my-version \
-Dpackage=my.package
# -Dversion is optional (default value: 0.0.1-SNAPSHOT)
# -Dpackage is optional (default value: my.group.id)
```

</details>

<details>
<summary>Archetype result:</summary>

```
my-new-artifact/
|__ src/main/
|   |__ java/my/package/
|   |   |__ LombokTest.java
|   |__ resources/
|       |__ simplelogger.properties
|__ .gitignore
|__ .editorconfig
|__ pom.xml
```

</details>

---

### ➡️ [Arquetype]: javafx-lombok-simple

The `javafx-lombok-simple` archetype allows you to create projects with the following dependencies:
- `javafx`
- `lombok`
- `slf4j-simple`

<details>
<summary>Archetype usage:</summary>

```bash
mvn archetype:generate \
-DarchetypeGroupId=org.kyrex.archetypes \
-DarchetypeArtifactId=javafx-lombok-simple \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=my.group.id \
-DartifactId=my-new-artifact \
-Dversion=my-version \
-Dpackage=my.package
# -Dversion is optional (default value: 0.0.1-SNAPSHOT)
# -Dpackage is optional (default value: my.group.id)
```

</details>

<details>
<summary>Archetype result:</summary>

```
my-new-artifact/
|__ src/main/
|   |__ java/my/package/
|   |   |__ JavaFXTest.java
|   |__ resources/
|       |__ fxml/
|       |   |__ javafx_test.fxml
|       |__ simplelogger.properties
|__ .gitignore
|__ .editorconfig
|__ pom.xml
```

</details>
