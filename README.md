# AAC
> __Android Architecture Component__
>> 앱 구조를 더 튼튼하고, 테스트에 용이하고, 유지 보수성이 뛰어나게 만들어 주는 모듈화된 코딩을 돕는 라이브러리 모음 </br>



>https://www.youtube.com/watch?v=Y-uPcwBEEV4 참고 </br>
__`by Kotlin`__

안드로이드는 Activity, BroadcastReceiver, Service, ContentProvider 등 여러 컴포넌트들이 있고, 생명주기가 다르게 얽혀있습니다. 앱을 잘 만들기 위해서는 이러한 컴포넌트들을 부드럽게 연결해야 하는데, 생명주기를 학습하고 엉키지 않도록 고민하는 것은 결국 개발자의 몫이였습니다. 구글은 이 고민을 줄이기 위해 SDK에서 제공하는 컴포넌트들에 대해 개발자들에게 더 가이드를 주기를 원했습니다. 그래서 Android Architecture Components(AAC)를 만들었습니다


DataBinding
-----------
`Ui 요소와 데이터를 프로그램적 방식으로 연결하지 않고, 선언적 형식으로 결합할 수 있게 도와주는 라이브러리`      
</br>gradle(app)의 android{} 안에 추가
```kotlin

    dataBinding {
        enabled = true
    }
```
- [x] findViewId() 를 호출하지 않아도, 자동으로 xml 에 있는 VIew 들을 만들어준다.
- [x] RecyclerView 에 각각의 item 을 set 해주는 작업도 자동으로 진행된다.
- [x] data 가 바뀌면 자동으로 View 를 변경하게 할 수 있다.
- [x] xml 리소스만 보고도 View 에 어떤 데이터가 들어가는지 파악이 가능하다.
- [x] 코드 가독성이 좋아지고, 상대적으로 코드량이 줄어든다.

LiveData
--------
`식별 가능한 데이터 홀더 클래스`</br></br>
 LiveData는 수명 주기를 인식합니다. 즉 활동, 프래그먼트 또는 서비스와 같은 다른 앱 구성요소의 수명 주기를 고려합니다. 이러한 수명 주기 인식을 통해 LiveData는 활성 수명 주기 상태에 있는 앱 구성요소 관찰자만 업데이트합니다.</br>
- [x] UI와 데이터 상태의 일치 보장
- [x] 메모리 누출 없음
- [x] 중지된 활동으로 인한 비정상 종료 없음
- [x] 수명 주기를 더 이상 수동으로 처리하지 않음
- [x] 최신 데이터 유지
- [x] 적절한 구성 변경
- [x] 리소스 공유

ViewModel
---------
`화면 회전같은 환경 변화에서 뷰에 사용되는 데이터를 유지시키기 위한, 라이프사이클을 알고있는 클래스`</br></br>
ViewModel 클래스는 수명 주기를 고려하여 UI 관련 데이터를 저장하고 관리하도록 설계되었습니다. ViewModel 클래스를 사용하면 화면 회전과 같이 구성을 변경할 때도 데이터를 유지할 수 있습니다. </br>
- [x] 안드로이드 생명주기 이벤트와 변경이 일어나는 동안 일관성을 유지하면서 view의 Lifecycle 상태를 자동으로 관찰
- [x] 관찰가능한 LiveData 를 제공받는 Repository 로부터 data를 가져오는 것이 요구됨
- [x] 결코 View 를 직접적으로 참조하지 않고, data업데이트는 LiveData 에 의한 것이라는 점을 이해하는 것이 중요
> MVVM의 ViewModel과는 다름</br> 
> + View를 그리는데 필요한 Model을 ViewModel</br> 
> + 뷰와 모델 사이에서 데이터를 관리하고 바인딩해줌





Icon
----
File -> New -> Vector Asset -> Clip Art 더블 클릭 시 __기본 제공 아이콘__ 사용 가능
