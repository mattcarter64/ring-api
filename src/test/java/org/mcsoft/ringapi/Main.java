package org.mcsoft.ringapi;

import lombok.extern.slf4j.Slf4j;
import org.mcsoft.ringapi.model.Location;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) throws Exception {

        // only argument for now is the refresh token
        if (args != null && args.length > 0) {
            RingApi restApi = new RingApi(args[0]);

            List<Location> locations = restApi.getLocations();

            log.info("Locations=" + locations);

//            log.info("locations={}", restApi.fetchAndBuildLocations());
        }
    }
}