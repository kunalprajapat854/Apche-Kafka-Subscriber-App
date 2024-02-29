package in.kunal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.kunal.binding.Order;
import in.kunal.constants.Appconstansts;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@KafkaListener(topics = Appconstansts.Topic , groupId = "kunal_order_topic")
	public void sendmsg(String order) {
		System.out.print("MSG Received from Kafka");
		System.out.println(order);
	}

}
