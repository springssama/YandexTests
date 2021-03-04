Yandex Tests
===

Для запуска проекта необходимо установить `maven` и `allure`
- https://maven.apache.org
- https://docs.qameta.io/allure/

Список тестов
---

- `UserCanSearchPropelleradsWithYandex` - тест проверяет, что пользователь найдет Пропеллерадс в Яндексе
- `UserCanOpenPropelleradsWithYandex` - тест проверяет, что пользователь откроет Пропеллерадс через Яндекс

Запуск
---

- `mvn clean test` - запуск тестов
- `allure serve target/allure-results/` - предоставление отчета
