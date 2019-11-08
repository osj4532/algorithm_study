# algorithm_study

## 개인적으로 알고리즘과 자료구조를 공부하기 위한 프로젝트입니다.

### Basic Sort
* Insersion Sort
* 추가예정

### Divide and Conquer Sort
* 추가예정

### 실행속도
###### (1 ~ 100,000개의 숫자중 랜덤으로 뽑은 100,000개의 숫자를 정렬)
* Insersion Sort = 4333ms

### 빅오표기법
* Insersion Sort
```
for(i = 0; i < len; i++) {
	j = i;
	while(j >= 0 && j + 1 < len 
		&& newArr[j] > newArr[j + 1]) {
		
		SortUtil.swap(newArr, j, j + 1);
		j--;
	}
}
```
위 코드가 핵심 알고리즘이며 빅오 표기법으로 계산하면 O(n^2)가 된다.
