#import <Foundation/Foundation.h>

@interface org_json_simple_parser_ParseException : NSObject

+ (org_json_simple_parser_ParseException*)valueWithInt:(int)arg0;
+ (org_json_simple_parser_ParseException*)valueWithInt:(int)arg0 withObject:(id)arg1;
+ (org_json_simple_parser_ParseException*)valueWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2;
- (int)getErrorType;
- (void)setErrorTypeWithInt:(int)arg0;
- (int)getPosition;
- (void)setPositionWithInt:(int)arg0;
- (id)getUnexpectedObject;
- (void)setUnexpectedObjectWithObject:(id)arg0;
- (NSString*)getMessage;

@end