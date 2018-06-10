
# react-native-adscend-media

AdscendMedia support for **Android**

## Getting started

`$ npm install react-native-adscend-media --save`

### Mostly automatic installation

`$ react-native link react-native-adscend-media`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import me.jerson.mobile.ads.RNAdscendMediaPackage;` to the imports at the top of the file
  - Add `new RNAdscendMediaPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-adscend-media'
  	project(':react-native-adscend-media').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-adscend-media/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-adscend-media')
  	```


## Usage
```javascript
import AdscendMedia from 'react-native-adscend-media';

AdscendMedia.showIntentForMarketResearch(publisherId, profileId, subId);
```
  