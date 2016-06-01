#import <Foundation/Foundation.h>

#define TYPE_VALUE 0
#define TYPE_LEFT_BRACE 1
#define TYPE_RIGHT_BRACE 2
#define TYPE_LEFT_SQUARE 3
#define TYPE_RIGHT_SQUARE 4
#define TYPE_COMMA 5
#define TYPE_COLON 6
#define TYPE_EOF -1

@interface JBYytoken : NSObject

+ (JBYytoken*)valueWithInt:(int)arg0 withObject:(id)arg1;
- (NSString*)toString;

@end
