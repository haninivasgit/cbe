/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.test.pattern.factory;



public class FactoryUtils {

    /**
     * This class is not normally instantiated.
     */
    private FactoryUtils() {}

   
   


   

   


    /**
     * Creates a Factory that can create objects of a specific type using
     * the arguments specified to this method.
     *
     * @see org.apache.commons.collections4.functors.InstantiateFactory
     *
     * @param <T> the type that the factory creates
     * @param classToInstantiate  the Class to instantiate each time in the factory
     * @param paramTypes  parameter types for the constructor, can be null
     * @param args  the arguments to pass to the constructor, can be null
     * @return the <code>reflection</code> factory
     * @throws NullPointerException if the classToInstantiate is null
     * @throws IllegalArgumentException if the paramTypes and args don't match
     * @throws IllegalArgumentException if the constructor doesn't exist
     */
    public static <T> Factory<T> instantiateFactory(final Class<T> classToInstantiate, final String paramTypes,
                                                    final String... args) {
        return InstantiateFactory.instantiateFactory(classToInstantiate, paramTypes, args);
    }

}
