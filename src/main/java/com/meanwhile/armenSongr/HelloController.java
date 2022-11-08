package com.meanwhile.armenSongr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String greet(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model m) {
        m.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/capitalize/hello")
    public String capitalizeGreet(@RequestParam(value = "name", required = false, defaultValue = "Planet") String name, Model m) {
        m.addAttribute("name", name);
        return "caps";
    }
    @GetMapping("/model/{albums}")
    public String displayAlbums(@PathVariable String albums, Model m) {
        Album album1 = new Album("Frank Zappa","You Are What You Is",12,45.00,
                "https://i.discogs.com/8HrGFLYHx4Txd3VT5vJCUxuESlDD1lXdb1nSXxAq6wo/rs:fit/g:sm/q:90/h:595/w:600/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9SLTQwODYz/MTctMTM1NDc2ODIx/Mi05MTA4LmpwZWc.jpeg");
        Album album2 = new Album("David Bowie","Ziggy Stardust",10,38.00,
                "https://m.media-amazon.com/images/I/81eVnOh4UJL._SX522_.jpg");
        Album album3 = new Album("Stevie Wonder","Talking Book",9,40.00,
                "https://media.pitchfork.com/photos/6217c309de5b64edcb46d267/1:1/w_320,c_limit/Stevie_Wonder_Talking_Book_cover_art.jpg");
        Album[] arrayAlbums = new Album[3];
        arrayAlbums[0] = album1;
        arrayAlbums[1] = album2;
        arrayAlbums[2] = album3;

        m.addAttribute("albums", arrayAlbums); // "name" is how we target the data in template

        return "Albums.html";
    }
}
