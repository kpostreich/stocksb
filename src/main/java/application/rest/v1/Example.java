package application.rest.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class Example {

	 
  private static final double TEST_PRICE = 123.45;
  private String stock = "IBM";
  

  @RequestMapping(value = "/stockquotesb/{stock}")
  public ResponseEntity<?> getStockQuote(@PathVariable("stock") String stock) {
       
        return new ResponseEntity<String>("{\"Symbol\":\"" + stock + "\",\"price\":\"" + TEST_PRICE +"\"}", HttpStatus.OK);
  }

}
