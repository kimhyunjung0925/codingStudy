# Git Fork 사용방법
---
1. 처음 이용시 순서<br> 
[1번](#1-Fork ) => [2번](#2-저장소-복사하기) => [3번](#3-브랜치-생성) => [4번](#4-add--commit--push) => [5번](#5-pull-request<br>) => merge 완료 => [6번](#6-브랜치-이동--삭제) => [7번](#7-원격저장소-추가) => [8번](#8-fetch--merge--push)
2. 두번째 부터 이용순서 <br> 
[8번](#8-fetch--merge--push) => [3번](#3-브랜치-생성) => [4번](#4-add--commit--push) => [5번](#5-pull-request<br>) => merge 완료 => [6번](#6-브랜치-이동--삭제)
---
## 0. 폴더 위치와 작업장소
- 폴더 위치는 자신이 편한곳에서 진행
- 원하는 위치에서 마우스 우클릭 `Git Bash Here` 선택
- `clone`을 진행하면 원격저장소와 동일한 폴더가 생성
- 해당 폴더 안에서 마우스 우클릭 `Git Bash Here` 선택 - 모든 작업이 이루어질 공간!!
## 1. Fork
- Fork 할 저장소(A)의 위치가 맞는 가 확인 하기!!
- 저장소의 위치가 맞다면 Fork 하기
- 예시
![Fork이미지](./img/fork.png)
## 2. 저장소 복사하기
```
git clone [원격 저장소 주소]
```
- 자신의 GitHub `Repositories`에서 Fork한 저장소 주소(B)를 복사
- `Git Bash` 창에서 `git clone [B 저장소 주소]` 를 입력한다.
![clone이미지](./img/clone.png)

---
## <mark> 2번을 실행한 이후 해당 폴더를 열어서 <br> GitHub사용자 이름 or 자신의 이름 으로 폴더 만들고<br> 해당 폴더 안에서 작업하기!!!!</mark>

---

## 3. 브랜치 생성
```
git checkout -b [브랜치 명]
```
- [브랜치란](https://backlog.com/git-tutorial/kr/stepup/stepup1_1.html), `main(master)브랜치를 그대로 유지`하면서<br>기존 파일 내용을 `수정 or 새로운 기능을 구현가능한` 파일을 만들 수 있다. <br> 브랜치는 나무 가지 라고 생각하세요~
- 브랜치 명은 자유롭게 생성하시면 됩니다.
## 4. add / commit / push
```
git add .
git commit -m "[커밋 할 내용]"
git push origin [생성한 브랜치 명]
```
- 여기서 `commit`한 내용이 `pull request`하고난뒤 A 원격저장소에 `commit`내용으로 적용 됩니다.
- origin 은 별칭(변수명) 같은것 입니다. <br>2번 원격 저장소 주소가 자동으로 설정 되어있을 것 입니다.
---
### **_여기까지 하면 개인 원격저장소 생성한 브랜치 이름으로  push 되어있다._**
---
## 5. pull request<br>

<!-- TODO 사진추가 -->
- pull request 보내기 방법 1
![pullRequest1](./img/pullRequest1.PNG)
- pull request 보내기 방법 2 (merge 거절 되었을 때 다시 시도 방법)
![pullRequest1](./img/pullRequest2.PNG)
- 방법 1 or 방법 2 이후 진행 순서
![pullRequest1](./img/pullRequest3.PNG)
![pullRequest1](./img/pullRequest4.PNG)
- 위 이미지랑 동일 하면 성공!!
- <mark>merge 기다리기!!!!</mark>
---
## <mark>merge 완료되면 아래 진행 하기!!!</mark>
---
## 6. 브랜치 이동 / 삭제
```
$ git branch
$ git checkout [브랜치 명]
$ git branch -D [브랜치 명]
```
- `git branch` 를 통해 브랜치 확인 하기
- `git checkout`을 통해 `main` or `marster`(브랜치 명)로 이동
- 3번 작업에서 했던 브랜치 삭제
## 7. 원격저장소 추가
```
$ git remote -v
$ git remote add [해당 저장소 별칭] [원격저장소]
```
- 별칭(변수 같은 것)은 자유롭게 입력 하면됨
- Fork 작업의 `A원격저장소 주소`를 입력할 것
- `git remote -v` 시 나오는 모습<br>
![remote -v](./img/remote.PNG)

## 8. fetch / merge / push
```
$ git fetch [저장소 별칭]
$ git merge [저장소 별칭]/[브랜치 명]
$ git push origin [원격저장소 브랜치명]
```
- fetch(가져오기) <br>
    - 7번 작업에서 입력한 별칭<br>
- fetch 예시<br>
![fetch](./img/fetch.PNG)
- merge(병합)<br>
    - 7번 작업에서 입력한 별칭<br>
    - Fork하는 A원격저장소 주소 브랜치명<br>

- merge 예시<br>
![merge](./img/merge.PNG)
- push(밀어넣기)<br>
    - [6번](#6-브랜치-이동-/-삭제)에서 이동한 브랜치명<br>
- push 예시<br>
![push](./img/push.PNG)
- [fetch](https://backlog.com/git-tutorial/kr/stepup/stepup3_2.html), [merge](https://backlog.com/git-tutorial/kr/stepup/stepup1_4.html)이 궁금하다면 한번 보세요~
---
## **_여기까지 하면 pull request 한 내용이 나의 원격저장소에도 적용되었다._**
***