# prography_6th_android
### ViewPager를 이용하여 Fragment를 전환하는 기본적인 모바일 네트워킹 App 개발 

- ViewPager를 이용하여 Fragment 3개(CALLS, CHATS, CONTATCS Fragment)를 연결한, 
  Swipe가 가능한 Bottom Navigation View 구현 

- 아래 URL에서 JSON 형식의 정보를 받아온 후(GET) 이를 가운데(CHATS)Fragment에 RecyclerView로  
  전체 데이터(총 20개)를 나열한다. 이 때 표시할 정보는 번호(1~ 20), title(제목), director(감독),  
  release_date(출시년도)이다. (​https://ghibliapi.herokuapp.com/films​) 
  
- RecyclerView의 아이템을 클릭했을 때 Intent를 이용하여 새로운 액티비티를 생성하고 그 
  액티비티에 데이터 전달 함수인 putExtra를 사용하여 상세정보를 표시해 봅시다. 이 때  
  표시할 정보는 title(제목), description(설명), director(감독), producer(제작자),  
  release_date(출시년도), rt_score(평점) 이다. 

