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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFFileSecurity/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFFileSecurityPtr extends Ptr<CFFileSecurity, CFFileSecurityPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFFileSecurity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFFileSecurity() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFFileSecurityGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFFileSecurityCreate")
    public static native CFFileSecurity create(CFAllocator allocator);
    @Bridge(symbol="CFFileSecurityCreateCopy")
    public static native CFFileSecurity createCopy(CFAllocator allocator, CFFileSecurity fileSec);
    @Bridge(symbol="CFFileSecurityCopyOwnerUUID")
    public native boolean copyOwnerUUID(CFUUID.CFUUIDPtr ownerUUID);
    @Bridge(symbol="CFFileSecuritySetOwnerUUID")
    public native boolean setOwnerUUID(CFUUID ownerUUID);
    @Bridge(symbol="CFFileSecurityCopyGroupUUID")
    public native boolean copyGroupUUID(CFUUID.CFUUIDPtr groupUUID);
    @Bridge(symbol="CFFileSecuritySetGroupUUID")
    public native boolean setGroupUUID(CFUUID groupUUID);
    @Bridge(symbol="CFFileSecurityGetOwner")
    public native boolean getOwner(IntPtr owner);
    @Bridge(symbol="CFFileSecuritySetOwner")
    public native boolean setOwner(int owner);
    @Bridge(symbol="CFFileSecurityGetGroup")
    public native boolean getGroup(IntPtr group);
    @Bridge(symbol="CFFileSecuritySetGroup")
    public native boolean setGroup(int group);
    @Bridge(symbol="CFFileSecurityGetMode")
    public native boolean getMode(ShortPtr mode);
    @Bridge(symbol="CFFileSecuritySetMode")
    public native boolean setMode(short mode);
    @Bridge(symbol="CFFileSecurityClearProperties")
    public native boolean clearProperties(CFFileSecurityClearOptions clearPropertyMask);
    /*</methods>*/
}
