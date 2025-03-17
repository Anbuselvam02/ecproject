import java.io.IOException;  
import java.io.PrintWriter;  
  
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;  
  
public class MyFilter implements Filter{  
  
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
    FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=resp.getWriter();  
    out.print("filter is invoked before");  
          
    chain.doFilter(req, resp);//sends request to next resource  
          
    out.print("filter is invoked after");  
    }  
    public void destroy() {}  
}  