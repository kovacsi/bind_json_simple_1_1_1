#import <Foundation/Foundation.h>

@interface org_json_simple_JSONObject : NSObject

+ (org_json_simple_JSONObject*)value;
+ (org_json_simple_JSONObject*)valueWithMap:(id)arg0;
+ (void)writeJSONStringWithMap:(id)arg0 withWriter:(id)arg1;
- (void)writeJSONStringWithWriter:(id)arg0;
+ (NSString*)toJSONStringWithMap:(id)arg0;
- (NSString*)toJSONString;
- (NSString*)toString;
+ (NSString*)toStringWithString:(NSString*)arg0 withObject:(id)arg1;
+ (NSString*)escapeWithString:(NSString*)arg0;

@end