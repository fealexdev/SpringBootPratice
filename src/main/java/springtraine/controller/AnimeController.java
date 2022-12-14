package springtraine.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springtraine.domain.Anime;
import springtraine.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
public class AnimeController {
    @Autowired
    private DateUtil dateUtil;
    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Demon slayer"), new Anime ("Darling"));
    }
}
