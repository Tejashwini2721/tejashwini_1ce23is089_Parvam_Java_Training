package com.gaming.entity;
import jakarta.persistence.*;
@Entity
@Table(name="games")

public class Game {
	@Id
	@GeneratedValues(strategy=GenerationType.IDENTITY)
	private Long gameId;
	@Column(nullable= false,length =100)
    private String gameName;
	@Column(nullable= false,precision=10,scale=2)
	private Double costPerHour;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false,length =20)
	private Status status;
	public enum Status {
		AVAILABLE,
		UNAVAILABLE
	}
}
