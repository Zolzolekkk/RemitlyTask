# RemitlyTask

Summer Internship Remitly Task

The task involves implementing a method to validate input JSON data conforming to the AWS IAM Role Policy format, particularly focusing on the Resource field. The method reads the input JSON, check if the Resource field contains a single asterisk, and return false in that case; otherwise, it returns true. This validation ensures that the input JSON adheres to expected criteria for AWS IAM Role policies.

Unit tests were created to cover possible edge cases and check if method returns correct values or throw exception if needed.

# Uruchamianie Projektu w terminalu
Aby uruchomić projekt, wykonaj następujące kroki:

## 1. Pobierz kod źródłowy: 
Sklonuj repozytorium na swój lokalny komputer używając polecenia git clone.

```console
git clone https://github.com/Zolzolekkk/RemitlyTask.git
```

## 2. Przejdź do katalogu projektu: 
Użyj terminala, aby przejść do katalogu, w którym znajduje się sklonowane repozytorium.

```console
cd RemitlyTask
```
## 3. Uruchom projekt przy użyciu Maven: 
Aby skompilować i uruchomić projekt, użyj polecenia: 
Maven mvn exec:java.

```console
mvn exec:java -Dexec.mainClass="org.example.Main"
```
## 4. Uruchom testy przy użyciu Maven: 
Aby skompilować i uruchomić testy, użyj polecenia: 
Maven mvn test.

```console
mvn test
```
## Wymagania:
- Java Development Kit (JDK) (Używam JDK 17)
- Apache Maven


# Uruchamianie Projektu w IntelliJ IDEA
Aby uruchomić projekt w IntelliJ IDEA, wykonaj następujące kroki:

## 1. Otwórz Projekt w IntelliJ IDEA: 
Uruchom IntelliJ IDEA i otwórz projekt, wybierając opcję "Open" z menu głównego i wybierając katalog, w którym znajduje się projekt.

## 2. Sprawdź Konfigurację: 
Upewnij się, że konfiguracja projektu jest poprawna. Sprawdź, czy projekt jest prawidłowo rozpoznany jako projekt Maven.

## 3. Wybierz Konfigurację Uruchomienia: 
Wybierz konfigurację uruchomienia, którą chcesz użyć. Możesz wybrać istniejącą konfigurację lub utworzyć nową.

## 4. Uruchom Projekt: 
Kliknij przycisk "Run" (zielony trójkąt) w górnym prawym rogu głównego okna IntelliJ IDEA, aby uruchomić projekt.

## 5. Monitoruj Wyniki: 
Po uruchomieniu projektu, monitoruj wyniki w konsoli.

## Wymagania:
- Zainstalowany IntelliJ IDEA
- Java Development Kit (JDK) (Używam JDK 17)

## Autor
Zofia Lenart
