#import <Foundation/Foundation.h>

@interface ItemList : NSObject

+ (ItemList*)value;
+ (ItemList*)valueWithString:(NSString*)arg0;
+ (ItemList*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1;
+ (ItemList*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1 withBoolean:(bool)arg2;
- (id)getItems;
- (id)getArray;
- (void)splitWithString:(NSString*)arg0 withString:(NSString*)arg1 withList:(id)arg2 withBoolean:(bool)arg3;
- (void)splitWithString:(NSString*)arg0 withString:(NSString*)arg1 withList:(id)arg2;
- (void)setSPWithString:(NSString*)arg0;
- (void)addWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)addWithString:(NSString*)arg0;
- (void)addAllWithItemList:(ItemList*)arg0;
- (void)addAllWithString:(NSString*)arg0;
- (void)addAllWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (void)addAllWithString:(NSString*)arg0 withString:(NSString*)arg1 withBoolean:(bool)arg2;
- (NSString*)getWithInt:(int)arg0;
- (int)size;
- (NSString*)toString;
- (NSString*)toStringWithString:(NSString*)arg0;
- (void)clear;
- (void)reset;

@end