package com.whoimi;

/*import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

/**
 * @author whoimi
 */
@SpringBootApplication
@EnableJdbcRepositories
@EnableTransactionManagement
@RestController()
public class MgrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MgrApplication.class, args);
    }
/*    @Bean
    public CommandLineRunner init(final RepositoryService repositoryService,
                                  final RuntimeService runtimeService,
                                  final TaskService taskService) {

        return strings -> {
				System.out.println("Number of process definitions : " + repositoryService.createProcessDefinitionQuery().count());
				System.out.println("Number of tasks : " + taskService.createTaskQuery().count());
				runtimeService.startProcessInstanceByKey("oneTaskProcess");
				System.out.println("Number of tasks after process start: "+taskService.createTaskQuery().count());
        };
    }*/
}
