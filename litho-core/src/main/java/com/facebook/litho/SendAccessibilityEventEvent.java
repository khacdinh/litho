/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.view.View;

import com.facebook.litho.annotations.Event;

/**
 * Components should implement an event of this type in order to receive callbacks to
 * {@link android.support.v4.view.AccessibilityDelegateCompat#sendAccessibilityEvent(View, int)}
 */
@Event
public class SendAccessibilityEventEvent {
  public View host;
  public int eventType;
  public AccessibilityDelegateCompat superDelegate;
}
