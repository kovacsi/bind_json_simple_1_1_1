#import <Foundation/Foundation.h>

@interface x_org_json_simple_ItemList : NSObject
+ (x_org_json_simple_ItemList*) valueWithString:(NSString*) arg0;
+ (x_org_json_simple_ItemList*) valueWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
+ (x_org_json_simple_ItemList*) valueWithStringWithStringWithBoolean:(NSString*) arg0 :(NSString*) arg1 :(bool) arg2;
- (id) getItems;
- (id) getArray;
- (void) splitWithStringWithStringWithListWithBoolean:(NSString*) arg0 :(NSString*) arg1 :(id) arg2 :(bool) arg3;
- (void) splitWithStringWithStringWithList:(NSString*) arg0 :(NSString*) arg1 :(id) arg2;
- (void) setSPWithString:(NSString*) arg0;
- (void) addWithIntWithString:(int) arg0 :(NSString*) arg1;
- (void) addWithString:(NSString*) arg0;
- (void) addAllWithItemList:(id) arg0;
- (void) addAllWithString:(NSString*) arg0;
- (void) addAllWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (void) addAllWithStringWithStringWithBoolean:(NSString*) arg0 :(NSString*) arg1 :(bool) arg2;
- (NSString*) getWithInt:(int) arg0;
- (int) size;
- (NSString*) toString;
- (NSString*) toStringWithString:(NSString*) arg0;
- (void) clear;
- (void) reset;
@end
