
# ZLogger

Simple Java LOG(GER, "made with ❤️ by ZCode");


## How to start?

### Add dependency

#### Maven
```java
<repository>
</repository>

<dependency>
[//]: <> (    <groupId>net.zcode</groupId>
    <artifactId>zlogger</artifactId>
    <version>1.0.1</version> )
</dependency>
```

#### Gradle
```java [//]: <> (
implementation("net.zcode:zlogger:1.0.1") )
```

#### Or add .jar file
```
Download from: xx
```
## Usage/Examples

```java
import net.zcode.zlogger.ZLogger;
import net.zcode.zlogger.enums.Types;

public class MyNiceClass {
    public static void main(String[] args) {
        ZLogger.LOG(Types.Code.INFO, "This is information!");
        ZLogger.LOG(Types.Code.ERROR, "This is error!");
        ZLogger.LOG(Types.Code.SUCCESS, "This is success!");
        ZLogger.LOG(Types.Code.OTHER, "This is other!");
    }
}
```
## Settings file

Logger creating settings file with:

`save-to-file` option

`save-to-database` option

`save-to-website` option (closed beta)

`api-key`

If you want to use any option - set it to true else set it to false.
[//]: <> (## Checking for Updates

#### Get version

```http
GET zcode.net/api/zlogger/version
```
## Save logs on  our server

#### Get saved logs

```http
GET zcode.net/api/zlogger/saved-logs/{api_key}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

It's save only 10x logs.

)

## Screenshots

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Authors

- [@rettyz](https://www.github.com/rettyz)
