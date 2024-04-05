휴대폰 구현 1 - src/day02/EX03

* Person
    * 다른 종류의 Phone 객체가 생길 줄 모르고, Phone 하나를 가지고 있게 했음
    * 대사도 다르기 때문에 turnOnSpeech 변수도 받음
    * buyPhone에서 Person의 phone 등록
    * turnOnPhone을 하면, 대사 치고 가지고 있는 phone의 turnOn함수를 호출

* Phone
    * 이름, 켜져있는지(여기선 필요없음), 켜질 때 소리를 받았다.

* Store
    * 가게이름, 팔는 휴대폰을 받았음
    * sellPhone하면, 어떤 가게에서 누가 어떤폰을 구매했다는걸 출력.
        * person.buyPhone을 호출해 해당 인물의 phone을 넣어줌.
