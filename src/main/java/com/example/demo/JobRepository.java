package com.example.demo;
/*This acts as your pipeline to the database
* has built in methods that you can use to save,locate,and delete data
*
* */
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long>{
}
