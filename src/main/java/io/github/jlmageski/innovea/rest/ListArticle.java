package io.github.jlmageski.innovea.rest;

import com.kwabenaberko.newsapilib.NewsApiClient;
import com.kwabenaberko.newsapilib.models.Article;
import com.kwabenaberko.newsapilib.models.request.EverythingRequest;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;

import java.util.List;

public class ListArticle {

    private static List<Article> a = null;

    public static List<Article> main(String pesquisa){

        NewsApiClient newsApiClient = new NewsApiClient("774624f55bc646ceb10293cb580896d5");
        newsApiClient.getEverything(
        new EverythingRequest.Builder()
                .q(pesquisa)
                .build(),
                new NewsApiClient.ArticlesResponseCallback() {
                    @Override
                    public void onSuccess(ArticleResponse response) {

                        ListArticle.a = response.getArticles();
                                //(1,response.getArticles().get(num).getAuthor() +" "+ response.getArticles().get(num).getTitle() +" "+  response.getArticles().get(num).getDescription());

                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        System.out.println(throwable.getMessage());
                    }
                }
		);
        return ListArticle.a;
    }

}
