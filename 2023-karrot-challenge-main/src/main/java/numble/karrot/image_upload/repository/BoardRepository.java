package numble.karrot.image_upload.repository;

import numble.karrot.image_upload.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}