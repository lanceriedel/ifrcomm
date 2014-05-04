package com.hivedata.mobileappserver.webapp.resources;


import com.hivedata.mobileappserver.webapp.pojo.ClearanceComm;
import com.hivedata.mobileappserver.webapp.view.ExperimentSearchAllView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/searchexperiment")
@Produces(MediaType.TEXT_HTML)
public class TemplatedExperimentSearchResource {


    public TemplatedExperimentSearchResource() {
    }

    @GET
    @Path("search")
    public ExperimentSearchAllView search() {
        try {

            ClearanceComm comm = new ClearanceComm();

            ExperimentSearchAllView view = new ExperimentSearchAllView(comm);
            return view;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
