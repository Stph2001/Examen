package com.backendtestapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class T_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "tx_uid")
    private String uid;

    @Column(name = "tx_user")
    private String user;

    @Column(name = "tx_email")
    private String email;

    @Column(name = "tx_pass")
    private String pass;

    @Column(name = "tx_rol")
    private String rol;

    @Column(name = "tx_fullName")
    private String fullName;

    @Column(name = "tx_avatar")
    private String avatar;
}