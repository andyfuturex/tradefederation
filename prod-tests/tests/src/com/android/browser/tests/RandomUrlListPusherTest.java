/*
 * Copyright (C) 2012 The Android Open Source Project
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

package com.android.browser.tests;

import java.io.File;
import java.util.List;

import junit.framework.TestCase;

/**
 * Functional test for {@link RandomUrlListPusher}
 *
 */
public class RandomUrlListPusherTest extends TestCase {

    public void testGetRandomLinesFromFile() throws Exception {
        RandomUrlListPusher pusher = new RandomUrlListPusher();
        File urlPool = new File("/home/android-test/testdata/browser/urllist_http");
        int numUrls = 50;
        List<String> urls = pusher.getRandomLinesFromFile(urlPool, numUrls);
        boolean hasEmptyString = false;
        int count = 0;
        for (String url : urls) {
            hasEmptyString |= url.isEmpty();
            count++;
        }
        assertFalse("random URL list has empty string", hasEmptyString);
        assertEquals("did not get expected number of URLs", numUrls, count);
    }
}
