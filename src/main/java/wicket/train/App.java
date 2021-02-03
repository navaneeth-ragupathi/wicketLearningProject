package wicket.train;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Hello world!
 *
 */
public class App extends WebApplication
{
	@Override
    public Class<? extends Page> getHomePage() {
        return HelloWorld.class;
    }
}
