/*
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
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
 * License Terms
 */

import org.junit.Test;
import org.junit.Assert;

import gov.nasa.jpl.imce.omf.schema.tables.IRIScalarRestrictionAxiom;
import gov.nasa.jpl.imce.omf.schema.tables.IRIScalarRestrictionAxiomJava;
import gov.nasa.jpl.imce.omf.schema.tables.IRIScalarRestrictionAxiomHelper;

import scala.compat.java8.OptionConverters;

import java.util.Optional;

public class IRIScalarRestrictionAxiomEmptyTest {

    @Test
    public void creationTest() {
        String graphUUID = "01234-abcde-4569-fehi";
        String uuid = "12345-BCDEF-6789A-012345";
        Optional length = Optional.empty();
        Optional maxLength = Optional.empty();
        Optional minLength = Optional.empty();
        Optional pattern = Optional.empty();
        String restrictedScalarUUID = "4567-2345-ABCD-1245";
        String scalarUUID = "1245-ABCD-2345-4567";

        IRIScalarRestrictionAxiom w1 = IRIScalarRestrictionAxiomJava.javaIRIScalarRestrictionAxiom(graphUUID, uuid, length, maxLength, minLength, pattern, restrictedScalarUUID, scalarUUID);

        Assert.assertEquals(w1.pattern(), OptionConverters.toScala(pattern));
        String s1 = IRIScalarRestrictionAxiomHelper.toJSON(w1);
        String t1 = String.format(
                "{\"graphUUID\":\"%s\",\"uuid\":\"%s\",\"length\":%s\",\"minLength\":%s\",\"maxLength\":%s\",\"pattern\":%s\",\"restrictedScalarUUID\":\"%s\",\"scalarUUID\":\"%s\"}",
                graphUUID, uuid, OptionConverters.toScala(length), OptionConverters.toScala(minLength), OptionConverters.toScala(maxLength), OptionConverters.toScala(pattern), restrictedScalarUUID, scalarUUID);
        Assert.assertEquals(t1, s1);

        IRIScalarRestrictionAxiom r1 = IRIScalarRestrictionAxiomHelper.fromJSON(s1);
        Assert.assertEquals(w1.graphUUID(), r1.graphUUID());
        Assert.assertEquals(w1.uuid(), r1.uuid());
        Assert.assertEquals(w1.length(), r1.length());
        Assert.assertEquals(w1.maxLength(), r1.maxLength());
        Assert.assertEquals(w1.minLength(), r1.minLength());
        Assert.assertEquals(w1.restrictedScalarUUID(), r1.restrictedScalarUUID());
        Assert.assertEquals(w1.scalarUUID(), r1.scalarUUID());
        Assert.assertTrue(w1.equals(r1));
    }
}