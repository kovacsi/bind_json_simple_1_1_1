#import <Foundation/Foundation.h>


@interface org_json_simple_ItemList : NSObject

+ (org_json_simple_ItemList*)value;
+ (org_json_simple_ItemList*)valueWithString:(NSString*)arg0;
+ (org_json_simple_ItemList*)valueWithString:(NSString*)arg0 String:(NSString*)arg1;
+ (org_json_simple_ItemList*)valueWithString:(NSString*)arg0 String:(NSString*)arg1 Boolean:(bool)arg2;
- (id)getItems;
- (id)getArray;
- (void)splitWithString:(NSString*)arg0 String:(NSString*)arg1 List:(id)arg2 Boolean:(bool)arg3;
- (void)splitWithString:(NSString*)arg0 String:(NSString*)arg1 List:(id)arg2;
- (void)setSPWithString:(NSString*)arg0;
- (void)addWithInt:(int)arg0 String:(NSString*)arg1;
- (void)addWithString:(NSString*)arg0;
- (void)addAllWithItemList:(org_json_simple_ItemList*)arg0;
- (void)addAllWithString:(NSString*)arg0;
- (void)addAllWithString:(NSString*)arg0 String:(NSString*)arg1;
- (void)addAllWithString:(NSString*)arg0 String:(NSString*)arg1 Boolean:(bool)arg2;
- (NSString*)getWithInt:(int)arg0;
- (int)size;
- (NSString*)toString;
- (NSString*)toStringWithString:(NSString*)arg0;
- (void)clear;
- (void)reset;
- (int)hashCode;
- (bool)equalsWithObject:(id)arg0;

@end
