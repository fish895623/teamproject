# Class Diagram

```mermaid
classDiagram
class Device {
  +int voltage
  +int warranty
  +String powerConsumption
  +String carbonEmission
  +float annualEnergyCost
  +float weight
  +float height
  +float width
  +float depth
  +String size
}
Device --|> MobileDevice
Device --|> HomeApplianceDevice
Device --|> KitchenDevice

class MobileDevice {
  +String software
  +boolean wearable

  +boolean network
  +boolean bluetooth
  +boolean wifi

  +connectToWifi(String network)
  +disconnectFromWifi()
  +toggleBluetooth()
  +updateSoftware()
  +checkBatteryLevel()
  +enableNetworkConnection()
  +disableNetworkConnection()
}
class HomeApplianceDevice {
  +String location
  +boolean iotDevice
  +boolean voiceDevice

  +setLocation(String newLocation)
  +connectToIoT()
  +disconnectFromIoT()
  +enableVoiceControl()
  +disableVoiceControl()
  +scheduleOperation(DateTime time)
  +cancelScheduledOperation()
}
class KitchenDevice {
  +boolean aboutFood
  +int cookingTime
  +boolean iotDevice
  +boolean voiceDevice

  +setCookingTime(int time)
  +startCooking()
  +stopCooking()
  +cleanDevice()
  +connectToIoT()
  +disconnectFromIoT()
  +enableVoiceControl()
  +disableVoiceControl()
}

class `IDeviceInfo` {
  <<interface>>
  +swim()
  +getSize()
  +printDeviceName()
}

`IDeviceInfo` --> MobileDevice
`IDeviceInfo` --> HomeApplianceDevice
`IDeviceInfo` --> KitchenDevice


class User {
  -String user_id
  -String user_pw
  -String name
  -String email
  -emailValidator()
}

class Admin {
  -String role
  +manageDevices()
  +manageUsers()
}

class Client {
  -String customerType
  -String customerAddress
  +viewDevices()
  +purcharseDevice()
}

User --|> Admin
User --|> Client

```

# Fixed Class Diagram

```mermaid
classDiagram
    class Device {
        <<abstract>>
        +int voltage
        +int warranty
        +String powerConsumption
        +String carbonEmission
        +float annualEnergyCost
        +float weight
        +float height
        +float width
        +float depth
        +String size
        +turnOn()
        +turnOff()
        +checkWarranty()
    }

    class INetworkConnectable {
        <<interface>>
        +connectToNetwork()
        +disconnectFromNetwork()
    }

    class IIoTDevice {
        <<interface>>
        +connectToIoT()
        +disconnectFromIoT()
    }

    class IVoiceControllable {
        <<interface>>
        +enableVoiceControl()
        +disableVoiceControl()
    }

    class ICookingDevice {
        <<interface>>
        +setCookingTime(int time)
        +startCooking()
        +stopCooking()
    }

    class IDeviceInfo {
        <<interface>>
        +getSize()
        +printDeviceName()
    }

    class MobileDevice {
        +String software
        +boolean wearable
        +boolean network
        +boolean bluetooth
        +boolean wifi
        +connectToWifi(String network)
        +disconnectFromWifi()
        +toggleBluetooth()
        +updateSoftware()
        +checkBatteryLevel()
    }

    class HomeApplianceDevice {
        +String location
        +setLocation(String newLocation)
        +scheduleOperation(DateTime time)
        +cancelScheduledOperation()
    }

    class KitchenDevice {
        +boolean aboutFood
        +cleanDevice()
    }

    class User {
        -String user_id
        -String user_pw
        -String name
        -String email
        -emailValidator()
    }

    class Admin {
        -String role
        +manageDevices()
        +manageUsers()
    }

    class Client {
        -String customerType
        -String customerAddress
        +viewDevices()
        +purchaseDevice()
    }

    Device --|> MobileDevice
    Device --|> HomeApplianceDevice
    Device --|> KitchenDevice
    INetworkConnectable --> MobileDevice
    IIoTDevice --> HomeApplianceDevice
    IIoTDevice --> KitchenDevice
    IVoiceControllable --> HomeApplianceDevice
    IVoiceControllable --> KitchenDevice
    ICookingDevice --> KitchenDevice
    IDeviceInfo --> Device
    User --|> Admin
    User --|> Client
```

## 역할분담

- 박수아
  - ICookingDevice
  - IDeviceInfo
  - IIoTDevice
  - INetworkConnectable
  - IVoiceControllable
- 민정현
  - User
  - Admin
  - Client
- 배성훈
  - Device
  - MobileDevice
  - HomeApplianceDevice
  - KitchenDevice

# TODO

- [x] 클래스 다이어그램 작성
- [x] 로그인 기능 구현
- [ ] 장바구니 제품 추가
  - [x] DeviceManage
- [ ] 장바구니 리스트
  - [x] DeviceManage
- [ ] 장바구니 전체 가격
  - [x] DeviceManage
- [ ] 잔여 수량
  - [x] DeviceManage
- [ ] 제품 입고
  - [x] DeviceManage
- [ ] 유저 추가
- [ ] 유저 삭제
- [ ] 유저 수정
- [ ] 구매 이력
