package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vorname Nachname (vorname.nachname@dataphone.at)
 * @since ${DATE}
 */
@SpringBootApplication
@RestController
@Slf4j
public class Main {

    @GetMapping("/")
    public String runImage(){
        return "docker image created and running ...";
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world 1!");
        System.out.println("Hello world 2!");
        System.out.println("Hello world 4!");

        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }
        try{
            SpringApplication.run(Main.class, args);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}