package gachon.mudang.member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class MemberUpdateRequest {
    private MultipartFile profile;
    private String nickName;

    // Member Update Request
    @Builder
    public MemberUpdateRequest(@Nullable MultipartFile profile, String nickName) {
        this.profile = profile;
        this.nickName = nickName;
    }

}
