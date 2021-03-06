/*-
 * Copyright (C) 2014 Riccardo Muzzì.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.polito.tellmefirst.jaxrs;

public class ClassifyInput {
	private String text, lang;
	private Integer numTopics;

	public String getText() {
		return text;
	}

	public void setText(String s) {
		text = s;
	}

	public Integer getNumTopics() {
		return numTopics;
	}

	public void setNumTopics(Integer s) {
		numTopics = s;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String s) {
		lang = s;
	}
}
