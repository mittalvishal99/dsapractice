import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HCAppinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("in get root congif");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("in get servlet config");
		Class arr[]= {horoscope_matcher_config.class};
		
		return arr;
		}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("in get servlet mapping");
		String arr[]= {"/"};
		return arr;
	}

}
