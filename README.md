# algorithm_study

## 개인적으로 알고리즘과 자료구조를 공부하기 위한 프로젝트입니다.

### Basic Sort
* Insersion Sort
* Selection Sort
* Bubble Sort

### Divide and Conquer Sort
* 추가예정

### 실행속도
###### (1 ~ 100,000개의 숫자중 랜덤으로 뽑은 100,000개의 숫자를 정렬을 100번 실행한 평균)
* Insersion Sort = 4238ms
* Selection Sort = 1302ms

* Bubble Sort = 14636ms

### 시간복잡도
* Insersion Sort
```
기본로직
1. 현재 인덱스를 별도로 저장해두며,현재 인덱스는0부터 시작한다.
2. 별도로 저장해둔 인덱스와 그 앞 인덱스의 배열 값을 비교한다.
3. 만약 별도로 저장해둔 인덱스의 배열 값이 더 크다면 두 배열 값을 서로 바꿔준다.
4. 현재 인덱스를 -1 하며 3번 과정을 반복한다.
5. 1 ~ 4번 과정을 배열의 길이만큼 반복한다.
```
삽입 정렬 알고리즘은 최악의 경우(역으로 정렬되어 있을 경우)에 n-1, n-2, .... , 1개씩 비교하기 때문에 시간복잡도는 빅오표기법으로 O(N^2)가 된다.

* Selection Sort
```
기본로직
1. 정렬되지 않은 인덱스의 맨 앞부터 배열 값중 가장 작은 값을 찾는다.
2. 가장 작은 값의 배열 값을 현재 인덱스의 배열 값과 바꿔준다.
3. 다음 인덱스로 넘어간 후 1 ~ 2번 과정을 배열의 길이만큼 반복한다.
```
선택 정렬 알고리즘은 배열의 전체를 비교하기 때문에 시간복잡도는 빅오표기법으로 O(N^2)가 된다.

* Bubble Sort
```
기본로직
1. 기본 인덱스는 1부터 시작한다.
2. 현재 인덱스의 배열값과 현재 인덱스에 -1한 인덱스의 배열값을 비교한다.
3. 앞의 인덱스의 배열값이 뒤의 인덱스의 배열값 보다 크다면 서로 배열값을 바꿔준다.
4. 1 ~ 3번 과정을 끝마치면 가장 큰 배열값이 가장 뒤로 이동해 있기 때문에 마지막은 정렬에서 제외한다.
5. 1 ~ 3번 과정을 배열의 크기 만큼 반복한다.
```
버블 정렬 알고리즘은 선택 정렬과 같이 전체를 비교하기 때문에 시간복잡도는 빅오표기법으로 O(N^2)가 된다.
