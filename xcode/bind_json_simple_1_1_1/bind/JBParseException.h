#import <Foundation/Foundation.h>

#define ERROR_UNEXPECTED_CHAR 0
#define ERROR_UNEXPECTED_TOKEN 1
#define ERROR_UNEXPECTED_EXCEPTION 2

@interface JBParseException : NSObject

+ (JBParseException*)valueWithInt:(int)arg0;
+ (JBParseException*)valueWithInt:(int)arg0 withObject:(id)arg1;
+ (JBParseException*)valueWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2;
- (int)getErrorType;
- (void)setErrorTypeWithInt:(int)arg0;
- (int)getPosition;
- (void)setPositionWithInt:(int)arg0;
- (id)getUnexpectedObject;
- (void)setUnexpectedObjectWithObject:(id)arg0;
- (NSString*)getMessage;

@end
