#import <Foundation/Foundation.h>

@interface x_org_json_simple_JSONArray : NSObject
+ (x_org_json_simple_JSONArray*) valueWithCollection:(id) arg0;
+ (void) writeJSONStringWithCollectionWithWriter:(id) arg0 :(id) arg1;
- (void) writeJSONStringWithWriter:(id) arg0;
+ (NSString*) toJSONStringWithCollection:(id) arg0;
+ (void) writeJSONStringWithByteWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithByte:(id) arg0;
+ (void) writeJSONStringWithShortWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithShort:(id) arg0;
+ (void) writeJSONStringWithIntWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithInt:(id) arg0;
+ (void) writeJSONStringWithLongWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithLong:(id) arg0;
+ (void) writeJSONStringWithFloatWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithFloat:(id) arg0;
+ (void) writeJSONStringWithDoubleWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithDouble:(id) arg0;
+ (void) writeJSONStringWithBooleanWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithBoolean:(id) arg0;
+ (void) writeJSONStringWithCharWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithChar:(id) arg0;
+ (void) writeJSONStringWithObjectWithWriter:(id) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithObject:(id) arg0;
- (NSString*) toJSONString;
- (NSString*) toString;
@end
