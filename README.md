
# react-native-adscend-media

## Getting started

`$ npm install react-native-adscend-media --save`

### Mostly automatic installation

`$ react-native link react-native-adscend-media`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-adscend-media` and add `RNAdscendMedia.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAdscendMedia.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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
import RNAdscendMedia from 'react-native-adscend-media';

// TODO: What to do with the module?
RNAdscendMedia;
```
  