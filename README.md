# Docker-elk

# 개발 환경
* JDK 8.1
* SpringBoot 2.6.3
* Gradle
* logstash-logback-encoder(v.6.6)
* logstash(v 7.15.2)
* elasticsearch(v 7.15.2)
* kibana(v 7.15.2)
---
# ELK 환경 
![시각화](https://user-images.githubusercontent.com/72914519/153231789-bbc0f2fa-04da-4606-9988-1344b2ed9029.PNG)
---
# AWS 인스턴스 정보

AWS t2.micro 에서는 구동이 불가능 t3.small에서는 서비스 원활


---
* 스프링 콘솔 로그 
![스프링](https://user-images.githubusercontent.com/72914519/153233099-6240c81e-53a4-4855-8de4-35d072726c7b.PNG)
* logstash 로그
<img width="1440" alt="KakaoTalk_20220209_235034501" src="https://user-images.githubusercontent.com/72914519/153233287-f9636e8c-8bdb-4edd-a017-b4a6225a740b.png">

* 키바나 시각화

![키바나 성공](https://user-images.githubusercontent.com/72914519/153233371-6f9cdf0d-1881-444e-965c-4d74dc100093.PNG)


EC2에서 ELK설정은 [이 곳](https://thisisthat-it.tistory.com/60) 에서 확인 해주세요
