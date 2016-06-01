#import <Foundation/Foundation.h>

@interface ParseException : NSObject

+ (ParseException*)valueWithInt:(int)arg0;
+ (ParseException*)valueWithInt:(int)arg0 withObject:(id)arg1;
+ (ParseException*)valueWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2;
- (int)getErrorType;
- (void)setErrorTypeWithInt:(int)arg0;
- (int)getPosition;
- (void)setPositionWithInt:(int)arg0;
- (id)getUnexpectedObject;
- (void)setUnexpectedObjectWithObject:(id)arg0;
- (NSString*)getMessage;

@end