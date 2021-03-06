/*
 * Copyright (C) 2014 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coreanimation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.opengles.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAMediaTimingFunction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class CAMediaTimingFunctionPtr extends Ptr<CAMediaTimingFunction, CAMediaTimingFunctionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAMediaTimingFunction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAMediaTimingFunction() {}
    protected CAMediaTimingFunction(SkipInit skipInit) { super(skipInit); }
    public CAMediaTimingFunction(float c1x, float c1y, float c2x, float c2y) { super((SkipInit) null); initObject(initWithControlPoints$$$$(c1x, c1y, c2x, c2y)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCAMediaTimingFunctionLinear")
    public static native String FunctionLinear();
    @GlobalValue(symbol="kCAMediaTimingFunctionEaseIn")
    public static native String FunctionEaseIn();
    @GlobalValue(symbol="kCAMediaTimingFunctionEaseOut")
    public static native String FunctionEaseOut();
    @GlobalValue(symbol="kCAMediaTimingFunctionEaseInEaseOut")
    public static native String FunctionEaseInEaseOut();
    @GlobalValue(symbol="kCAMediaTimingFunctionDefault")
    public static native String FunctionDefault();
    
    @Method(selector = "initWithControlPoints::::")
    protected native @Pointer long initWithControlPoints$$$$(float c1x, float c1y, float c2x, float c2y);
    @Method(selector = "getControlPointAtIndex:values:")
    public native void getControlPointAtIndex$values$(@MachineSizedUInt long idx, FloatPtr ptr);
    @Method(selector = "functionWithName:")
    public static native NSObject functionWithName$(String name);
    @Method(selector = "functionWithControlPoints::::")
    public static native NSObject functionWithControlPoints$$$$(float c1x, float c1y, float c2x, float c2y);
    @Method(selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);
    /*</methods>*/
}
