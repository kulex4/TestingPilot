package com.itrex;

import com.itrex.comparators.EventInfoComparator;
import com.itrex.utils.EventsRouterBean;
import com.itrex.utils.FileHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.itrex")
public class PilotProjectApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(PilotProjectApplication.class);

    @Autowired
    private EventsRouterBean eventsRouterBean;

    @Autowired
    private EventInfoComparator eventInfoComparator;

    @Autowired
    private FileHelper fileHelper;

	public static void main(String[] args) {
		SpringApplication.run(PilotProjectApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        if(args == null) {
            args = fileHelper.readCSVFileNames();
        }
        for (String filePath : args) {
            eventsRouterBean.chooseParserByFilePath(filePath);
        }
        eventInfoComparator.compare();
    }
}
