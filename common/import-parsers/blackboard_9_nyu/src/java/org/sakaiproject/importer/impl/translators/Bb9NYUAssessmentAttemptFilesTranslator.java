package org.sakaiproject.importer.impl.translators;

import org.sakaiproject.importer.api.IMSResourceTranslator;
import org.sakaiproject.importer.api.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Bb9NYUAssessmentAttemptFilesTranslator implements
		IMSResourceTranslator {

	public String getTypeName() {
		return "course/x-bb-attemptfiles";
	}

	public boolean processResourceChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	public Importable translate(Node resourceNode, Document descriptor,
			String contextPath, String archiveBasePath) {
		// TODO Auto-generated method stub
		return null;
	}

}
