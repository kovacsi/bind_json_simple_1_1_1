#import <Foundation/Foundation.h>

@interface JSONParser : NSObject

+ (JSONParser*)value;
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