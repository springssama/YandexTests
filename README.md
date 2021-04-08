Yandex Tests
===

Для запуска проекта необходимо установить `maven` и `allure`
- https://maven.apache.org
- https://docs.qameta.io/allure/

Список тестов
---

- `UserCanSearchPropelleradsWithYandex` - тест проверяет, что пользователь найдет Пропеллерадс в Яндексе

Запуск
---

- `mvn clean test` - запуск тестов
- `allure serve target/allure-results/` - предоставление отчета
