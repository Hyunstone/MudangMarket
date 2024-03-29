package gachon.mudang.member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import gachon.mudang.member.domain.Member;
import gachon.mudang.member.domain.MemberRole;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
public class MemberJoinRequest {


    @NotEmpty(message = "이메일 입력은 필수 입니다.")
    private String email;
    @NotEmpty(message = "비밀번호 입력은 필수 입니다.")
    private String password;
    @NotEmpty(message = "이름 입력은 필수 입니다.")
    private String name;
    @NotEmpty(message = "휴대폰 입력은 필수 입니다.")
    private String phone;
    @NotEmpty(message = "닉네임 입력은 필수 입니다.")
    private String nickname;

    // Member Join Request
    @Builder
    public MemberJoinRequest(String email, String password, String name, String phone, String nickname) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.nickname = nickname;
    }

    /*
    * Convert to Member entity
    * */
    public Member toMemberEntity(){
        return Member.builder()
                .email(email)
                .password(password)
                .nickName(nickname)
                .name(name)
                .phone(phone)
                .memberRole(MemberRole.ROLE_USER)
                .build();
    }

}
