package info.m2sj.ehcachetest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TestResource {
    private final TestService testService;

    @GetMapping("/names/{prefix}")
    public List<String> getName(@PathVariable String prefix) {
       return testService.findNames(prefix);
    }
}
