#import <Foundation/Foundation.h>

#define org_json_simple_parser_ParseException_ERROR_UNEXPECTED_CHAR 0
#define org_json_simple_parser_ParseException_ERROR_UNEXPECTED_TOKEN 1
#define org_json_simple_parser_ParseException_ERROR_UNEXPECTED_EXCEPTION 2

@interface org_json_simple_parser_ParseException : NSObject

+ (org_json_simple_parser_ParseException*)valueWithInt:(int)arg0;
+ (org_json_simple_parser_ParseException*)valueWithInt:(int)arg0 Object:(id)arg1;
+ (org_json_simple_parser_ParseException*)valueWithInt:(int)arg0 Int:(int)arg1 Object:(id)arg2;
- (int)getErrorType;
- (void)setErrorTypeWithInt:(int)arg0;
- (int)getPosition;
- (void)setPositionWithInt:(int)arg0;
- (id)getUnexpectedObject;
- (void)setUnexpectedObjectWithObject:(id)arg0;
- (NSString*)getMessage;

@end
