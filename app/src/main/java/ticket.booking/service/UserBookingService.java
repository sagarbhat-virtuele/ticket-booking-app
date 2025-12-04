package ticket.booking.service;


import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBookingService {
    private final ObjectMapper objectMapper = new ObjectMapper();

    private List<User> userList;

    private User user;

    private final String USER_FILE_PATH = "app/src/main/java/ticket/booking/localDb/users.json";

    public UserBookingService(User user) throws IOException {
        this.user = user;
        File users = new File(USER_FILE_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});


    }
}
