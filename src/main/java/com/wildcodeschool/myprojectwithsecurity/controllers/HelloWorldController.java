package com.wildcodeschool.myprojectwithsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/avengers/assemble")
    public String advengers() {
        return "<h1>Avengers... Assemble</h1>\n" +
                "<br>" +
                "<a href=\"/index.html\">Home</a>";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        return "<h1>Liste des villes de WCS</h1>\n" +
                "<ul class=\"towns-list\">" +
                " <li>Amsterdam</a></li>" +
                " <li>Barcelone</a></li>" +
                " <li>Bruxelles</a></li>" +
                " <li>Bucarest</a></li>" +
                " <li>Lisbonne</a></li>" +
                " <li>Londres</a></li>" +
                " <li>Madrid</a></li>" +
                " <li>Paris</a></li>" +
                "</ul>" +
                "<br>" +
                "<a href=\"/index.html\">Home</a>";
    }
}
