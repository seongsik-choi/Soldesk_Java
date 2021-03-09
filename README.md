# Visual Studio Code(VScode) Editor를 사용해 JAVA Programming 환경구성
**1) JDK(Java Development Kit) 설치**
    https://www.oracle.com/java/technologies/javase-downloads.html

![image](https://user-images.githubusercontent.com/76051264/102707691-7ea85280-42e0-11eb-9592-b55a193e66e7.png)
    
   O/S 환경에 맞는 JDK 실행파일 다운
![image](https://user-images.githubusercontent.com/76051264/102707716-bb744980-42e0-11eb-9fa1-b4c9a204bf9f.png)
  
  JDK 설치 완료, 설치 과정 중 폴더 지정 가능
![image](https://user-images.githubusercontent.com/76051264/102707790-4b19f800-42e1-11eb-8ad4-3db6aa98a627.png)

**2) 환경 변수 설정**
JVM 구동을 위한 java.exe와 compile 용도인 javac.exe를 다른 dic에서 접근할 수 있게 환경변수(Path)에 bin 경로 지정을 위해 환경변수 실행
![image](https://user-images.githubusercontent.com/76051264/102707820-97653800-42e1-11eb-84be-694db0d0efce.png)

Windows 기준 환경변수 설정(환경변수 -> "시스템변수" -> 새로만들기)
![image](https://user-images.githubusercontent.com/76051264/102707884-368a2f80-42e2-11eb-9b38-770317efe218.png)

JAVA_HOME 환경변수 추가, JDK_HOME 환경변수 추가
변수 값은 JDK 파일이 설치된 dic
_JAVA_HOME은 Windows 내 JAVA 사용을 위한 시스템 변수
JDK_HOME은 VScode의 JAVA Test Reunner(확장프로그램)을 위한 시스템 변수_
![image](https://user-images.githubusercontent.com/76051264/102707906-5ae60c00-42e2-11eb-90c7-1003addb1d59.png)
![image](https://user-images.githubusercontent.com/76051264/102707914-718c6300-42e2-11eb-8d84-b728339fc5af.png)

Path 변수 편집 -> 새로만들기 -> %JAVA_HOME%\bin 추가
![image](https://user-images.githubusercontent.com/76051264/102708009-1c048600-42e3-11eb-863b-2a65bb968668.png)

Cmd 내 javac -version 명령실행을 통해 자바 환경 구성이 완료된것을 확인

![image](https://user-images.githubusercontent.com/76051264/102708049-6b4ab680-42e3-11eb-81c4-1b8303bd9a3f.png)

**3. 편집기 없이 메모장, 컴파일러, java.exe를 이용해 코드를 실행하는 법**
임의의 폴더 내 메모장을 사용해 java class 생성
![image](https://user-images.githubusercontent.com/76051264/102708173-47d43b80-42e4-11eb-874e-3c4e39520fca.png)

Cmd 내 javac.exe(컴파일) Hello.java(컴파일할 java 파일) 명령 시 Class파일 생성
![image](https://user-images.githubusercontent.com/76051264/102708211-a7324b80-42e4-11eb-8347-af0c8c2bc682.png)

확장자를 명시하지 않은 java와 Class명 실행시

![image](https://user-images.githubusercontent.com/76051264/102708242-e3fe4280-42e4-11eb-95db-2ea6147c6046.png)

이러한 방법으로 자바 프로그램을 구동하는 방법도 있음

**4. Visual Studio Code Editor 설치**
프로그램 시 가독성을 높여주고, 빌드와 컴파일을 동시에 실행해주고, Git과의 연동을 위한 가벼운 형태의 에디터인 Visual Studio Code 설치(시스템 O/S에 맞게 설치)
https://code.visualstudio.com/download
![image](https://user-images.githubusercontent.com/76051264/102708310-65ee6b80-42e5-11eb-9740-ee87bedfb6fb.png)

VScode 설치 후, JAVA 개발을 위한 확장프로그램 설치의  필요
JAVA Extention Pack을 설치하여 확장 프로그램 설치
하단의 5개가 추가로 자동으로 설치되는 JAVA 확장프로그램
![image](https://user-images.githubusercontent.com/76051264/102708668-8ddece80-42e7-11eb-81c5-5ebd7ed82c5b.png)

파일 -> 기본 설정 -> "java.home" 입력 -> settings.json 클릭
![image](https://user-images.githubusercontent.com/76051264/102708406-46a40e00-42e6-11eb-8555-d22f463c80b8.png)

java.home 입력 부분에 "C:\\Program Files\\Java\\jdk-15.0.1" 입력 후 저장
확장프로그램에 대한 전역설정 완료
![image](https://user-images.githubusercontent.com/76051264/102708460-a26e9700-42e6-11eb-84ab-412d757c6951.png)

git과의 연동을 통해 작성한 JAVA 프로그램을 Repository에 Push
