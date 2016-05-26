#import <Foundation/Foundation.h>

@interface x_org_json_simple_parser_JSONParser : NSObject
- (void) reset;
- (void) resetWithReader:(id) arg0;
- (int) getPosition;
- (NSObject*) parseWithString:(NSString*) arg0;
- (NSObject*) parseWithStringWithContainerFactory:(NSString*) arg0 :(id) arg1;
- (NSObject*) parseWithReader:(id) arg0;
- (NSObject*) parseWithReaderWithContainerFactory:(id) arg0 :(id) arg1;
- (void) parseWithStringWithContentHandler:(NSString*) arg0 :(id) arg1;
- (void) parseWithStringWithContentHandlerWithBoolean:(NSString*) arg0 :(id) arg1 :(bool) arg2;
- (void) parseWithReaderWithContentHandler:(id) arg0 :(id) arg1;
- (void) parseWithReaderWithContentHandlerWithBoolean:(id) arg0 :(id) arg1 :(bool) arg2;
@end
