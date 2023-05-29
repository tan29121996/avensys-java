package findmaxvalue;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.java.learnspringframework.game.GameRunner;
import com.java.learnspringframework.game.GamingApplication;

interface DataProvider {
	int[] provideData();
}

@Component
@Primary
class FirstDataCollector implements DataProvider {
	public int[] provideData() {
		return new int[] {10, 20, 30, 40, 50};
	}
}

@Component
class SecondDataCollector implements DataProvider {
	public int[] provideData() {
		return new int[] {1, 3, 5, 7, 9};
	}
}

@Component
class BusinessCalculator {
	DataProvider dataProvider;
	
	@Autowired
	public BusinessCalculator(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}

	public int findMaxValue() {
		return Arrays.stream(dataProvider.provideData()).max().orElse(0);
	}

}

@Configuration
@ComponentScan
public class FindMaxValueApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(FindMaxValueApplication.class))
		{
			var maxValue = context.getBean(BusinessCalculator.class).findMaxValue();
			System.out.println("The max value of the array is " + maxValue);
		}
		catch (BeansException e){
			e.printStackTrace();
		}

	}

}
