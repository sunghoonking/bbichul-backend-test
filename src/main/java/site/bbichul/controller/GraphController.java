package site.bbichul.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.bbichul.security.UserDetailsImpl;
import site.bbichul.service.GraphService;

import java.util.Map;


@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class GraphController {

    private final GraphService graphService;

    @GetMapping("/users/graph")
    public Map<String, Object> drawLineGraph(@RequestParam String type,@RequestParam Integer year, @RequestParam Integer month, @AuthenticationPrincipal UserDetailsImpl userDetails) {

        return graphService.drawLineGraph(type, year, month, userDetails.getUser());

    }

}
