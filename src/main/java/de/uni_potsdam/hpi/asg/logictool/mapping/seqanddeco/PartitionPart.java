package de.uni_potsdam.hpi.asg.logictool.mapping.seqanddeco;

/*
 * Copyright (C) 2015 Norman Kluge
 * 
 * This file is part of ASGlogic.
 * 
 * ASGlogic is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ASGlogic is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ASGlogic.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Set;

import de.uni_potsdam.hpi.asg.logictool.stg.model.Signal;
import net.sf.javabdd.BDD;

public class PartitionPart {

    private Set<Signal> part;
    private BDD         bdd;

    public PartitionPart(Set<Signal> part) {
        this.part = part;
    }

    public BDD getBdd() {
        return bdd;
    }

    public Set<Signal> getPart() {
        return part;
    }

    public void setBdd(BDD bdd) {
        this.bdd = bdd;
    }

    @Override
    public String toString() {
        return part.toString();
    }
}
