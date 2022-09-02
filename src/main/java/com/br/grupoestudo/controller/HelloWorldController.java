package com.br.grupoestudo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {
    @GetMapping
    public String sayHelloWorld(){
        return "O mundo não é um mar de rosas; é um lugar sujo, um lugar cruel, que não quer saber o quanto você é durão. Vai botar você de joelhos e você vai ficar de joelhos para sempre se você deixar. Você, eu, ninguém vai bater tão forte como a vida, mas não se trata de bater forte. Se trata de quanto você aguenta apanhar e seguir em frente, o quanto você é capaz de aguentar e continuar tentando. É assim que se consegue vencer.\n" +
                "\n" +
                "Agora se você sabe do teu valor, então vá atrás do que você merece, mas tem que estar preparado para apanhar. E nada de apontar dedos, dizer que você não consegue por causa dele ou dela, ou de quem quer que seja. Só covardes fazem isso e você não é covarde, você é melhor que isso." +
                "\n arriegua";
    }
    @GetMapping("arthur")
    public String sayHelloArthur(){
        return "salve arthur";
    }
}
