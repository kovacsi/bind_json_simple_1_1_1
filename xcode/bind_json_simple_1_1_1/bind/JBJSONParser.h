#import <Foundation/Foundation.h>

#define S_INIT 0
#define S_IN_FINISHED_VALUE 1
#define S_IN_OBJECT 2
#define S_IN_ARRAY 3
#define S_PASSED_PAIR_KEY 4
#define S_IN_PAIR_VALUE 5
#define S_END 6
#define S_IN_ERROR -1

@interface JBJSONParser : NSObject

+ (JBJSONParser*)value;
- (void)reset;
- (void)resetWithReader:(id)arg0;
- (int)getPosition;
- (id)parseWithString:(NSString*)arg0;
- (id)parseWithString:(NSString*)arg0 withContainerFactory:(id)arg1;
- (id)parseWithReader:(id)arg0;
- (id)parseWithReader:(id)arg0 withContainerFactory:(id)arg1;
- (void)parseWithString:(NSString*)arg0 withContentHandler:(id)arg1;
- (void)parseWithString:(NSString*)arg0 withContentHandler:(id)arg1 withBoolean:(bool)arg2;
- (void)parseWithReader:(id)arg0 withContentHandler:(id)arg1;
- (void)parseWithReader:(id)arg0 withContentHandler:(id)arg1 withBoolean:(bool)arg2;

@end
