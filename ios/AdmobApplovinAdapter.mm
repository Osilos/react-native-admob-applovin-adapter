#import "AdmobApplovinAdapter.h"
#import <AppLovinSDK/AppLovinSDK.h>

@implementation AdmobApplovinAdapter
RCT_EXPORT_MODULE()

- (void) setConsent:(BOOL)value {
  [ALPrivacySettings setHasUserConsent:YES];
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeAdmobApplovinAdapterSpecJSI>(params);
}

@end
