# java-calculator-precourse

## 프로젝트 설명 및 개요
이 프로젝트는 문자열 형태로 입력받은 숫자를 파싱하여 덧셈 합계를 구하는 콘솔 기반의 Java 애플리케이션입니다.
입출력, 파싱, 계산, 검증 로직을 클래스별로 분리하여 설계되었습니다.

#### 주요 목표
**분리**: 로직을 각 클래스의 역할에 맞게 분리합니다.

**custom 구분자**: 기본 구분자(쉼표 , 콜론 ) 외에, custom 구분자("//"와 "\n"사이 존재하는 문자)를 정규 표현식으로 지원합니다.

**예외 처리**: 음수 입력이나 숫자가 아닌 문자가 포함될 경우 IllegalArgumentException을 발생시켜 프로그램의 안정성을 확보합니다.


## 프로젝트 개발 과정
개발은 기능별 모듈화에 중점을 두고 진행

**입출력**: Input.java와 Output.java를 통해 사용자 입력과 결과 출력을 담당하는 기본적인 시스템을 구축하고 Application.java에서 연결

**문자열 파싱**: Delimiter.java로 구분자를 추출하고 Splitter.java로 문자열을 배열로 분리를 Parser.java에서 수행한 후, Parameter.java에서 관리

**계산 및 검증**: Calculator.java에서 덧셈을 수행하고, 숫자 형식 및 음수 값에 대한 예외 처리 로직을 구현

**통합**: Application.java에서 모든 클래스를 연결하여 사용자 입력을 받고, 계산을 수행한 뒤, 결과를 출력하는 전체 작동 순서를 완성


## 주요 클래스 및 역할

**Application.java** |	실행 관리	프로그램의 시작점(main)이며, 모든 로직을 통합합니다.

**Calculator.java** |	숫자 배열의 합을 계산하고, 음수 및 숫자 형식을 검증합니다.

**Parameter.java** | 구분된 숫자 문자열과 구분자를 관리하는 DTO

**Parser.java** | 입력받은 문자열을 Parameter Dto로 변환합니다.

**Delimiter.java** |	구분자 추출,	기본 및 사용자 정의 구분자를 추출하고 정규 표현식 문자열로 반환합니다.

**Splitter.java** |	문자열 분리 문자열과 구분자 정규식을 받아 문자열 배열로 분리합니다.

**Input.java** |	입력 처리 콘솔에서 입력값을 입력받습니다.

**InputValue.java** | 입력값을 관리하는 DTO

**Output.java** |	출력 처리 최종 계산 결과를 콘솔에 출력합니다.


## 개발환경
**Version** : java 21
**IDE** : Intellij

### 프로그래머
최주원
