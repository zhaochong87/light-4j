/*
 * Copyright (c) 2016 Network New Technologies Inc.
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

package com.networknt.sanitizer;

import java.util.List;

/**
 * Sanitizer configuration class
 *
 * @author Steve Hu
 */
public class SanitizerConfig {
    private boolean enabled;
    private boolean sanitizeBody;
    private boolean sanitizeHeader;
    private List<String> attributesToIgnore;
    private EncodingStrategy encodingStrategy;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isSanitizeBody() {
        return sanitizeBody;
    }

    public void setSanitizeBody(boolean sanitizeBody) {
        this.sanitizeBody = sanitizeBody;
    }

    public boolean isSanitizeHeader() {
        return sanitizeHeader;
    }

    public void setSanitizeHeader(boolean sanitizeHeader) {
        this.sanitizeHeader = sanitizeHeader;
    }

    public EncodingStrategy getEncodingStrategy() {
        return encodingStrategy;
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public List<String> getAttributesToIgnore() {
        return attributesToIgnore;
    }

    public void setAttributesToIgnore(List<String> attributesToIgnore) {
        this.attributesToIgnore = attributesToIgnore;
    }
}
