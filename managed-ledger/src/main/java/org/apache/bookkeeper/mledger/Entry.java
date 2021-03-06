/**
 * Copyright 2016 Yahoo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bookkeeper.mledger;

import io.netty.buffer.ByteBuf;

import com.google.common.annotations.Beta;

/**
 * An Entry represent a ledger entry data and its associated position.
 */
@Beta
public interface Entry {

    /**
     * @return the data
     */
    byte[] getData();

    byte[] getDataAndRelease();

    /**
     * @return the entry length in bytes
     */
    int getLength();

    /**
     * @return the data buffer for the entry
     */
    ByteBuf getDataBuffer();

    /**
     * @return the position at which the entry was stored
     */
    Position getPosition();

    /**
     * Release the resources allocated for this entry
     */
    void release();
}
