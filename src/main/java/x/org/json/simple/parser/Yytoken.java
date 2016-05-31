package x.org.json.simple.parser;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_json_simple_parser_Yytoken")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Yytoken extends NSObject {	
	
	public org.json.simple.parser.Yytoken original;	
	
	protected Yytoken(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withObject:")	
	public Yytoken value(int arg0, Object arg1) {
		Yytoken self = (Yytoken) Yytoken.alloc().init();		
		self.original = new org.json.simple.parser.Yytoken(arg0, arg1);		
		return self;		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
