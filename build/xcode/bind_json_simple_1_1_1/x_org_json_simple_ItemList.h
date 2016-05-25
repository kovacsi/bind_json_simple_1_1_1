#import <Foundation/Foundation.h>

@interface x_org_json_simple_ItemList : NSObject
+ (x_org_json_simple_ItemList*) valueWithString:(NSString*) arg0;
+ (x_org_json_simple_ItemList*) valueWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
+ (x_org_json_simple_ItemList*) valueWithStringWithStringWithBool:(NSString*) arg0 :(NSString*) arg1 :(bool) arg2;
- (id) getItems;
- (id) getArray;
- (void) split:(NSString*) arg0 :(NSString*) arg1 :(id) arg2 :(bool) arg3;
- (void) split:(NSString*) arg0 :(NSString*) arg1 :(id) arg2;
- (void) setSP:(NSString*) arg0;
- (void) add:(int) arg0 :(NSString*) arg1;
- (void) add:(NSString*) arg0;
- (void) addAll:(id) arg0;
- (void) addAll:(NSString*) arg0 :(NSString*) arg1;
- (void) addAll:(NSString*) arg0 :(NSString*) arg1 :(bool) arg2;
- (NSString*) get:(int) arg0;
- (int) size;
- (NSString*) toString;
- (NSString*) toString:(NSString*) arg0;
- (void) clear;
- (void) reset;
@end
