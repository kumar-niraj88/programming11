package lifecycleofSpring;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MianClass {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(lifecycleConfig.class) ;
		
		lifecycle l = (lifecycle) context.getBean("l");
		
		l.save();
	}
}


int arr[] = {1,2,3,4,5};  // 3


int n = arr.length;
for(int i = 0 ;i<arr.length;i++ ) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i] > arr[j]) {
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j] = temp;
		}
	}
	System.out.println(arr[n-2]);
	
}