# 전자기기 상품 구매 관리

구매장와 매니저를 지정하여 물품들을 콘솔(로그인)로 구매 및 관리

# Device Diagram

```mermaid
classDiagram
    class Device {
        <<abstract>>
        +String powerConsumption
        +int warranty
        +String carbonEmission
        +float annualEnergyCost
        +float weight
        +float height
        +float width
        +float depth
        +String size
        +String nameString
        +double priceNumber
        +printDeviceName()
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
        +cleanDevice()
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
        +connectToBluetooth()
        +disconnectFromBluetooth()
    }

    class HomeApplianceDevice {
        +String location
        +boolean iotDevice
        +boolean voiceDevice
        +setLocation(String newLocation)
        +scheduleOperation(DateTime time)
        +cancelScheduledOperation()
    }

    class KitchenDevice {
        +boolean aboutFood
        +int cookingTime
        +boolean iotDevice
        +boolean voiceDevice

        +cleanDevice()
    }

    class DeviceManage {
    	deviceStock
    	checkDeviceStock(String)
    	DeviceEditResult [record]
    	editNumDevice(String, int)
    	getDeviceStock()
    	setDeviceStock(List)
    }

    Device <|-- MobileDevice
    Device <|-- HomeApplianceDevice
    Device <|-- KitchenDevice
    INetworkConnectable <-- MobileDevice
    IIoTDevice <-- HomeApplianceDevice
    IIoTDevice <-- KitchenDevice
    IVoiceControllable <-- HomeApplianceDevice
    IVoiceControllable <-- KitchenDevice
    ICookingDevice <-- KitchenDevice
    IDeviceInfo <-- Device
```

## User Diagram

```mermaid
classDiagram
    class User {
        -String userId
        -String userPassword
        -String userName
        -String email
        -boolean admin
        -isAdmin()
        +getUserId()
        +getUserPassword()
        +getUserName()
        +getEmail()
        +setUserId(String)
        +setUserPassword(String)
        +setUserName(String)
        +setEmail(String)
        -emailValidator()
    }

    class Admin {
        -String role
        +manageDevices()
        +manageUsers()
        +getRole()
        +setRole(int)
    }

    class Client {
        -String customerType
        -String customerAddress
        -List<Map<Device, Integer>> cart
        -List<Map<Device, Integer>> purchaseList
        +viewDevices()
        +addToChart()
        +viewChart()
        +totalPriceInCart()
        +checkout()
        +viewPurchaseList()
        +getCustomerType()
        +getCustomerAddress()
        +getPurchaseList()
        +getChart()
        +setCustomerType()
        +setCustomerAddress()
        +setPurchaseList()
        +purchaseDevice()
    }
    class UserManage {
        userList
        addUser(String, String, String, String)
        deleteUser()
        modifyUser()
        getUserList()
        setUserList()
    }

    User <|-- Admin
    User <|-- Client
```

## User defined Exception

```mermaid
classDiagram
class InvalidEmailException
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
  - DeviceManage
  - UserManage
- 배성훈
  - Device
  - MobileDevice
  - HomeApplianceDevice
  - KitchenDevice

# TODO

- [x] 클래스 다이어그램 작성
- [x] 로그인 기능 구현
- [x] 장바구니 제품 추가
  - [x] DeviceManage
- [x] 장바구니 리스트
  - [x] DeviceManage
- [x] 장바구니 전체 가격
  - [x] DeviceManage
- [x] 잔여 수량
  - [x] DeviceManage
- [ ] 제품 입고
- [ ] 유저 추가
- [ ] 유저 삭제
- [ ] 유저 수정
- [ ] 구매 이력
