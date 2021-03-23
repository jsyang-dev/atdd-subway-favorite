package nextstep.subway.member.domain;

import nextstep.subway.auth.domain.AuthMember;

public class LoginMember implements AuthMember {

    private final Long id;
    private final String email;
    private final String password;
    private final Integer age;

    public static AuthMember of(Member member) {
        return new LoginMember(member.getId(), member.getEmail(), member.getPassword(), member.getAge());
    }

    public LoginMember(Long id, String email, String password, Integer age) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    @Override
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
