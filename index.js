import { Platform, NativeModules } from "react-native";

const { RNAdscendMedia } = NativeModules;

const TAG = "[AdscendMedia]";
export default class AdscendMedia {
  static manager = NativeModules.AdscendMedia;

  static showIntentForMarketResearch(publisherId, profileId, subId) {
    __DEV__ &&
      console.debug(
        TAG,
        "showIntentForMarketResearch",
        publisherId,
        profileId,
        subId
      );
    if (Platform.OS !== "android") {
      __DEV__ && console.warn(TAG, "not supported on", Platform.OS);
      return;
    }
    RNAdscendMedia.showIntentForMarketResearch(publisherId, profileId, subId);
  }
}
