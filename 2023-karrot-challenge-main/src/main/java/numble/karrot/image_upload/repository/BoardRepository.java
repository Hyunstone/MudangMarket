package numble.karrot.image_upload.repository;

import com.example.img_test.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
