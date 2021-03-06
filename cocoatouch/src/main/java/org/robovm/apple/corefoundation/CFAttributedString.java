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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFAttributedString/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFAttributedStringPtr extends Ptr<CFAttributedString, CFAttributedStringPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFAttributedString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFAttributedString() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFAttributedStringGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFAttributedStringCreate")
    public static native CFAttributedString create(CFAllocator alloc, CFString str, CFDictionary attributes);
    @Bridge(symbol="CFAttributedStringCreateWithSubstring")
    public static native CFAttributedString createWithSubstring(CFAllocator alloc, CFAttributedString aStr, @ByVal CFRange range);
    @Bridge(symbol="CFAttributedStringCreateCopy")
    public static native CFAttributedString createCopy(CFAllocator alloc, CFAttributedString aStr);
    @Bridge(symbol="CFAttributedStringGetString")
    public native CFString getString();
    @Bridge(symbol="CFAttributedStringGetLength")
    public native @MachineSizedSInt long getLength();
    @Bridge(symbol="CFAttributedStringGetAttributes")
    public native CFDictionary getAttributes(@MachineSizedSInt long loc, CFRange effectiveRange);
    @Bridge(symbol="CFAttributedStringGetAttribute")
    public native CFType getAttribute(@MachineSizedSInt long loc, CFString attrName, CFRange effectiveRange);
    @Bridge(symbol="CFAttributedStringGetAttributesAndLongestEffectiveRange")
    public native CFDictionary getAttributesAndLongestEffectiveRange(@MachineSizedSInt long loc, @ByVal CFRange inRange, CFRange longestEffectiveRange);
    @Bridge(symbol="CFAttributedStringGetAttributeAndLongestEffectiveRange")
    public native CFType getAttributeAndLongestEffectiveRange(@MachineSizedSInt long loc, CFString attrName, @ByVal CFRange inRange, CFRange longestEffectiveRange);
    /*</methods>*/
}
