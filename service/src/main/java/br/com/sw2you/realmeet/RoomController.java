package br.com.sw2you.realmeet;

import br.com.sw2you.realmeet.api.facade.RoomsApi;
import br.com.sw2you.realmeet.api.model.Room;
import java.util.concurrent.CompletableFuture;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController implements RoomsApi {

    @Override
    public CompletableFuture<ResponseEntity<Room>> listRooms(Long id) {
        Room room = new Room().id(1l).name("Room #1");

        return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(room));
    }
}
