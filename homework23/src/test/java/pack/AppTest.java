package pack;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testForSendedMessage() throws ClientProtocolException, IOException, URISyntaxException {
		ApiMethods api = new ApiMethods();
		Integer compareResult = 100000000;
		Assert.assertNotEquals(compareResult, api.transformFromStringToInteger(api.sendMessage()));

	}

	@Test
	public void testForEditedMessage() throws ClientProtocolException, IOException, URISyntaxException {
		ApiMethods api = new ApiMethods();
		Assert.assertNotNull(api.editMessage());

	}

	@Test
	public void testForCheckSendMessage() throws ClientProtocolException, IOException, URISyntaxException {
		ApiMethods api = new ApiMethods();
		Assert.assertNotNull(api.checkMessageSend());
	}

	@Test
	public void testForDeletedMessage() throws ClientProtocolException, IOException, URISyntaxException {
		ApiMethods api = new ApiMethods();
		String comparedResult = "1";
		api.deleteMessage();
		Assert.assertNotEquals(comparedResult, api.deleteMessage());
	}

	@Test
	public void testForSendPhotoMessage() throws ClientProtocolException, IOException, URISyntaxException {
		ApiMethods api = new ApiMethods();
		Assert.assertNotNull(api.sendPhotoMessage());

	}
}
