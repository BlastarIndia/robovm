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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 * Root interface for all protocol interfaces in the Cocoa/CocoaTouch bindings. This
 * interface adds a {@link Marshaler} for {@link String}s to/from {@link NSString}.
 */
@Marshaler(NSString.AsStringMarshaler.class)
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSObjectProtocol/*</name>*/ 
    /*<implements>*/extends ObjCProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    boolean isEqual(NSObject object);
    @Method(selector = "hash")
    @MachineSizedUInt long hash();
    @Method(selector = "performSelector:")
    NSObject performSelector(Selector aSelector);
    @Method(selector = "performSelector:withObject:")
    NSObject performSelector(Selector aSelector, NSObject object);
    @Method(selector = "performSelector:withObject:withObject:")
    NSObject performSelector(Selector aSelector, NSObject object1, NSObject object2);
    @Method(selector = "isKindOfClass:")
    boolean isKindOfClass(ObjCClass aClass);
    @Method(selector = "isMemberOfClass:")
    boolean isMemberOfClass(ObjCClass aClass);
    @Method(selector = "conformsToProtocol:")
    boolean conformsToProtocol(ObjCProtocol aProtocol);
    @Method(selector = "respondsToSelector:")
    boolean respondsToSelector(Selector aSelector);
    @Method(selector = "retain")
    NSObject retain();
    @Method(selector = "release")
    void release();
    @Method(selector = "autorelease")
    NSObject autorelease();
    @Method(selector = "retainCount")
    @MachineSizedUInt long retainCount();
    @Method(selector = "description")
    String description();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
