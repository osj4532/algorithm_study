# algorithm_study

##### 개인적으로 알고리즘과 자료구조를 공부하기 위한 프로젝트입니다.

## Sort
<details>
<summary>접기/펼치기 버튼</summary>
<div markdown="1">

### Basic Sort
* Insersion Sort
* Selection Sort
* Bubble Sort

### Divide and Conquer Sort
* Quick Sort
* Merge Sort
* Heap Sort

### Counting Sort
* Counting Sort

### 실행속도
###### (1 ~ 100,000개의 숫자중 랜덤으로 뽑은 100,000개의 숫자를 정렬을 100번 실행한 평균)
* Insersion Sort = 4238ms
* Selection Sort = 1302ms
* Bubble Sort = 14636ms

---

* Quick Sort = 11ms
* Merge Sort = 10ms
* Heap Sort = 13ms

---

* Counting Sort = 1ms

### 시간복잡도
###### 기본 로직은 기본으로 오름차순 정렬이다.
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

---

* Quick Sort
```
기본로직
1. 인덱스의 맨 앞의 인덱스를 피벗으로 정한다.
2. 분할 전 비교를 진행하기 위해 피벗을 제외한 가장 왼쪽 배열의 인덱스를 저장하는 start, 가장 오른쪽 배열의 인덱스를 저장하는 end변수를 만든다.
3. start부터 비교를 진행하며 비교는 end가 start보다 클 때만 반복한다.
4. 비교한 배열값이 피벗의 배열 값 보다 작으면 start를 하나 증가시키며 비교를 반복한다. 피벗의 배열 값 보다 큰 값을 찾으면 반복을 멈춘다.
5. 4번이 끝나면 end의 비교를 진행하며 비교는 end가 start보다 클 때만 반복한다.
6. 비교한 배열 값이 피벗의 배열 값 보다 크면 end를 하나 감소시키며 비교를 반복한다. 피벗의 배열 값 보다 작은 값을 찾으면 반복을 멈춘다.
7. 만약 start가 end보다 크거나 같다면 피벗의 배열 값과 end의 배열 값을 바꿔준다.
8. 그렇지 않다면 start의 배열 값과 end의 배열 값을 바꿔준다.
9. 맨 처음 부터 end - 1까지, end + 1부터 맨 끝까지 2부분으로 나눠 퀵정렬을 반복한다.
```
퀵정렬은 분할과 동시에 정렬을 진행하는 알고리즘이다. 각 정렬은 배열의 크기 N만큼 비교하며, 이를 총 분할 깊이인 logN만큼 진행한다. 그러므로 시간복잡도는 빅오표기법으로 O(NlogN)이다.

###### ※ 퀵정렬은 무조건 O(NlogN)을 보장하지 않고 최악의 경우 O(N^2)의 시간복잡도를 가진다.

* Merge Sort
```
기본로직

분할로직
1. 배열의 시작 위치와, 종료 위치를 입력받아 둘을 더한 후 2로 나눠 그 위치를 기준으로 현재 배열을 반으로 나눈다.
2. 나눈 배열의 크기가 0이나 1일때 까지 반복한다.

합병로직
1. 두 배열 A, B의 인덱스를 저장할 변수 i, j를 선언한다. 
2. 정렬 결과를 담을 새 배열 C를 생성하고 인덱스를 저장할 변수 k를 선언한다.
3. i는 배열 A의 시작 인덱스를, j는 배열 B의 시작 인덱스를, K는 배열 C의 시작 인덱스를 저장한다.
4. A[i]와 B[j]를 비교한다.
5. A[i] > B[j] 라면 B[j]를 C[k]에 저장하고 j + 1을 , A[i] < B[j] 라면 A[i]를 C[k]에 저장하고 i + 1을 해준뒤 k + 1을 한다.
6. 5번 과정을 i나 j가 배열 끝에 도달할 때 까지 반복한다.
7. 끝까지 저장하지 못한 배열의 값을 남은 값부터 C에 저장한다.
8. C배열에 있던 값들을 원래 배열에 저장한다.
```
합병 정렬은 분할과 합병으로 이루어진 알고리즘이다. 합병 과정은 두 배열 A, B를 정렬하기 때문에 A배열의 크기 N1, B배열의 크기 N2라고 할때 시간 복잡도는 O(N1 + N2)이다.
하나의 배열을 A와 B로 나눴기 때문에 전체 길이를 N이라고 할경우 N = N1 + N2이므로 O(N)이다.

