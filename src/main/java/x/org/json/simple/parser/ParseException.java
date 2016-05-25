package x.org.json.simple.parser;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_json_simple_parser_ParseException")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ParseException extends NSObject {

	private org.json.simple.parser.ParseException original;

	protected ParseException(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithInt:")
	public ParseException valueWithInt(int arg0) {
		ParseException self = (ParseException) ParseException.alloc().init();
		self.original = new org.json.simple.parser.ParseException(arg0);
		return self;
	}

	@Selector("valueWithIntWithObject::")
	public ParseException valueWithIntWithObject(int arg0, Object arg1) {
		ParseException self = (ParseException) ParseException.alloc().init();
		self.original = new org.json.simple.parser.ParseException(arg0, arg1);
		return self;
	}

	@Selector("valueWithIntWithIntWithObject:::")
	public ParseException valueWithIntWithIntWithObject(int arg0, int arg1, Object arg2) {
		ParseException self = (ParseException) ParseException.alloc().init();
		self.original = new org.json.simple.parser.ParseException(arg0, arg1, arg2);
		return self;
	}

	@Selector("getErrorType")
	public int getErrorType() {
		return original.getErrorType();
	}

	@Selector("setErrorType:")
	public void setErrorType(int arg0) {
		original.setErrorType(arg0);
	}

	@Selector("getPosition")
	public int getPosition() {
		return original.getPosition();
	}

	@Selector("setPosition:")
	public void setPosition(int arg0) {
		original.setPosition(arg0);
	}

	@Selector("getUnexpectedObject")
	public Object getUnexpectedObject() {
		return original.getUnexpectedObject();
	}

	@Selector("setUnexpectedObject:")
	public void setUnexpectedObject(Object arg0) {
		original.setUnexpectedObject(arg0);
	}

	@Selector("getMessage")
	public String getMessage() {
		return original.getMessage();
	}

}
