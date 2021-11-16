# codingStudy
Koreait학원 국기과정 수강생 코딩스터디

## 규칙!!
- <mark> **_GitHub 사용자 이름 or 자신의 이름으로 만든 폴더 내에서 작업하기!!!!!_** </mark>

- 파일명 통일
```
[사이트명]_[문제번호].txt
[사이트명]_[문제번호].java
```
```
BOJ_2557.txt
BOJ_2557.java
```
- 각 문제에 해당하는 링크 및 제목 주석달기!
```
/*
 Hellow World
 https://www.acmicpc.net/problem/2557
*/
```
```
// Hellow World - https://www.acmicpc.net/problem/2557
```
- <mark>매일 23시 30분 ~ 00시</mark> 에는 해당 저장소 `clone`, `fetch`, `merge` <mark>금지</mark> 권장 <br> 에러방지 차원입니다.<br>해당 시간에 pull request 처리하는 시간하겠습니다!!

## GitHub 사용방법
- 아래의 방법을 자세히 알고싶다면 => *[클릭](./MD/github.md)*
```
Fork 하기
```
```
$ git clone [개별 원격저장소 주소]
$ git checkout -b [브랜치 명]
$ git add .
$ git commit -m "[커밋 할 내용]"
$ git push origin [생성한 브랜치 명]
```
```
pull request 하기 => merge 될때까지 아래 작업 금지!!!!!
```
```
$ git checkout [이동할 브랜치 명]
$ git branch -D [삭제할 브랜치 명]
```
```
$ git remote add [해당 저장소 별칭] [통합 원격저장소]
```
```
$ git fetch [7번 저장소 별칭]
$ git merge [7번 저장소 별칭]/[브랜치 명]
$ git push origin [나의 원격저장소 브랜치명]
```


## 스터디 일정
- 타이틀별 _세부문제_ 는 _홀수번호_ 위주로 풀면 됩니다~ 
<!-- TODO 스터디할때 정하기. -->
| 일시 | 내용 |
:---:|:---:
11.11(목)|자바 / github사용법 / [입출력과 사칙연산](https://www.acmicpc.net/step/1)
11.18(목)|[if문](https://www.acmicpc.net/step/4) / [for문](https://www.acmicpc.net/step/3) / [while문](https://www.acmicpc.net/step/2) 
11.25(목)|[1차원 배열](https://www.acmicpc.net/step/6) / [함수](https://www.acmicpc.net/step/5) / [문자열](https://www.acmicpc.net/step/7)
12.02(목)|
12.09(목)|
12.16(목)|
12.23(목)|
12.30(목)|

## Reference
- https://chanhuiseok.github.io/posts/git-3/<br>
- https://chanhuiseok.github.io/posts/git-2/<br>
- https://github.com/next-step/nextstep-docs/blob/master/codereview/review-step1.md<br>
- https://github.com/techinpark/github-template-tutorial<br>
