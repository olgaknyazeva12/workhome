package pack;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ApiMethods {
	HttpClient client = HttpClientBuilder.create().build();
	public String token = "fd6d326d87dacfba5f3c6551e3d9792472ab48d803cb68c5d12ef278bdab242569f3cfaffb932a184c44d";
	public String userId = "135766565";
	public String message = "M!";
	public String editedMessage = "Mu1";
	public String randomId = "123123";
	public String photoId = "photo135766565_456239930";
	public String tockenVersion = "5.92";
	public String urlForSendMethod = "https://api.vk.com/method/messages.send?";
	public String urlForEditMethod = "https://api.vk.com/method/messages.edit?";
	public String ulrForCheckMessageSend = "https://api.vk.com/method/messages.getById?";
	public String urlForDeleteMethod = "https://api.vk.com/method/messages.delete?";

	public String sendMessage() throws ClientProtocolException, IOException, URISyntaxException {
		URIBuilder builder = new URIBuilder(urlForSendMethod);
		builder.setParameter("access_token", token).setParameter("user_id", userId).setParameter("message", message)
				.setParameter("random_id", randomId).setParameter("v", tockenVersion);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String yourResponse = EntityUtils.toString(response.getEntity());
		String responseSendedMessageString = yourResponse.replaceAll("[^0-9]", "");
		return responseSendedMessageString;
	}

	public String editMessage() throws ClientProtocolException, IOException, URISyntaxException {
		URIBuilder builder = new URIBuilder(urlForEditMethod);
		builder.setParameter("access_token", token).setParameter("peer_id", userId)
				.setParameter("message", editedMessage).setParameter("message_id", sendMessage())
				.setParameter("v", tockenVersion);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String yourResponse = EntityUtils.toString(response.getEntity());
		String responseEditedMessageString = yourResponse.replaceAll("[^0-9]", "");
		System.out.println(responseEditedMessageString);
		return responseEditedMessageString;

	}

	public String checkMessageSend() throws ClientProtocolException, IOException, URISyntaxException {
		URIBuilder builder = new URIBuilder(ulrForCheckMessageSend);
		builder.setParameter("access_token", token).setParameter("message_ids", sendMessage()).setParameter("v",
				tockenVersion);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String yourResponse = EntityUtils.toString(response.getEntity());
		return yourResponse;

	}

	public String deleteMessage() throws ClientProtocolException, IOException, URISyntaxException {
		URIBuilder builder = new URIBuilder(urlForDeleteMethod);
		builder.setParameter("access_token", token).setParameter("message_ids", sendMessage()).setParameter("v",
				"5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String yourResponse = EntityUtils.toString(response.getEntity());
		String responseEditedMessageString = yourResponse.replaceAll("[^0-9]", "");
		return responseEditedMessageString;
	}

	public String sendPhotoMessage() throws ClientProtocolException, IOException, URISyntaxException {
		URIBuilder builder = new URIBuilder(urlForSendMethod);
		builder.setParameter("access_token", token).setParameter("user_id", userId).setParameter("message", message)
				.setParameter("attachment", photoId).setParameter("random_id", randomId)
				.setParameter("v", tockenVersion);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String yourResponse = EntityUtils.toString(response.getEntity());
		return yourResponse;
	}

	public Integer transformFromStringToInteger(String yourString) {
		return Integer.parseInt(yourString);
	}
}
