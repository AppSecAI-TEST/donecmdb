/*
 * Lokomo OneCMDB - An Open Source Software for Configuration
 * Management of Datacenter Resources
 *
 * Copyright (C) 2006 Lokomo Systems AB
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 * 
 * Lokomo Systems AB can be contacted via e-mail: info@lokomo.com or via
 * paper mail: Lokomo Systems AB, Sv�rdv�gen 27, SE-182 33
 * Danderyd, Sweden.
 *
 */
package org.onecmdb.dto.primitivetypes;

import javax.xml.datatype.XMLGregorianCalendar;


public class DateType extends DateAndTimeType {

	public String getUniqueName() {
		return ("xs:date");
	}

    /**
     * @see XMLGregorianCalendar#getYear()()
     */
    public int getYear() {
        XMLGregorianCalendar cal = getCalendar();
        return cal.getYear();
    }
    public void setYear(int year) {
        XMLGregorianCalendar cal = getCalendar();
        cal.setYear(year);
        
    }
    
    
    /** 
     * @see XMLGregorianCalendar#getMonth()()
     */
    public int getMonth() {
        XMLGregorianCalendar cal = getCalendar();
        return cal.getMonth();
    }
    public void setMonth(int month) {
        XMLGregorianCalendar cal = getCalendar();
        cal.setMonth(month);
    }

    /**
     * @see XMLGregorianCalendar#getDay()
     */
    public int getDay() {
        XMLGregorianCalendar cal = getCalendar();
        return cal.getDay(); 
    }
    public void setDay(int day) {
        XMLGregorianCalendar cal = getCalendar();
        cal.setDay(day); 
    }


    
}
   
