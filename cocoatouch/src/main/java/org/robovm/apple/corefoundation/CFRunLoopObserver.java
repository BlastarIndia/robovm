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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFRunLoopObserver/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFRunLoopObserverPtr extends Ptr<CFRunLoopObserver, CFRunLoopObserverPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFRunLoopObserver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFRunLoopObserver() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFRunLoopObserverGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFRunLoopObserverCreate")
    public static native CFRunLoopObserver create(CFAllocator allocator, CFRunLoopActivity activities, boolean repeats, @MachineSizedSInt long order, FunctionPtr callout, CFRunLoopObserverContext context);
    @Bridge(symbol="CFRunLoopObserverCreateWithHandler")
    public static native CFRunLoopObserver createWithHandler(CFAllocator allocator, CFRunLoopActivity activities, boolean repeats, @MachineSizedSInt long order, ObjCBlock block);
    @Bridge(symbol="CFRunLoopObserverGetActivities")
    public native CFRunLoopActivity getActivities();
    @Bridge(symbol="CFRunLoopObserverDoesRepeat")
    public native boolean doesRepeat();
    @Bridge(symbol="CFRunLoopObserverGetOrder")
    public native @MachineSizedSInt long getOrder();
    @Bridge(symbol="CFRunLoopObserverInvalidate")
    public native void invalidate();
    @Bridge(symbol="CFRunLoopObserverIsValid")
    public native boolean isValid();
    @Bridge(symbol="CFRunLoopObserverGetContext")
    public native void getContext(CFRunLoopObserverContext context);
    /*</methods>*/
}
