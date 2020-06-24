package com.antonio112009.sociafyvk.test;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.OAuthException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.ServiceClientCredentialsFlowResponse;
import com.vk.api.sdk.objects.UserAuthResponse;

public class Test {

//    http://oauth.vk.com/authorize?client_id=7517165&display=page&redirect_uri=https://oauth.vk.com/blank.html&scope=groups,stats,offline,wall&response_type=code&v=5.110

    private static final Integer APP_ID = 7517165;
    private static final String CLIENT_SECRET = "ZVmcywUOnmmoLXVE9rvI";

    //accesstoken.
    private static final String SERVER_TOKEN = "0c9e88340c9e88340c9e88344e0cec3bd900c9e0c9e88345270b469c0f3fd353f3a63d7";

    private static final String REDIRECT_URI = "https://oauth.vk.com/blank.html";
    private static final String code = "d20095c43cde738815";

    TransportClient transportClient = HttpTransportClient.getInstance();
    VkApiClient vk = new VkApiClient(transportClient);

    private static int communityId = -196467041;
    private static String communityToken = "22caabf4369003c81306747e01de0dd561167c43b60b621206281efc17d2eac031901a11ac0af03783356";

    public void test(){
        try {
//            UserAuthResponse authResponse = vk.oAuth()
//                        .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
//                        .execute();

//            System.out.println(authResponse.getAccessToken());
//            UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
            UserActor actor = new UserActor(31040170 ,"d531e177312cc046204a03eec45fa3af5aae723a39be6c6478318c292aa602bc4034c20f4a030632c3734");

//            vk.wall()
//                    .post(actor)
//                    .message("test")
////                    .ownerId(31040170)
////                    .ownerId(196467041)
//                    .friendsOnly(true)
//                    .execute();


            vk.wall()
                    .post(actor)
                    .ownerId(communityId)
                    .fromGroup(true)
                    .message("тестим сейчас")
                    .execute();

            System.out.println(
                    vk.wall()
                    .get(actor)
                    .ownerId(communityId)
                    .execute());

        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new Test().test();
    }
}
