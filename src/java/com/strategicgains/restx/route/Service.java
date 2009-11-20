/*
 * Copyright 2009, Strategic Gains, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
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

package com.strategicgains.restx.route;

import com.strategicgains.restx.serialization.DeserializationException;
import com.strategicgains.restx.serialization.SerializationException;


/**
 * A service is the end-user-provided functionality that RestX invokes.
 * 
 * @author toddf
 * @since Nov 20, 2009
 */
public interface Service
{
	public Object deserialize(Request request)
	throws DeserializationException;

	public Object process(Request request, Object message)
	throws ServiceException;

	public Response serialize(Request request, Object object)
	throws SerializationException;
}