#import <Foundation/Foundation.h>

#define org_json_simple_parser_Yytoken_TYPE_VALUE 0
#define org_json_simple_parser_Yytoken_TYPE_LEFT_BRACE 1
#define org_json_simple_parser_Yytoken_TYPE_RIGHT_BRACE 2
#define org_json_simple_parser_Yytoken_TYPE_LEFT_SQUARE 3
#define org_json_simple_parser_Yytoken_TYPE_RIGHT_SQUARE 4
#define org_json_simple_parser_Yytoken_TYPE_COMMA 5
#define org_json_simple_parser_Yytoken_TYPE_COLON 6
#define org_json_simple_parser_Yytoken_TYPE_EOF -1

@interface org_json_simple_parser_Yytoken : NSObject

+ (org_json_simple_parser_Yytoken*)valueWithInt:(int)arg0 Object:(id)arg1;
- (NSString*)toString;
- (int)hashCode;
- (bool)equalsWithObject:(id)arg0;

@end
