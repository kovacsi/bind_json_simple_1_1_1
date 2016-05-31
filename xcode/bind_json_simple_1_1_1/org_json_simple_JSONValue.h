#import <Foundation/Foundation.h>

@interface org_json_simple_JSONValue : NSObject

+ (org_json_simple_JSONValue*)value;
+ (id)parseWithReader:(id)arg0;
+ (id)parseWithString:(NSString*)arg0;
+ (id)parseWithExceptionWithReader:(id)arg0;
+ (id)parseWithExceptionWithString:(NSString*)arg0;
+ (void)writeJSONStringWithObject:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithObject:(id)arg0;
+ (NSString*)escapeWithString:(NSString*)arg0;

@end