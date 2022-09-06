package io.github.jlmageski.innovea.rest;


import com.kwabenaberko.newsapilib.models.Article;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/")
public class InnoveaController {

    @GetMapping("{variavel}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Article> obterTodos(@PathVariable String variavel){
        return ListArticle.main(variavel);

    }

}
