# [Silver II] Champernowne Subsequence - 32789 

[문제 링크](https://www.acmicpc.net/problem/32789) 

### 성능 요약

메모리: 48356 KB, 시간: 232 ms

### 분류

브루트포스 알고리즘, 그리디 알고리즘, 문자열

### 제출 일자

2026년 3월 27일 23:03:41

### 문제 설명

<p>The $k^{\text{th}}$ Champernowne word is obtained by writing down the first $k$ positive integers and concatenating them together. For example, the $10^{\text{th}}$ Champernowne word is $12345678910$.</p>

<p>It can be proven that, for any finite string of digits, there exists some integer $k$ such that the finite string of digits will appear as a subsequence in the $k^{\text{th}}$ Champernowne word.</p>

<p>String $s$ is a subsequence of string $t$ if it is possible to delete some (possibly zero) characters from $t$ to get $s$.</p>

<p>Given a string of digits, compute the smallest integer $k$ such that the given string of digits is a subsequence of the $k^{\text{th}}$ Champernowne word.</p>

### 입력 

 <p>The first line of input contains a single integer $n$ $(1 \leq n \leq 10^5)$, the length of the string of digits.</p>

<p>The second line of input contains a string of $n$ digits.</p>

### 출력 

 <p>Output a single integer $k$, the minimum integer such that the given string is a subsequence of the $k^{\text{th}}$ Champernowne word.</p>

