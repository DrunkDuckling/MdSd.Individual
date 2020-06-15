# MDSD-Individual-Handin
Project created for the individual report for Model Driven Software Development; Summer 2020


# Xtext example 
```
Application MapsAppTest
permissions 
    "android.permission.INTERNET", 
    "android.permission.ACCESS_FINE_LOCATION", 
    "android.permission.ACCESS_COARSE_LOCATION"
Android-SDK: 29
Target-SDK: 29
Minimum-SDK: 25
elements
  Fragment MapFragment
    Map
      FilterQuery Hotels
      Distance:m = 3000
  Fragment FragmentSetting
    Settings
  Fragment EmptyFragment
  Fragment LayoutTesting
    Spinner spinner,
    Button BtnTest
      Toast 'Hello world.',
      Bundle EmptyFragment,
    EditText text
  Fragment MulitpleTest
```
 
