package org.example.config;



import org.example.audit.Revision;
import org.hibernate.envers.RevisionListener;


public class CustomRevisionListener implements RevisionListener {
//encargado de hacer revisiones
    public void newRevision(Object revisionEntity) {

        final Revision revision = (Revision) revisionEntity;

    }

}