분할 과정은 크기가 N인 배열을 분할하면, 한번 분할하면 N/2, N/2 2개 또 분할 하면 N/4, N/4, N/4, N/4 4개 이렇게 진행된다. 즉 매번 반씩 감소하므로 시간 복잡도는 O(logN)이다.

각 분할별로 합병을 진행 하므로 합병 정렬의 시간 복잡도는 O(NlogN)이다.

* Heap Sort
```
기본로직

Heapify 로직
1. 현재 인덱스를 0부터 시작하며 변수 c에 저장한다.
2. root값은 (c - 1) / 2 값이다.
3. root의 배열 값과 c의 배열 값을 비교한다.
4. 만약 c의 배열값이 더 크다면 root의 배열값과 c의 배열 값을 바꿔준다.
5. c값에 root값을 저장한다.
6. 2 ~ 5과정을 c가 0보다 크면 계속 반복한다.
7. 배열의 길이 만큼 6과정을 반복해서 진행한다.

sort 로직
1. 현재 인덱스는 (배열의 길이 - 1)부터 시작한다.
2. 첫번 째 배열값과 현재 인덱스의 배열 값을 바꿔준다.
3. root인덱스를 저장할 변수 root와 자식 노드의 인덱스를 저장할 c를 선언한다.
4. c값은 (root + 1) * 2 값이다.
5. c의 배열값과 c + 1의 배열 값을 비교한다.
6. 만약 c+1의 배열 값이 더 크다면 c = c + 1을 해준다.
7. root의 배열 값과 c의 배열 값을 비교한다.
8. c의 배열 값이 더 크다면 root의 배열값과 c의 배열 값을 바꿔준다.
9. root값에 c값을 저장한다.
10. c가 현재 인덱스 보다 작으면 4 ~ 9과정을 반복한다.
11. 현재 인덱스에 -1 씩 해주며 10번 과정을 반복한다.
```
힙정렬은 힙트리의 전체 높이가 거의 logN이므로 (완전 이진 트리이기 때문) 하나의 요소를 힙에 삽입하거나 재정비하는 시간이 logN만큼 소요된다. 그리고 요소의 개수가 N개 이므로 힙정렬의 시간 복잡도는 O(NlogN)이다.

---

* Counting Sort
```
기본 로직
1. 숫자를 카운팅할 배열을 하나 생성합니다.
2. 0번째 부터 배열의 길이 끝까지 각 숫자가 몇번 등장하는지 카운팅하여 1번에서 만든 배열에 저장합니다.
3. 1번에서 만든 배열을 탐색합니다.
4. 0부터 배열 길이 끝까지 배열 값이 0이 아니면
5. 0부터 배열 값까지 현재 인덱스를 저장합니다.
```
계수 정렬은 원소간 비교하지 않고 각 원소가 몇개 등장하는지 갯수를 세서 정렬하는 알고리즘이다. 그래서 시간 복잡도는 O(N + K)로 퀵정렬, 합병 정렬에 비해 빠르다.
하지만 모든 원소는 양의 정수여야 하며 카운팅하기 위해 다른 배열이 필요하기 때문에 공간 복잡도가 O(N + K)가 된다.
</div>
</details>

## Cos Pro 1급 Java
##### 문제 출처 : https://www.ybmit.com/cos_pro/cos_pro_r_test.jsp

## data structure
<details>
<summary>접기/펼치기 버튼</summary>
<div markdown="2">

* stack
* queue & queue Using two stacks
* Thread Safe Queue
* binaryTree
* LinkedList
</div>
</details>

## search
<details>
<summary>접기/펼치기 버튼</summary>
<div markdown="3">

* DFS
* BFS
* BinaryTreeTraversal
    - preOrder
    - inOrder
    - postOrder
</div>
</details>

## algorithm
<details>
<summary>접기/펼치기 버튼</summary>
<div markdown="4">

* UnionFind
* Kruskal
* Search Special Char
* Delete All Special Char
* Reverse Words Order
* StrToInt / IntToStr
* Permutation
* Combination
* Fibonacci
* Reverse Pivotal Metrix
</div>
</details>
   

## Backjun quiz
<details>
<summary>접기/펼치기 버튼</summary>
<div markdown="5">

### dfs, bfs
* 10451
* 2583

### sort
* 10989
* 1181
* 1431
* 2750

### dynamic programming
* 11726
* 11727
</div>
</details>

## programmers
<details>
<summary>접기/펼치기 버튼</summary>
<div markdown="6">

### string
* 60057(kakao)
* 17687(kakao)

### array
* 12906
* 12910
* 42586

### calc
* 12912

### compare
* 12915

</div>
</details>