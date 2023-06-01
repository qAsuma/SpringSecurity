package springsecurity.asumamaven.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person  {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Size(min = 2,max = 100,message = "name should be 2 to 100 symbols")
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;



}
