package 그래프탐색;

/*

너비 우선 탐색(Breadth First Search, BFS)
- 너비 우선 탐색은 트리나 그래프를 탐색하는 알고리즘 중 하나로,
 시작 정점에서 시작하여 인접한 정점을 먼저 탐색하는 방법이다.
 
- bfs는 최소비용 경로를 찾는 데에 장점이 있으며,   
Queue를 이용해서 구현한다.

<bfs 구현단계>
1. 시작점을 큐에 넣는다.
2. 큐에서 한 점을 꺼내서 기준점으로 삼는다.
3. 기준점이 목적지이면 탐색을 종료한다.
4. 그렇지 않은 경우 기준점에서 갈 수 있는 다음 정점들을 큐에 넣는다.
5. 큐에 원소가 없을 때까지 2단계로 돌아가 반복한다.        

(입력예시)
1
7 6
1 7
1 2
2 4
2 5
1 3
3 6
6 7

(그래프 예시)
    1
   /  \
  2    3   
 / \    \
4   5    6
              |
              7

*/

public class BFS {

}
