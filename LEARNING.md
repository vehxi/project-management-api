# Что я узнал

## GET /hello

Когда в адресной строке браузера я перехожу по адресу `localhost:8080/hello`, браузер отправляет HTTP-запрос `GET /hello` на Spring Boot-приложение.

Spring получает этот запрос, находит метод, помеченный аннотацией `GetMapping("/hello")`, и вызывает его. Метод возвращает строчку `Hello!`, после чего Spring формирует HTTP-ответ и отправляет его обратно браузеру.

Браузер получает ответ и отображает `Hello!` на странице.

В данном случае endpoint – это `GET /hello`.

`@GetMapping("/hello")` – это своего рода инструкция для Spring, которая говорит: если придёт `GET /hello`, используй метод под этой аннотацией – `hello()`.

```java
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
```

## ## GET /hello/{name}

Научился передавать значение прямо в пути URL.

Например, при запросе `GET /hello/Alex` Spring сопоставляет значение `Alex` с `{name}` из `@GetMapping("/hello/{name}")`.

Аннотация `@PathVariable` позволяет получить это значение из URL и передать его в параметр Java-метода.

```java
@GetMapping("/hello/{name}")
    public String helloByName(@PathVariable String name) {
        return "Hello!, " + name + "!";
    }
```
