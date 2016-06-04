#import <Foundation/Foundation.h>

#define org_json_simple_parser_JSONParser_S_INIT 0
#define org_json_simple_parser_JSONParser_S_IN_FINISHED_VALUE 1
#define org_json_simple_parser_JSONParser_S_IN_OBJECT 2
#define org_json_simple_parser_JSONParser_S_IN_ARRAY 3
#define org_json_simple_parser_JSONParser_S_PASSED_PAIR_KEY 4
#define org_json_simple_parser_JSONParser_S_IN_PAIR_VALUE 5
#define org_json_simple_parser_JSONParser_S_END 6
#define org_json_simple_parser_JSONParser_S_IN_ERROR -1

@interface org_json_simple_parser_JSONParser : NSObject

+ (org_json_simple_parser_JSONParser*)value;
- (void)reset;
- (void)resetWithReader:(id)arg0;
- (int)getPosition;
- (id)parseWithString:(NSString*)arg0;
- (id)parseWithString:(NSString*)arg0 ContainerFactory:(id)arg1;
- (id)parseWithReader:(id)arg0;
- (id)parseWithReader:(id)arg0 ContainerFactory:(id)arg1;
- (void)parseWithString:(NSString*)arg0 ContentHandler:(id)arg1;
- (void)parseWithString:(NSString*)arg0 ContentHandler:(id)arg1 Boolean:(bool)arg2;
- (void)parseWithReader:(id)arg0 ContentHandler:(id)arg1;
- (void)parseWithReader:(id)arg0 ContentHandler:(id)arg1 Boolean:(bool)arg2;
- (int)hashCode;
- (bool)equalsWithObject:(id)arg0;
- (NSString*)toString;

@end
