# Spring Event and Listener
Spring Application Context가 생기기 전에 발생하는 event에 대한 처리 listener는 따로 .addListener 처리를 해줘야한다.<br>
Spring Application Context가 생긴 이후 발생하는 event에 대한 처리 listener는 @Component 어노테이션을 이용하여 Bean으로 등록하면 자동 처리된다.<br>
ArgumentChecker의 생성자에 시스템 arguments를 처리하도록 설정하면 Bean으로 등록 시 arguments에 대한 처리를 수행할 수 있다.
ApplicationRunner를 구현하면 Application started 된 이후 ApplicationRunner 구현체를 수행한다.<br>
이때 ApplicationRunner 구현체가 여러개라면 @Order(1) 의 순서에 의하여 실행 순서를 정할 수 있다.<br>
