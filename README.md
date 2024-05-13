# MRE for [b/340133012](https://issuetracker.google.com/issues/340133012)

The delay set in LayoutTransition is not respected in new versions of Android (api 26+) and animations start playing at the same time. On old versions of Android (api 25 and lower) the delay works as expected.

Previously reported in https://issuetracker.google.com/issues/79235252 and https://issuetracker.google.com/issues/79478637

Doesn't work:
- Emulator API 35

  Build number AP31.240322.020

- Emulator API 34

  Build number sdk_phone64_arm64-userdebug 14 UE1A.230829.036.A1 11228894 test-keys

- Emulator API 26

  Build number sdk_phone_arm64-userdebug 8.0.0 OSR1.180418.028.A2 10042266 test-keys

Works:
- Emulator API 25

  Build number sdk_phone_arm64-userdebug 7.1.1 NYC 8695018 test-keys
