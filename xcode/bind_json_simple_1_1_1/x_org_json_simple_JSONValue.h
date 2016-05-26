#import <Foundation/Foundation.h>

@interface x_org_json_simple_JSONValue : NSObject
+ (NSObject*) parseWithReader:(id) arg0;
+ (NSObject*) parseWithString:(NSString*) arg0;
+ (NSObject*) parseWithExceptionWithReader:(id) arg0;
+ (NSObject*) parseWithExceptionWithString:(NSString*) arg0;
+ (void) writeJSONStringWithObjectWithWriter:(NSObject*) arg0 :(id) arg1;
+ (NSString*) toJSONStringWithObject:(NSObject*) arg0;
+ (NSString*) escapeWithString:(NSString*) arg0;
@end
