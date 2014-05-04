package com.hivedata.mobileappserver.webapp.view;

/**
 * Created with IntelliJ IDEA.
 * User: lance
 * Date: 9/26/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */

import com.hivedata.mobileappserver.webapp.pojo.ClearanceComm;
import com.yammer.dropwizard.views.View;

public class ExperimentSearchAllView extends View {
    private ClearanceComm comm;

    public ExperimentSearchAllView(ClearanceComm comm) {

        super("experimentSearchView.ftl");
        this.comm = comm;
    }

    public ClearanceComm getComm() {
        return comm;
    }


}