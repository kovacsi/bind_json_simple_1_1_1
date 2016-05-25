#import <Foundation/Foundation.h>

@interface x_org_json_simple_parser_ParseException : NSObject
+ (x_org_json_simple_parser_ParseException*) valueWithInt:(int) arg0;
+ (x_org_json_simple_parser_ParseException*) valueWithIntWithObject:(int) arg0 :(NSObject*) arg1;
+ (x_org_json_simple_parser_ParseException*) valueWithIntWithIntWithObject:(int) arg0 :(int) arg1 :(NSObject*) arg2;
- (int) getErrorType;
- (void) setErrorType:(int) arg0;
- (void) setPosition:(int) arg0;
- (NSObject*) getUnexpectedObject;
- (void) setUnexpectedObject:(NSObject*) arg0;
- (NSString*) getMessage;
@end
