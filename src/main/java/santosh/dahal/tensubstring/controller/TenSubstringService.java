/**
 * 
 */
package santosh.dahal.tensubstring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

/**
 * @author santosh dahal
 *
 */
@Service
public class TenSubstringService {

	public List<Integer> getTenSubString(String number) {
		List<Integer> list = new ArrayList<>();
		if(checkPattern(number)){
			number = number.replaceAll("\"","");
			System.out.println(number);
			int tempNum = Integer.parseInt(number);
			if(checkTenSubstring(tempNum)){
				list.add(tempNum);
				return list;
			}
		}else {	
			if(isNumeric(number)){
				for(int i=0;i<Integer.parseInt(number);i++){
					if(checkTenSubstring(i)){
						list.add(i);
					}
				}
			}			
		}
		
		return list;
	}
	
	public boolean checkTenSubstring(int num){
		String temp = num+"";
		int sum = 0;
		int i = 0;
		int j = i;
		while(i<temp.length()){
			sum += Integer.parseInt(temp.charAt(i)+"");
			System.out.println("sum"+sum);			
			if(sum==10){
				if(i==temp.length()-1) break; 
				sum = 0;
				j++;
				i=j;
				continue;
			}else if(sum<10){
				if(i==temp.length()-1) return false;
				i++;
				continue;
			}else{
				return false;
			}
			
		}		
		return true;
	}
	
	public boolean checkPattern(String number){
		return number.matches("\"[0-9]*\"");
	}
	
	public boolean isNumeric(String number){
		return number.matches("[0-9]+");
	}

}
