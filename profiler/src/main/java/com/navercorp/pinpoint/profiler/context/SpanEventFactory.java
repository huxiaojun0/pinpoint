/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context;

/**
 * @author Woonduk Kang(emeroad)
 */
public class SpanEventFactory implements CallStack.Factory<SpanEvent> {
    private static final SpanEvent DUMMY = new SpanEvent();

    @Override
    public Class<SpanEvent> getType() {
        return SpanEvent.class;
    }

    @Override
    public SpanEvent newInstance() {
        return new SpanEvent();
    }

    @Override
    public SpanEvent dummyInstance() {
        return DUMMY;
    }

    @Override
    public boolean isDummy(SpanEvent element) {
        return DUMMY == element;
    }

    @Override
    public void markDepth(SpanEvent element, int index) {
        element.setDepth(index);
    }

    @Override
    public void setSequence(SpanEvent element, short sequence) {
        element.setSequence(sequence);
    }

    @Override
    public String toString() {
        return "SpanEventFactory{}";
    }
}
