package vault;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App{
		
	@Value("${spring.datasource.master.username}")
	public String username;
	
	@PostConstruct
	private void print() {
		System.out.println("postConstrue property----------------> " + username);
	}
	
	@Bean
	public String bean() {
		System.out.println("bean");
		return "";
	}
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
