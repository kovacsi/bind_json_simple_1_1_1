#import <Foundation/Foundation.h>


@interface JBJSONArray : NSObject

+ (JBJSONArray*)value;
+ (JBJSONArray*)valueWithCollection:(id)arg0;
+ (void)writeJSONStringWithCollection:(id)arg0 withWriter:(id)arg1;
- (void)writeJSONStringWithWriter:(id)arg0;
+ (NSString*)toJSONStringWithCollection:(id)arg0;
+ (void)writeJSONStringWithByte:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithByte:(id)arg0;
+ (void)writeJSONStringWithShort:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithShort:(id)arg0;
+ (void)writeJSONStringWithInt:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithInt:(id)arg0;
+ (void)writeJSONStringWithLong:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithLong:(id)arg0;
+ (void)writeJSONStringWithFloat:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithFloat:(id)arg0;
+ (void)writeJSONStringWithDouble:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithDouble:(id)arg0;
+ (void)writeJSONStringWithBoolean:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithBoolean:(id)arg0;
+ (void)writeJSONStringWithChar:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithChar:(id)arg0;
+ (void)writeJSONStringWithObject:(id)arg0 withWriter:(id)arg1;
+ (NSString*)toJSONStringWithObject:(id)arg0;
- (NSString*)toJSONString;
- (NSString*)toString;

@end
