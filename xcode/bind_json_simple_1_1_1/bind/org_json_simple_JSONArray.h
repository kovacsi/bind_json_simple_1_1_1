#import <Foundation/Foundation.h>


@interface org_json_simple_JSONArray : NSObject

- (org_json_simple_JSONArray*)init;
+ (org_json_simple_JSONArray*)value;
+ (org_json_simple_JSONArray*)valueWithCollection:(id)arg0;
+ (void)writeJSONStringWithCollection:(id)arg0 Writer:(id)arg1;
- (void)writeJSONStringWithWriter:(id)arg0;
+ (NSString*)toJSONStringWithCollection:(id)arg0;
+ (void)writeJSONStringWithByte_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithByte_array:(id)arg0;
+ (void)writeJSONStringWithShort_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithShort_array:(id)arg0;
+ (void)writeJSONStringWithInt_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithInt_array:(id)arg0;
+ (void)writeJSONStringWithLong_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithLong_array:(id)arg0;
+ (void)writeJSONStringWithFloat_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithFloat_array:(id)arg0;
+ (void)writeJSONStringWithDouble_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithDouble_array:(id)arg0;
+ (void)writeJSONStringWithBoolean_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithBoolean_array:(id)arg0;
+ (void)writeJSONStringWithChar_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithChar_array:(id)arg0;
+ (void)writeJSONStringWithObject_array:(id)arg0 Writer:(id)arg1;
+ (NSString*)toJSONStringWithObject_array:(id)arg0;
- (NSString*)toJSONString;
- (NSString*)toString;
- (void)trimToSize;
- (void)ensureCapacityWithInt:(int)arg0;
- (int)size;
- (bool)isEmpty;
- (bool)containsWithObject:(id)arg0;
- (int)indexOfWithObject:(id)arg0;
- (int)lastIndexOfWithObject:(id)arg0;
- (id)clone;
- (id)toArray;
- (id)toArrayWithObject_array:(id)arg0;
- (id)getWithInt:(int)arg0;
- (id)setWithInt:(int)arg0 Object:(id)arg1;
- (bool)addWithObject:(id)arg0;
- (void)addWithInt:(int)arg0 Object:(id)arg1;
- (id)removeWithInt:(int)arg0;
- (bool)removeWithObject:(id)arg0;
- (void)clear;
- (bool)addAllWithCollection:(id)arg0;
- (bool)addAllWithInt:(int)arg0 Collection:(id)arg1;
- (bool)removeAllWithCollection:(id)arg0;
- (bool)retainAllWithCollection:(id)arg0;
- (id)listIteratorWithInt:(int)arg0;
- (id)listIterator;
- (id)iterator;
- (id)subListWithInt:(int)arg0 Int:(int)arg1;
- (void)forEachWithConsumer:(id)arg0;
- (bool)removeIfWithPredicate:(id)arg0;
- (void)replaceAllWithUnaryOperator:(id)arg0;

@end
