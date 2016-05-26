#import <Foundation/Foundation.h>

@interface x_org_json_simple_JSONObject : NSObject
+ (x_org_json_simple_JSONObject*) valueWithMap:(id) arg0;
+ (void) writeJSONStringWithMapWithWriter:(id) arg0 :(id) arg1;
- (void) writeJSONStringWithWriter:(id) arg0;
+ (NSString*) toJSONStringWithMap:(id) arg0;
- (NSString*) toJSONString;
- (NSString*) toString;
+ (NSString*) toStringWithStringWithObject:(NSString*) arg0 :(NSObject*) arg1;
+ (NSString*) escapeWithString:(NSString*) arg0;
@end
