#import <Foundation/Foundation.h>


@interface org_json_simple_JSONObject : NSObject

- (org_json_simple_JSONObject*)init;
+ (org_json_simple_JSONObject*)value;
+ (org_json_simple_JSONObject*)valueWithMap:(id)arg0;
+ (void)writeJSONStringWithMap:(id)arg0 Writer:(id)arg1;
- (void)writeJSONStringWithWriter:(id)arg0;
+ (NSString*)toJSONStringWithMap:(id)arg0;
- (NSString*)toJSONString;
- (NSString*)toString;
+ (NSString*)toStringWithString:(NSString*)arg0 Object:(id)arg1;
+ (NSString*)escapeWithString:(NSString*)arg0;
- (int)size;
- (bool)isEmpty;
- (id)getWithObject:(id)arg0;
- (bool)containsKeyWithObject:(id)arg0;
- (id)putWithObject:(id)arg0 Object:(id)arg1;
- (void)putAllWithMap:(id)arg0;
- (id)removeWithObject:(id)arg0;
- (void)clear;
- (bool)containsValueWithObject:(id)arg0;
- (id)keySet;
- (id)values;
- (id)entrySet;
- (id)getOrDefaultWithObject:(id)arg0 Object:(id)arg1;
- (id)putIfAbsentWithObject:(id)arg0 Object:(id)arg1;
- (bool)removeWithObject:(id)arg0 Object:(id)arg1;
- (bool)replaceWithObject:(id)arg0 Object:(id)arg1 Object:(id)arg2;
- (id)replaceWithObject:(id)arg0 Object:(id)arg1;
- (id)computeIfAbsentWithObject:(id)arg0 Function:(id)arg1;
- (id)computeIfPresentWithObject:(id)arg0 BiFunction:(id)arg1;
- (id)computeWithObject:(id)arg0 BiFunction:(id)arg1;
- (id)mergeWithObject:(id)arg0 Object:(id)arg1 BiFunction:(id)arg2;
- (void)forEachWithBiConsumer:(id)arg0;
- (void)replaceAllWithBiFunction:(id)arg0;
- (id)clone;

@end
