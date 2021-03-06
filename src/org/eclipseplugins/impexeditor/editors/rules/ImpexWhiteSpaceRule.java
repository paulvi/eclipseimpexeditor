/*******************************************************************************
 * Copyright 2014 Youssef EL JAOUJAT.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.eclipseplugins.impexeditor.editors.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipseplugins.impexeditor.editors.ImpexScanner;

public class ImpexWhiteSpaceRule extends WhitespaceRule {

	public ImpexWhiteSpaceRule(IWhitespaceDetector detector) {
		super(detector);
	}

	public IToken evaluate(ICharacterScanner scanner) {
		IToken token=super.evaluate(scanner);
		if(token!=Token.UNDEFINED){
			((ImpexScanner)scanner).setState("data");
		}
		 return token;
	}
	
	
}
