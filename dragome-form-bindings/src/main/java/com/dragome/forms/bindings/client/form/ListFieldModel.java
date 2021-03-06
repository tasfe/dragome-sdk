/*
 * Copyright 2009 Andrew Pietsch 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at 
 *      
 *      http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing permissions 
 * and limitations under the License. 
 */

package com.dragome.forms.bindings.client.form;

/**
 * Basic type for fields that contain a list of values.  This type exists to allow the API to cleanly
 * separate (in a code completion context) between the various types.  I.e. the api can
 * use the type {@link ListFieldModelBase} if it applies to both {@link ListFieldModel}s and {@link FormattedListFieldModel}s
 * or it can reference the types explicitly.
 */
public interface ListFieldModel<T> extends ListFieldModelBase<T>
{
}