package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DestinationController {
    private final UserRepository userRepository;

    public DestinationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final Destination tmp1 = new Destination("Caribbean", 32.4);
    private final Destination tmp2 = new Destination("Australia", 35.1);

    private final List<Destination> destination = new ArrayList<Destination>();

    @GetMapping("/api/travels")
    @ResponseBody
    public List<Destination> getTravels(@RequestParam String userName) {
        User tmp = userRepository.getUserFromUserName(userName);
        destination.add(tmp1);
        destination.add(tmp2);
        System.out.println(tmp.getUserEmail());
        return destination;
    }

}
